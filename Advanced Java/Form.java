import java.awt.*;

class Form
{
    public static void main(String args[])
    {
         Frame obj = new Frame();
         obj.setVisible(true);
         obj.setSize(500,450);
         obj.setLayout(new FlowLayout());

         Label l1 = new Label("Enter First Name:");
         obj.add(l1);
         TextField t1 = new TextField(10);
         obj.add(t1);

         Label l2 = new Label("Enter Last Name:");
         obj.add(l2);
         TextField t2 = new TextField(10);
         obj.add(t2);

         Label l3 = new Label("Enter Your Email:");
         obj.add(l3);
         TextField t3 = new TextField(12);
         obj.add(t3);

         Label l4 = new Label("Enter Phone Number:");
         obj.add(l4);
         TextField t4 = new TextField(10);
         obj.add(t4);

         Label l5 = new Label("Choose Your Branch:");
         obj.add(l5);
         CheckboxGroup g1 = new CheckboxGroup();
         Checkbox cb1 = new Checkbox("Computer",g1,false);
         obj.add(cb1);
         Checkbox cb2 = new Checkbox("Civil",g1,false);
         obj.add(cb2);
         Checkbox cb3 = new Checkbox("Mechanical",g1,false);
         obj.add(cb3);
         Checkbox cb4 = new Checkbox("Electronics",g1,false);
         obj.add(cb4);


    }
}
