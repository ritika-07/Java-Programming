import java.util.*;
class Stud
{
	String regno, mobno;
	int flag=0;
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter registration number and mobile number: ");
		regno=sc.next();
		mobno=sc.next();
	}
	void validate()
	{
		try {
			int i;
			if (regno.length()!= 9 || mobno.length()!=10)
			{
				flag=1;
				throw new IllegalArgumentException ();
			}
			for (i=0;i<mobno.length(); i++)
			{
				if (mobno.charAt(i) <'0' || mobno.charAt(i)>'9')
				{
					flag=1;
					throw new NumberFormatException ();
				}
			}
			for (i=0;i<regno.length(); i++)
			{
				char a=regno.charAt(i);
				if (( a>='0' && a<='9')&& (a<='A' && a>='Z') && (a<='a' && a>='z'))
				{
					flag=1;
					throw new NoSuchElementException ();
				}
			}
			if (flag==0)
			{
				System.out.println("Valid");
			}
			else 
			{
				System.out.println("Valid");
			}
		}
		catch ( NumberFormatException e)
		{ System.out.println("Mobile number contains non-digit"); }
		catch ( IllegalArgumentException e)
		{ System.out.println("Length does not match"); }
		catch ( NoSuchElementException e)
		{ System.out.println("No such element exists"); }
		
	}
}

class Q1
{
	public static void main (String args[])
	{
		
		Stud s= new Stud();
		s.getdata();
		s.validate();
		
		
	}
}

			
