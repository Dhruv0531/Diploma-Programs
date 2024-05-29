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
            sql = "DELETE FROM emp_detail` WHERE emp_id=%s"
            val = (emp_id)
            mycursor.execute(sql, val)
            mysql.commit()
            clear_entries()
            messagebox.showinfo(
                "Success", "Employee Record Deleted Successfully")
            delete.destroy()
            root.deiconify()
        else:
            messagebox.showinfo(
                "Error", "Employee Record does not exixts")

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
