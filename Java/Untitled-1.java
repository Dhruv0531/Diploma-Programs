//Employee management system in java?   [
//Employee.java - Jimmy Kurian

//HMandTS_Tester - Jimmy Kurian

import java.util.Scanner;
import java.util.*;

public class HMandTS_Tester
{
  public static int menu()
  {
    System.out.println("Choose one option from following : ");
  	System.out.println("1) Add a new employee.");
  	System.out.println("2) Delete an employee via SSN.");
  	System.out.println("3) Retrive an employee via SSN.");
  	System.out.println("4) List all employees.");
  	System.out.println("5) Exit.");
  	Scanner sc = new Scanner(System.in);
  	return sc.nextInt();
  }

  public static void main(String[] args)
  {
    HashMap<String, Employee> employeesByKey = new HashMap<String, Employee>();
    TreeSet<Employee> employeesByName = new TreeSet<Employee>();

	int menuStore = menu();
	while(menuStore != 5)
	{
	  System.out.println();
	  switch (menuStore)
	  {
	    case 1:
	      Scanner input1 = new Scanner(System.in);

 	      System.out.println("Enter a SSN: ");
 	      String str1 = input1.nextLine();
	      System.out.println("Enter Last Name: ");
	      String str2 = input1.nextLine();
	      System.out.println("Enter First Name: ");
	      String str3 = input1.nextLine();

	      Employee newEmp = new Employee(str1, str2, str3);

	      employeesByKey.put(newEmp.getSSN(), newEmp);
	      employeesByName.add(newEmp);

	      System.out.println();
	      break;

	    case 2:
	      Scanner input2 = new Scanner(System.in);

	      System.out.println("Please enter the SSN of the employee you wish to delete: ");
	      String delStr = input2.nextLine();

              if(employeesByKey.containsKey(delStr))
              {
		      employeesByKey.remove(delStr);

		      Iterator<Employee> iterator;
		      iterator = employeesByName.iterator();

		      while (iterator.hasNext())
		      {
				  Employee iterEmp = iterator.next();
				  if (delStr.compareTo(iterEmp.getSSN()) == 0)
				  {
					  iterator.remove();
				  }
		      }

		      System.out.println("Employee removed.");
		      System.out.println("");
		  }

		  else
		  {
			  System.out.println("No such SSN.");
			  System.out.println("");
		  }

	      break;

	    case 3:
	      Scanner input3 = new Scanner(System.in);

	      System.out.println("Please enter the SSN of the employee you wish to retrive: ");
	      String retStr = input3.nextLine();

              if(employeesByKey.containsKey(retStr))
              {
			Employee recievedEmployee = employeesByKey.get(retStr);
			System.out.println(recievedEmployee);
			System.out.println("");

	      }

	      else
	      {
		        System.out.println("No such SSN.");
		        System.out.println("");
	      }


	      break;


        case 4:
          Iterator iterator;
	  iterator = employeesByName.iterator();

          if (employeesByName.isEmpty())
          {
		    System.out.print("Tree Set is empty.");
	  }

	  else
	  {
	            while (iterator.hasNext())
		    {
			  System.out.print(iterator.next() + " ");
		    }
	  }
          System.out.println("");
	  break;

	  case 5:
	    break;
	}
	  menuStore = menu();
     }
   }
}
public class Employee implements Comparable<Employee>
{
	private String ssn;
	private String lastName;
	private String firstName;


	public int compareTo(Employee emp)
	{
		int compLasts = lastName.compareTo(emp.lastName);
		int compFirsts = firstName.compareTo(emp.firstName);
		int compSSN = ssn.compareTo(emp.ssn);

		if ((compSSN != 0) && (compLasts != 0) && (compFirsts != 0))
		{
			return compLasts;
		}
		else
		{
			throw new IllegalArgumentException("Empolyee already exists with that SSN.");
		}
	}


	public Employee (String socialSN, String ln, String fn)
	{
		ssn = socialSN;
		lastName = ln;
		firstName = fn;
	}

	public String toString()
	{
		return "Employee[SSN= " + ssn + ", Last Name= " + lastName + ", First Name= " + firstName + "]";
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getSSN()
	{
		return ssn;
	}

	public void setLastName(String setLN)
	{
		lastName = setLN;
	}

	public void setFirstName(String setFN)
	{
		firstName = setFN;

	}

	public void setSSN(String setSSN)
	{
		ssn = setSSN;
	}
}