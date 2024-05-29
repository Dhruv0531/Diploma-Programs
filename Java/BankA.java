import java.util.*;

class CreateAcc
{
    Scanner S=new Scanner(System.in);
    String name,city,email;
    long id,p_no;
    int pass; 
    double bal;
    static int count=0;

     void accept()
     {
        System.out.println("Enter Name:");
        name=S.nextLine();
        System.out.println("Enter Email Id:");
        email=S.nextLine();
        System.out.println("Enter city:");
        city=S.nextLine();
	   System.out.println("Create Password:");
        pass=S.nextInt();
        System.out.println("Enter Phone no:");
        p_no=S.nextLong();
        id=1000+count;
        count++;
        System.out.println("Congratulations You have successfully created your account \n Your Account Id is:"+id);

     }

     void displayAcc() {
		String format = "| %-20s | %-20s | %-30s | %-15s | %-15s |\n";
		System.out.format(format, name, email, city, pass, p_no);
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}
	
     
     void update()
     {
	System.out.println("Enter the choice:  1.Change Password  2.Change Phone no.  3.Change Email  4.Change City  ");
	int c=S.nextInt();
	switch(c)
	{
	     case 1:System.out.println("Enter your Password:");
	            int p=S.nextInt();
		    if(p==pass)
		    {
		       System.out.println("Enter the new Password:");
		       pass=S.nextInt();
		       System.out.println("Password Successfully Updated");
		    }
		    else System.out.println("Incorrect Password...");
		    break;
             case 2:System.out.println("Enter the new Phone number:");
		    p_no=S.nextInt();
		    System.out.println("Phone no Successfully Updated");
		    break;
	     case 3:System.out.println("Enter the new Email:");
		    email=S.nextLine();
                    break;
             case 4:System.out.println("Enter the new City:");
		    city=S.nextLine();
		    System.out.println("Successfully Updated");
		   
	}
     }
}
class Transaction extends CreateAcc
{
	double amount;
        int ch;
        long u_id;
        int p;
   void menu()
   {

      System.out.println("Enter your choice: \n 1.Deposite  2.Withdraw  3.Transfer  4.exit");
      ch=S.nextInt();
   
	switch(ch)
     {
	    case 1://deposite()			
                        /*System.out.println("Enter the id:");
                        u_id=S.nextInt();*/
         		System.out.println("Enter the amount to be deposited:");
                        amount=S.nextDouble();
			 System.out.println("Enter password:");
                                   p=S.nextInt();
				if(p==pass)
				     bal+=amount;
				else
				 System.out.println("Invalid ID....");
                        System.out.println("Total balance in your account:"+bal);
                        break;
	
       case 2://withdraw() 
               System.out.println("Enter Amount to withdraw:");
               amount=S.nextDouble();
               /*System.out.println("Enter the id:");
               u_id=S.nextInt();*/
	       System.out.println("Enter password:");
               p=S.nextInt();
		    if(p==pass)
		    {
                       if(bal>=amount)
                         bal-=amount;
                       else
                         System.out.println("insufficent balance");
 
                      System.out.println("Total balance in your account:"+bal);
                   }
		   System.out.println("Incorrect Password...");
                  break;

      /*case 3://transfer
               System.out.println("Enter the receiver's ID:");
               r_id=S.nextLong(); 
               System.out.println("Enter the Amount to be trasfered:");
               amount=S.nextDouble();*/

   
   }
 }
}

class BankA
{
        public static void main(String args[])
        {
          
           Transaction T[]=new Transaction[5];
	   //Display D[]=new Display[5];
           int ch,c_id ;
           Scanner SC=new Scanner(System.in);
        
	     for(int i=0;i<5;i++)
	     {
		T[i]=new Transaction();
	     }
	     /* for(int i=0;i<5;i++)
	     {
		D[i]=new Display();
	     }*/

         
           System.out.println("....WELCOME TO JAVA BANK OF INDIA....");
           while(true)
           {
	       for(int i=0;i<5;i++)
	       {       
                   
                    System.out.println("Enter your choice:\n 1.Create Account  2.Transaction 3.Display 4.Money Transfer 5.Update 6.Exit");
                    ch=SC.nextInt();
                  switch(ch)
                  {
               		  case 1:T[i].accept();
                   		  break;

	                  case 2:System.out.println("Enter the Id:");
				 c_id=SC.nextInt();
				for(int j=0;j<5;j++)
				{
			           if(c_id==T[j].id)
				      T[j].menu();
				}
	                        break;

 	                  case 3:System.out.println("Enter the ID:");
				c_id=SC.nextInt();
				String format = "| %-20s | %-20s | %-30s | %-15s | %-15s |\n";
				System.out.println("--------------------------------------------------------------------------------------------------------------------");
				System.out.format(format, "Name", "Email", "City", "Password", "Phone Number");
                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                  
				for(int j=0;j<5;j++)
				{
			           if(c_id==T[j].id)
				      T[j].displayAcc();
				}
				 break;
	                  case 4:System.out.println("Enter you id:");
				 c_id=SC.nextInt();
	                         System.out.println("Enter the Receiver's Id:");
				 int r_id=SC.nextInt();
				 for(int k=0;k<5;k++)
				 {
					if(c_id==T[k].id)
					{
						System.out.println("Enter the amount:");
						double am=SC.nextInt();
						for(int j=0;j<5;j++)
						{	
							if(r_id==T[j].id)
							{
							  T[k].bal-=am;
							  T[j].bal+=am;
							}
						}
					}
				 }
                                  break;
				
                          case 5:System.out.println("Enter your ID:");
				 c_id=SC.nextInt();
				for(int j=0;j<5;j++)
				{
				      if(c_id==T[j].id)
				      T[j].update();
				}
				break;  

			
			  case 6:System.exit(0);
                   }
              }
      
           }
        }
}

// String  fromat ="|%-10s|%-20s|%-15s|%-20s|%-5s|%-15s|\n";