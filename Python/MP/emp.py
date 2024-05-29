from tkinter import *
from tkinter import messagebox
import pymysql as mq
import re

mysql = mq.connect(host="localhost", user="root", password="", database="emp")
mycursor = mysql.cursor()


def emp_add():
    def back():
        add.destroy()
        root.deiconify()

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
            # Check if employee ID already exists in the database
            mycursor.execute(
                "SELECT emp_id FROM emp_details WHERE emp_id = %s", (emp_id,))
            existing_emp = mycursor.fetchone()
        if existing_emp:
            messagebox.showerror("Error", "Employee ID already exists")
        else:
            # Insert data into the database
            sql = "INSERT INTO emp_details (emp_id, name, phone, email, age, gender, desi, salary) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)"
            val = (emp_id, emp_name, emp_phone, emp_email, emp_age,
                   emp_gender, emp_designation, emp_salary)
            mycursor.execute(sql, val)
            mysql.commit()
            # Clear entry fields after submission
            clear_entries()
            messagebox.showinfo(
                "Success", "Employee Record Added Successfully")
            add.destroy()
            root.deiconify()

    def clear_entries():
        id_entry.delete(0, END)
        name_entry.delete(0, END)
        age_entry.delete(0, END)
        phone_entry.delete(0, END)
        email_entry.delete(0, END)
        designation_entry.delete(0, END)
        salary_entry.delete(0, END)
        root.withdraw()

    root.withdraw()
    add = Tk()
    add.title("Employee Management System - Add Employee Details")
    add.geometry("800x800")  # Set window size here
    add.minsize(600, 400)
    add.maxsize(800, 800)
    heading_label = Label(
        add, text="Enter Employee Details", font=("Times New Roman", 30, "bold"), padx=30, pady=30)
    heading_label.grid(row=0, column=2, columnspan=2)

    id_label = Label(add, text="ID", font=("Times New Roman", 20))
    id_label.grid(row=1, column=1, padx=10, pady=10)
    id_entry = Entry(add, font=("Times New Roman", 20))
    id_entry.grid(row=1, column=2, padx=10, pady=10)

    name_label = Label(add, text="Name", font=("Times New Roman", 20))
    name_label.grid(row=2, column=1, padx=10, pady=10)
    name_entry = Entry(add, font=("Times New Roman", 20))
    name_entry.grid(row=2, column=2, padx=10, pady=10)

    age_label = Label(add, text="Age", font=("Times New Roman", 20))
    age_label.grid(row=3, column=1, padx=10, pady=10)
    age_entry = Entry(add, font=("Times New Roman", 20))
    age_entry.grid(row=3, column=2, padx=10, pady=10)

    phone_label = Label(add, text="Phone", font=("Times New Roman", 20))
    phone_label.grid(row=4, column=1, padx=10, pady=10)
    phone_entry = Entry(add, font=("Times New Roman", 20))
    phone_entry.grid(row=4, column=2, padx=10, pady=10)

    email_label = Label(add, text="Email", font=("Times New Roman", 20))
    email_label.grid(row=5, column=1, padx=10, pady=10)
    email_entry = Entry(add, font=("Times New Roman", 20))
    email_entry.grid(row=5, column=2, padx=10, pady=10)

    gender_label = Label(add, text="Gender", font=("Times New Roman", 20))
    gender_label.grid(row=6, column=1, padx=10, pady=10)
    gender_var = StringVar()
    gender_var.set("Male")
    male_radio = Radiobutton(
        add, text="Male", variable=gender_var, value="Male", font=("Times New Roman", 20))
    female_radio = Radiobutton(
        add, text="Female", variable=gender_var, value="Female", font=("Times New Roman", 20))
    male_radio.grid(row=6, column=2, sticky=W)
    female_radio.grid(row=6, column=3, sticky=W)

    designation_label = Label(
        add, text="Designation", font=("Times New Roman", 20))
    designation_label.grid(row=7, column=1, padx=10, pady=10)
    designation_entry = Entry(add, font=("Times New Roman", 20))
    designation_entry.grid(row=7, column=2, padx=10, pady=10)

    salary_label = Label(add, text="Salary", font=("Times New Roman", 20))
    salary_label.grid(row=8, column=1, padx=10, pady=10)
    salary_entry = Entry(add, font=("Times New Roman", 20))
    salary_entry.grid(row=8, column=2, padx=10, pady=10)

    back_btn = Button(add, text="Back", font=("Times New Roman", 20),
                      padx=5, pady=5, command=back)
    back_btn.grid(row=9, column=1, padx=10, pady=10)

    submit_btn = Button(add, text="Submit", font=("Times New Roman", 20),
                        padx=10, pady=10, command=submit)
    submit_btn.grid(row=9, column=2, padx=10, pady=10)

    add.mainloop()


def emp_view():
    def back():
        view.destroy()
        root.deiconify()
    root.withdraw()
    view = Tk()
    view.title("Employee Management System - View Employee Details")
    view.geometry("800x800")

    # Retrieve data from the database
    mycursor.execute("SELECT * FROM emp_details")
    rows = mycursor.fetchall()

    # Create headings
    headings = ["ID", "Name", "Phone", "Email",
                "Age", "Gender", "Designation", "Salary"]
    for col, heading in enumerate(headings):
        label = Label(view, text=heading, font=("Times New Roman", 20, "bold"))
        label.grid(row=0, column=col, padx=5, pady=5)

    # Insert data into table
    for row_idx, row_data in enumerate(rows, start=1):
        for col_idx, cell_data in enumerate(row_data):
            label = Label(view, text=cell_data, font=("Times New Roman", 15))
            label.grid(row=row_idx, column=col_idx, padx=5, pady=5)

    back_btn = Button(view, text="Back", font=("Times New Roman", 15),
                      padx=5, pady=5, command=back)
    back_btn.grid(row=9, column=1, padx=10, pady=10)

    view.mainloop()


def emp_delete():
    def back():
        delete.destroy()
        root.deiconify()

    def clear_entries():
        id_entry.delete(0, END)

    def submit():
        emp_id = id_entry.get()
        mycursor.execute(
            "SELECT emp_id FROM emp_details WHERE emp_id = %s", (emp_id,))
        existing_emp = mycursor.fetchone()
        if existing_emp:
            sql = "DELETE FROM emp_details WHERE emp_id=%s"
            val = (emp_id,)
            mycursor.execute(sql, val)
            mysql.commit()
            clear_entries()
            messagebox.showinfo(
                "Success", "Employee Record Deleted Successfully")
            delete.destroy()
            root.deiconify()
        else:
            messagebox.showinfo(
                "Error", "Employee Record does not exists")
            clear_entries()

    root.withdraw()
    delete = Tk()
    delete.title("Employee Management System - Delete Employee Details")
    delete.geometry("800x800")  # Set window size here
    delete.minsize(600, 400)
    delete.maxsize(800, 800)
    heading_label = Label(
        delete, text="Delete Employee Details", font=("Times New Roman", 30, "bold"), padx=30, pady=30)
    heading_label.grid(row=0, column=1, columnspan=2)

    id_label = Label(delete, text="Enter Employee ID to delete:",
                     font=("Times New Roman", 20))
    id_label.grid(row=4, column=1, padx=10, pady=10)
    id_entry = Entry(delete, font=("Times New Roman", 20))
    id_entry.grid(row=4, column=2, padx=10, pady=10)
    back_btn = Button(delete, text="Back", font=("Times New Roman", 20),
                      padx=5, pady=5, command=back)
    back_btn.grid(row=6, column=1, padx=10, pady=10)

    submit_btn = Button(delete, text="Submit", font=("Times New Roman", 20),
                        padx=10, pady=10, command=submit)
    submit_btn.grid(row=6, column=2, padx=10, pady=10)

    delete.mainloop()


def emp_update():
    def back():
        update.destroy()
        root.deiconify()

    def clear_entries():
        id_entry.delete(0, END)
        new_value_entry.delete(0, END)

    def submit():
        emp_id = id_entry.get()
        mycursor.execute(
            "SELECT emp_id FROM emp_details WHERE emp_id = %s", (emp_id,))
        existing_emp = mycursor.fetchone()
        field_to_update = update_var.get()
        new_value = new_value_entry.get()
        if existing_emp:
            if field_to_update == "Select Field":
                messagebox.showerror(
                    "Error", "Please select a field to update")

            if field_to_update == "Name":
                if not new_value.isalpha():
                    messagebox.showerror("Name Error", "Invalid Name")

                else:
                    sql = "UPDATE emp_details SET name = %s WHERE emp_id = %s"
            
            elif field_to_update == "Phone":
                if not new_value.isdigit() or len(new_value) != 10:
                    messagebox.showerror(
                        "Phone Error", "Invalid Phone Number (should be 10 digits)")
                else:
                    print("Updating phone number...")
                    sql = "UPDATE emp_details SET phone = %s WHERE emp_id = %s"

            elif field_to_update == "Email":
                if not re.match(r"[^@]+@[^@]+\.[^@]+", new_value):
                    messagebox.showerror("Email Error", "Invalid Email")
                else:
                    sql = "UPDATE emp_details SET email = %s WHERE emp_id = %s"
            
            elif field_to_update == "Age":
                if not new_value.isdigit() or int(new_value) <= 18:
                    messagebox.showerror("Age Error", "Invalid Age")
                else:
                    sql = "UPDATE emp_details SET age = %s WHERE emp_id = %s"
            
            elif field_to_update == "Designation":
                if not new_value.isalpha():
                    messagebox.showerror(
                        "Designation Error", "Invalid Designation")
                else:
                    sql = "UPDATE emp_details SET desi = %s WHERE emp_id = %s"
            
            elif field_to_update == "Salary":
                if not new_value.isdigit():
                    messagebox.showerror("Salary Error", "Invalid Salary")
                else:
                    sql = "UPDATE emp_details SET salary = %s WHERE emp_id = %s"

            try:
                mycursor.execute(sql, (new_value, emp_id))
                mysql.commit()
                messagebox.showinfo(
                    "Success", "Employee Record Updated Successfully")
                update.destroy()
                root.deiconify()
            except mq.Error as e:
                messagebox.showerror("Error", f"Error updating record: {e}")
        else:
            messagebox.showinfo(
                "Error", "Employee Record does not exist")
            clear_entries()

    root.withdraw()
    update = Tk()
    update.title("Employee Management System - Update Employee Details")
    update.geometry("800x800")
    update.minsize(600, 400)
    update.maxsize(800, 800)

    heading_label = Label(update, text="Update Employee Details", font=(
        "Times New Roman", 30, "bold"), padx=30, pady=30)
    heading_label.grid(row=0, column=1, columnspan=2)

    id_label = Label(update, text="Enter Employee ID:",
                     font=("Times New Roman", 20))
    id_label.grid(row=1, column=1, padx=10, pady=10)
    id_entry = Entry(update, font=("Times New Roman", 20))
    id_entry.grid(row=1, column=2, padx=10, pady=10)

    update_options = ["Select Field", "Name", "Phone",
                      "Email", "Age", "Designation", "Salary"]
    update_var = StringVar()
    update_var.set(update_options[0])  # Default value
    update_label = Label(
        update, text="Select Field to Update:", font=("Times New Roman", 20))
    update_label.grid(row=2, column=1, padx=10, pady=10)
    update_dropdown = OptionMenu(update, update_var, *update_options)
    update_dropdown.config(font=("Times New Roman", 20))
    update_dropdown.grid(row=2, column=2, padx=10, pady=10)

    new_value_label = Label(update, text="New Value:",
                            font=("Times New Roman", 20))
    new_value_label.grid(row=3, column=1, padx=10, pady=10)
    new_value_entry = Entry(update, font=("Times New Roman", 20))
    new_value_entry.grid(row=3, column=2, padx=10, pady=10)

    submit_btn = Button(update, text="Submit", font=(
        "Times New Roman", 20), padx=10, pady=10, command=submit)
    submit_btn.grid(row=4, column=2, padx=10, pady=10)

    back_btn = Button(update, text="Back", font=(
        "Times New Roman", 20), padx=5, pady=5, command=back)
    back_btn.grid(row=4, column=1, padx=10, pady=10)

    update.mainloop()


def exit_btn():
    root.destroy()


root = Tk()
root.geometry("800x800")
root.minsize(600, 400)
root.maxsize(800, 800)
root.title("Employee Management System")
heading_label = Label(
    text="Welcome to Employee Management System", font=("Times New Roman", 30, "bold"), padx=30, pady=30)
heading_label.pack(fill=X)

button_padding_y = 10

add_emp = Button(text="Add Employee Details", font=(
    "Times New Roman", 22), padx=57, pady=20, command=emp_add)
view_emp = Button(text="View Employee Details",
                  font=("Times New Roman", 22), padx=53, pady=20, command=emp_view)

delete_emp = Button(text="Delete Employee Details",
                    font=("Times New Roman", 22), padx=45, pady=20, command=emp_delete)

update_emp = Button(text="Update Employee Details",
                    font=("Times New Roman", 22), padx=42, pady=20, command=emp_update)

exit_btn = Button(text="Exit",
                  font=("Times New Roman", 22), padx=160, pady=20, command=exit_btn)


add_emp.pack(pady=10)
view_emp.pack(pady=10)
delete_emp.pack(pady=10)
update_emp.pack(pady=10)
exit_btn.pack(pady=10)

root.mainloop()
