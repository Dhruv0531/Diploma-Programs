import java.util.*;

class Account
{
	Scanner S=new Scanner(System.in);
	String name;
	int password;
	long phoneno;
	long balance;
	
	
	
	void openAccount()
	{
		
	
		System.out.println("-----------Creating the Account-------------");
		
	
		System.out.println("Enter your name:");
		name=S.next();
		System.out.println("enter your number:");
		phoneno=S.nextLong();
		System.out.println("enter your password:");
		password=S.nextInt();
		System.out.println("enter your balance:");
		balance=S.nextLong();
	
   }
	void viewAccount()
	{
		
		System.out.println("Name of customer:"+name);
		
		System.out.println("Phoneno of customer:"+phoneno);
		
		System.out.println("Password of customer:"+password);
		
		System.out.println("Balance of customer:"+balance);
	}
}
class Deposit extends Account
{
	long amount;
	void deposit()
	{
		
		
		System.out.println("enter amount you want to deposit:");
		amount=S.nextLong();
		System.out.println("enter password:");
		int p=S.nextInt();
		if(p==password)
		{
			balance=balance+amount;
			System.out.println(balance);
		}
		else
		{
			System.out.println("Incorrect Password");
		}
		
	}
}
class Widraw extends Deposit
{
	void withdraw()
    {
	
	
	System.out.println("enter amount you want to withdraw");
	amount = S.nextInt();
	if(balance>=amount)
	{
		System.out.println("enter your password");
		int p=S.nextInt();
		if(p==password)
		{	
			balance=balance-amount;
			System.out.println("Balance after widraw:"+balance);
		}
		else
		{
			System.out.println("password is wrong");
		}
	}
	else
	{
		System.out.println("your balance is less than"+amount+"\t transaction failed.....");
	}
    }
} 

class Bank
	{
		public static void main(String args[])
		{
			Scanner S=new Scanner(System.in);
			Widraw w=new Widraw();
			int ch;
			while(true)
			{
			System.out.println("-----------Menu 1.Account 2.Deposit 3.Widraw 4. Exit------------");
			System.out.println("enter your choice:");
			ch=S.nextInt();
			
			
				switch(ch)
				{
					case 1 : System.out.println("Creating account:");
						
						
							w.openAccount();
					       	        w.viewAccount();
						
					        	break;
					
					case 2 : System.out.println("Deposit ");
						

							w.deposit();
						
							break;
					case 3:  System.out.println("widraw");
						
						
							w.withdraw();
						
							break;
					case 4: System.exit(0); 
					default : System.out.println("invalid choice:");
				
				}
			}

				
				
				
		}

	}