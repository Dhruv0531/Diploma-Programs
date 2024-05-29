import java.awt.*;

class Employee
{
    void display()
    {
        Frame emp = new Frame("Employee Form");
        emp.setLayout(null);
        emp.setSize(500,500);

        Label name = new Label("Enter Name");
        TextField name_tf = new TextField();
        name.setBounds(50,50,100,30);
        name_tf.setBounds(150,50,100,25);

        Label address = new Label("Enter Address:");
        TextArea address_ta = new TextArea();
        address.setBounds(50,100,100,30);
        address_ta.setBounds(150,100,100,50);

        Label lang = new Label("Select Languages Known:");
        lang.setBounds(50,170,150,30);
        Checkbox cb1 = new Checkbox("C");
        Checkbox cb2 = new Checkbox("C++");
        Checkbox cb3 = new Checkbox("Java");
        Checkbox cb4 = new Checkbox("Python");
        cb1.setBounds(200,170,50,30);
        cb2.setBounds(250,170,50,30);
        cb3.setBounds(300,170,50,30);
        cb4.setBounds(350,170,50,30);

        Label gender = new Label("Select Gender:");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox male = new Checkbox("Male",false,cbg);
        Checkbox female = new Checkbox("Female",false,cbg);
        gender.setBounds(50,220,80,30);
        male.setBounds(140,220,50,30);
        female.setBounds(180,220,50,30);

        Button submit = new Button("Submit");
        submit.setBounds(120,300,50,50);

        emp.add(name);
        emp.add(name_tf);
        emp.add(address);
        emp.add(address_ta);
        emp.add(lang);
        emp.add(cb1);
        emp.add(cb2);
        emp.add(cb3);
        emp.add(cb4);
        emp.add(gender);
        emp.add(male);
        emp.add(female);
        emp.add(submit);

        emp.setVisible(true);
    }
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.display();
    }
}