import java.util.*;
class Employee
{
	String id;
	String name;
	String dob;
	void getdata()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter details: ");
		id= sc.next();
		name= sc.next();
		dob= sc.next();
	}
	void validate() throws InvalidEmployeeCode
	{
		int flag=0;
		if (id.charAt(0)>='0' && id.charAt(0)<='9') 
		if (id.charAt(1)>='0' && id.charAt(1)<='9') 
		if (id.charAt(2)=='-')  
		if (id.charAt(3)=='F' || id.charAt(3)=='S') 
		if (id.charAt(4)=='-') 
		if (id.charAt(5)>='0' && id.charAt(5)<='9')  
		if (id.charAt(6)>='0' && id.charAt(6)<='9') 
		if (id.charAt(7)>='0' && id.charAt(7)<='9') 
			flag=1;
		if (flag==0)
		{
			throw new InvalidEmployeeCode ();
		}
	}
	void display()
	{
		System.out.println("Details:");
		System.out.println("ID: "+ id + "\nName: " + name + "\nDOB: "+ dob);
	}
}
class Q2
{
	public static void main (String[] args)
	{
		Employee e= new Employee();
		e.getdata();
		try
		{
			e.validate();
			e.display();
		}
		catch ( Exception er)
		{
			System.out.println(er);
		}
		
	}
}
