from tkinter import *
from tkinter import messagebox
import re
import pymysql as mq

# Database connection
mysql = mq.connect(host="localhost", user="root", password="", database="emp")
mycursor = mysql.cursor()


def back():
    add.destroy()


def submit():
    # Retrieve data from entry fields
    emp_id = id_entry.get()
    emp_name = name_entry.get()
    emp_age = age_entry.get()
    emp_phone = phone_entry.get()
    emp_email = email_entry.get()
    emp_gender = gender_var.get()
    emp_designation = designation_entry.get()
    emp_salary = salary_entry.get()

    # Data Validation
    errors = []

    if not emp_id.isdigit():
        errors.append("Invalid ID")
    if not emp_name.replace(" ", "").isalpha():
        errors.append("Invalid Name")
    if not emp_age.isdigit() or int(emp_age) <= 18:
        errors.append("Age should be a number greater than 18")
    if not re.match(r"[^@]+@[^@]+\.[^@]+", emp_email):
        errors.append("Invalid Email")
    if not emp_phone.isdigit() or len(emp_phone) != 10:
        errors.append("Invalid Phone Number (should be 10 digits)")
    if not emp_designation.replace(" ", "").isalpha():
        errors.append("Invalid Designation")
    if not emp_salary.isdigit():
        errors.append("Invalid Salary")

    if errors:
        messagebox.showerror("Error", "\n".join(errors))
    else:
        # Insert data into the database
        sql = "INSERT INTO emp_details (emp_id, name, phone, email, age, gender, desi, salary) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)"
        val = (emp_id, emp_name, emp_phone, emp_email, emp_age,
               emp_gender, emp_designation, emp_salary)
        mycursor.execute(sql, val)
        mysql.commit()
        # Clear entry fields after submission
        clear_entries()
        messagebox.showinfo("Success", "Employee Record Added Successfully")
        add.destroy()


def clear_entries():
    id_entry.delete(0, END)
    name_entry.delete(0, END)
    age_entry.delete(0, END)
    phone_entry.delete(0, END)
    email_entry.delete(0, END)
    designation_entry.delete(0, END)
    salary_entry.delete(0, END)


add = Tk()
add.title("Employee Management System - Add Employee Details")
add.geometry("1500x800")

heading_label = Label(
    text="Enter Employee Details", font=("Times New Roman", 30, "bold"), padx=30, pady=30)
heading_label.grid(row=0, column=2)

id_label = Label(text="ID", font=("Times New Roman", 20))
id_label.grid(row=3, column=3, padx=10, pady=10)
id_entry = Entry(font=("Times New Roman", 20))
id_entry.grid(row=3, column=4, padx=10, pady=10)

name_label = Label(text="Name", font=("Times New Roman", 20))
name_label.grid(row=4, column=3, padx=10, pady=10)
name_entry = Entry(font=("Times New Roman", 20))
name_entry.grid(row=4, column=4, padx=10, pady=10)

age_label = Label(text="Age", font=("Times New Roman", 20))
age_label.grid(row=5, column=3, padx=10, pady=10)
age_entry = Entry(font=("Times New Roman", 20))
age_entry.grid(row=5, column=4, padx=10, pady=10)

phone_label = Label(text="Phone", font=("Times New Roman", 20))
phone_label.grid(row=6, column=3, padx=10, pady=10)
phone_entry = Entry(font=("Times New Roman", 20))
phone_entry.grid(row=6, column=4, padx=10, pady=10)

email_label = Label(text="Email", font=("Times New Roman", 20))
email_label.grid(row=7, column=3, padx=10, pady=10)
email_entry = Entry(font=("Times New Roman", 20))
email_entry.grid(row=7, column=4, padx=10, pady=10)

gender_label = Label(add, text="Gender", font=("Times New Roman", 20))
gender_label.grid(row=8, column=3, padx=10, pady=10)
gender_var = StringVar()
gender_var.set("Male")
male_radio = Radiobutton(
    add, text="Male", variable=gender_var, value="Male", font=("Times New Roman", 20))
female_radio = Radiobutton(
    add, text="Female", variable=gender_var, value="Female", font=("Times New Roman", 20))
male_radio.grid(row=8, column=4, sticky=W)
female_radio.grid(row=8, column=5, sticky=W)

designation_label = Label(text="Designation", font=("Times New Roman", 20))
designation_label.grid(row=9, column=3, padx=10, pady=10)
designation_entry = Entry(font=("Times New Roman", 20))
designation_entry.grid(row=9, column=4, padx=10, pady=10)

salary_label = Label(text="Salary", font=("Times New Roman", 20))
salary_label.grid(row=10, column=3, padx=10, pady=10)
salary_entry = Entry(font=("Times New Roman", 20))
salary_entry.grid(row=10, column=4, padx=10, pady=10)

back_btn = Button(text="Back", font=("Times New Roman", 20),
                  padx=5, pady=5, command=back)
back_btn.grid(row=12, column=3, padx=10, pady=10)

submit_btn = Button(text="Submit", font=("Times New Roman", 20),
                    padx=10, pady=10, command=submit)
submit_btn.grid(row=12, column=4, padx=10, pady=10)

add.mainloop()
