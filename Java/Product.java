import java.util.*;

class Product
{
    int prod_id;
    String name;
    float price;
    

    void accept()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Product ID:");
        prod_id=s.nextInt();
        System.out.println("Enter Product Name:");
        name=s.nextLine();
        s.next();
        System.out.println("Enter Product Price:");
        price=s.nextFloat();
    }

    void display()
    {
        System.out.println("Product Id:"+prod_id);
        System.out.println("Product Name:"+name);
        System.out.println("Product Price:"+price);
    }

    public static void main(String args[])
    {
        Product P[] = new Product[5];
        float total=0.0f;

        for(int i=0;i<5;i++)
        {
            P[i] = new Product();
        }
        for(int i=0;i<5;i++)
        {
            P[i].accept();
        }
        for(int i=0; i<5; i++)
        {
            P[i].display();
            total+=P[i].price;
        }
        System.out.println("Total Price:"+total);
        
    }
}