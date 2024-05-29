import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EmployeeManagementSystem {
    EmployeeManagementSystem() {
        JFrame home = new JFrame("Employee Management System");
        home.setSize(1920, 1080);
        home.setLayout(null);

        JLabel title = new JLabel("Welcome to Employee Management System");
        JButton add_emp = new JButton("Add Employee Details");
        JButton view_emp = new JButton("View Employee Details");
        JButton edit_emp = new JButton("Edit Employee Details");
        JButton search_emp = new JButton("Search Employee");
        JButton exit = new JButton("Exit");

        title.setBounds(425, 50, 700, 100);
        add_emp.setBounds(600, 150, 300, 75);
        view_emp.setBounds(600, 250, 300, 75);
        edit_emp.setBounds(600, 350, 300, 75);
        search_emp.setBounds(600, 450, 300, 75);
        exit.setBounds(600, 550, 300, 75);

        add_emp.setFocusPainted(false);
        view_emp.setFocusPainted(false);
        edit_emp.setFocusPainted(false);
        search_emp.setFocusPainted(false);
        exit.setFocusPainted(false);

        title.setFont(new Font("Times New Roman", Font.BOLD, 35));
        add_emp.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        view_emp.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        edit_emp.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        search_emp.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        exit.setFont(new Font("Times New Roman", Font.PLAIN, 22));

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        home.add(title);

        home.add(add_emp);
        home.add(view_emp);
        home.add(edit_emp);
        home.add(search_emp);
        home.add(exit);

        add_emp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.dispose();
                JFrame emp_add = new JFrame("Employee Management System - Add Employee");
                emp_add.setSize(1920, 1080);
                emp_add.setLayout(null);

                JLabel id = new JLabel("Enter Emp ID:");
                JTextField id_ip = new JTextField();
                JLabel id_er = new JLabel();

                JLabel name = new JLabel("Enter Name:");
                JTextField name_ip = new JTextField();
                JLabel name_er = new JLabel();

                JLabel phone = new JLabel("Enter Phone Number:");
                JTextField phone_ip = new JTextField();
                JLabel phone_er = new JLabel();

                JLabel email = new JLabel("Enter Email Address:");
                JTextField email_ip = new JTextField(30);
                JLabel email_er = new JLabel();

                JLabel age = new JLabel("Enter Age:");
                JTextField age_ip = new JTextField();
                JLabel age_er = new JLabel();

                JLabel gender = new JLabel("Select Gender:");
                JComboBox genderval = new JComboBox();
                genderval.addItem("Male");
                genderval.addItem("Female");
                genderval.setFocusable(false);

                JLabel desi = new JLabel("Enter Designation:");
                JTextField desi_ip = new JTextField();
                JLabel desi_er = new JLabel();

                JLabel sal = new JLabel("Enter Salary (Rs):");
                JTextField sal_ip = new JTextField();
                JLabel sal_er = new JLabel();

                JButton back = new JButton("Back");
                JButton submit = new JButton("Submit");

                id.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                id_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                id_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                name.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                name_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                name_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                phone.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                phone_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                phone_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                email.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                email_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                email_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                age.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                age_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                age_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                gender.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                genderval.setFont(new Font("Times New Roman", Font.PLAIN, 25));

                desi.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                desi_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                desi_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                sal.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                sal_ip.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                sal_er.setFont(new Font("Times New Roman", Font.PLAIN, 15));

                back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 20));

                id.setBounds(100, 50, 260, 50);
                id_ip.setBounds(350, 50, 260, 50);
                id_er.setBounds(350, 95, 260, 30);

                name.setBounds(100, 125, 260, 50);
                name_ip.setBounds(350, 125, 260, 50);
                name_er.setBounds(350, 165, 260, 30);

                phone.setBounds(100, 200, 260, 50);
                phone_ip.setBounds(350, 200, 260, 50);
                phone_er.setBounds(350, 240, 260, 30);

                email.setBounds(100, 275, 260, 50);
                email_ip.setBounds(350, 275, 260, 50);
                email_er.setBounds(350, 315, 260, 30);

                age.setBounds(100, 350, 260, 50);
                age_ip.setBounds(350, 350, 260, 50);
                age_er.setBounds(350, 390, 260, 30);

                gender.setBounds(100, 425, 260, 50);
                genderval.setBounds(350, 425, 260, 50);

                desi.setBounds(100, 500, 260, 50);
                desi_ip.setBounds(350, 500, 260, 50);
                desi_er.setBounds(350, 540, 260, 30);

                sal.setBounds(100, 575, 260, 50);
                sal_ip.setBounds(350, 575, 260, 50);
                sal_er.setBounds(350, 615, 260, 30);

                back.setBounds(100, 700, 250, 50);
                submit.setBounds(400, 700, 250, 50);

                id_er.setForeground(Color.red);
                name_er.setForeground(Color.red);
                phone_er.setForeground(Color.red);
                email_er.setForeground(Color.red);
                age_er.setForeground(Color.red);
                desi_er.setForeground(Color.red);
                sal_er.setForeground(Color.red);

                back.setFocusPainted(false);
                submit.setFocusPainted(false);

                emp_add.add(id);
                emp_add.add(id_ip);
                emp_add.add(id_er);
                emp_add.add(name);
                emp_add.add(name_ip);
                emp_add.add(name_er);
                emp_add.add(phone);
                emp_add.add(phone_ip);
                emp_add.add(phone_er);
                emp_add.add(email);
                emp_add.add(email_ip);
                emp_add.add(email_er);
                emp_add.add(age);
                emp_add.add(age_ip);
                emp_add.add(age_er);
                emp_add.add(gender);
                emp_add.add(genderval);
                emp_add.add(desi);
                emp_add.add(desi_ip);
                emp_add.add(desi_er);
                emp_add.add(sal);
                emp_add.add(sal_ip);
                emp_add.add(sal_er);
                emp_add.add(back);
                emp_add.add(submit);

                back.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        emp_add.dispose();
                        home.setVisible(true);
                    }
                });
                submit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // int id_val = Integer.parseInt(id_ip.getText());
                        // String name_val = name_ip.getText();
                        String phone_val = phone_ip.getText();
                        // String email_val = email_ip.getText();
                        int age_val = Integer.parseInt(age_ip.getText());
                        // String gender_val = (String) genderval.getSelectedItem();
                        // String desi_val = desi_ip.getText();
                        // double sal_val = Double.parseDouble(sal_ip.getText());

                        if (phone_val.length() != 10) {
                            phone_er.setText("Enter a valid phone number (10 Digits)");
                        } else {
                            phone_er.setText("");
                        }

                        if (age_val < 18) {
                            age_er.setText("Enter a valid age (above 18)");
                        } else {
                            age_er.setText("");
                        }

                    }
                });

                emp_add.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                emp_add.setVisible(true);
            }
        });

        view_emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.dispose();
                JFrame vmain = new JFrame("Employee Management System - View Employee Details");
                vmain.setSize(1920, 1080);
                vmain.setLayout(null);

                JTable emp_data = new JTable(8, 8);
                emp_data.setBounds(100, 100, 1000, 250);

                JButton backbtn = new JButton("Back");
                backbtn.setBounds(150, 600, 150, 75);
                backbtn.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                backbtn.setFocusPainted(false);
                vmain.add(emp_data);
                vmain.add(backbtn);

                backbtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        vmain.dispose();
                        home.setVisible(true);
                    }
                });

                vmain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vmain.setVisible(true);
            }
        });

        edit_emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.dispose();
                JFrame emain = new JFrame("Employee Management System - Search Employee");
                emain.setSize(1920, 1080);
                emain.setLayout(null);

                JLabel emp_id = new JLabel("Enter Employee ID:");
                JTextField emp_id_ip = new JTextField();

                JButton cancel = new JButton("Back");
                JButton submit = new JButton("Submit");

                emp_id.setFont(new Font("Times New Roman", Font.PLAIN, 35));
                emp_id_ip.setFont(new Font("Times New Roman", Font.PLAIN, 35));
                cancel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 25));

                emp_id.setBounds(400, 200, 300, 75);
                emp_id_ip.setBounds(700, 222, 300, 40);
                cancel.setBounds(400, 320, 200, 50);
                submit.setBounds(800, 320, 200, 50);

                cancel.setFocusPainted(false);
                submit.setFocusPainted(false);

                emain.add(emp_id);
                emain.add(emp_id_ip);
                emain.add(cancel);
                emain.add(submit);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int id_val = Integer.parseInt(emp_id_ip.getText());

                        if (id_val != 10) {
                            emain.dispose();
                            JFrame edit_emp = new JFrame("Employee Management System - Edit Employee Details");
                            edit_emp.setLayout(null);
                            edit_emp.setSize(1920, 1080);

                            JLabel edit_msg = new JLabel("What you want to edit?");
                            edit_msg.setBounds(300, 200, 550, 75);
                            edit_msg.setFont(new Font("Times New Roman", Font.PLAIN, 35));

                            JComboBox choice = new JComboBox();
                            choice.setBounds(650, 215, 300, 50);
                            choice.setFont(new Font("Times New Roman", Font.PLAIN, 35));
                            choice.addItem("Select Field");
                            choice.addItem("Name");
                            choice.addItem("Phone Number");
                            choice.addItem("Email Address");
                            choice.addItem("Age");
                            choice.addItem("Gender");
                            choice.addItem("Designation");
                            choice.addItem("Salary");
                            choice.setFocusable(false);

                            JButton back = new JButton("Back");
                            back.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                            back.setBounds(300, 350, 200, 50);
                            back.setFocusPainted(false);

                            JButton next = new JButton("Next");
                            next.setFocusPainted(false);
                            next.setBounds(750, 350, 200, 50);
                            next.setFont(new Font("Times New Roman", Font.PLAIN, 25));

                            back.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    edit_emp.dispose();
                                    emain.setVisible(true);
                                }
                            });

                            next.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String selected = (String) choice.getSelectedItem();
                                    if (selected == "Name") {
                                        JFrame popup = new JFrame("Name Edit");
                                        JLabel popupMsg = new JLabel("You have selected Name Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Phone Number") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Phone Number Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Email Address") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Email Address Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Age") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Age Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Gender") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Gender Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Designation") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Designation Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else if (selected == "Salary") {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("You have selected Salary Field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    } else {
                                        JFrame popup = new JFrame("Invalid Choice");
                                        JLabel popupMsg = new JLabel("Please Select a valid field");
                                        popupMsg.setBounds(20, 10, 300, 50);
                                        popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        popup.add(popupMsg);
                                        JButton button = new JButton("OK");
                                        button.setBounds(120, 60, 70, 20);
                                        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        button.setFocusPainted(false);
                                        button.addActionListener(actionEvent2 -> {
                                            popup.dispose();
                                        });
                                        popup.add(button);
                                        popup.setLayout(null);
                                        popup.setBounds(425, 250, 600, 300);
                                        popup.setVisible(true);
                                    }
                                }
                            });

                            edit_emp.add(edit_msg);
                            edit_emp.add(choice);
                            edit_emp.add(back);
                            edit_emp.add(next);
                            edit_emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            edit_emp.setVisible(true);
                        }
                    }
                });

                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        emain.dispose();
                        home.setVisible(true);
                    }
                });

                emain.setVisible(true);
            }
        });

        search_emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.dispose();
                JFrame smain = new JFrame("Employee Management System - Search Employee");
                smain.setSize(1920, 1080);
                smain.setLayout(null);

                JLabel emp_id = new JLabel("Enter Employee ID:");
                JTextField emp_id_ip = new JTextField();

                JButton cancel = new JButton("Back");
                JButton submit = new JButton("Submit");

                emp_id.setFont(new Font("Times New Roman", Font.PLAIN, 35));
                emp_id_ip.setFont(new Font("Times New Roman", Font.PLAIN, 35));
                cancel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
                submit.setFont(new Font("Times New Roman", Font.PLAIN, 25));

                emp_id.setBounds(400, 200, 300, 75);
                emp_id_ip.setBounds(700, 222, 300, 40);
                cancel.setBounds(400, 320, 200, 50);
                submit.setBounds(800, 320, 200, 50);

                cancel.setFocusPainted(false);
                submit.setFocusPainted(false);

                smain.add(emp_id);
                smain.add(emp_id_ip);
                smain.add(cancel);
                smain.add(submit);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int id_val = Integer.parseInt(emp_id_ip.getText());

                        if (id_val == 10) {
                            smain.dispose();
                        } else {
                            JFrame popup = new JFrame("Invalid ID");
                            JLabel popupMsg = new JLabel("The ID you entered is invalid.");
                            popupMsg.setBounds(20, 10, 300, 50);
                            popupMsg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                            popup.add(popupMsg);
                            JButton button = new JButton("OK");
                            button.setBounds(120, 60, 70, 20);
                            button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                            button.setFocusPainted(false);
                            button.addActionListener(actionEvent2 -> {
                                popup.dispose();
                            });
                            popup.add(button);
                            popup.setLayout(null);
                            popup.setBounds(525, 250, 350, 150);
                            popup.setVisible(true);
                        }

                    }
                });

                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        smain.dispose();
                        home.setVisible(true);
                    }
                });

                smain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                smain.setVisible(true);
            }
        });

        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
    }
}