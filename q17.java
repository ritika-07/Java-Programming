import java.io.*;
import java.util.*;
class Patients
{
	public String PID= new String();
	public String pname= new String();
	public String age= new String();
	public String gender= new String();
	public String add= new String();
	public String no= new String();
	public void getdata()
	{
		Scanner sc= new Scanner(System.in);
		PID=sc.next();
		pname=sc.next();
		age=sc.next();
		gender=sc.next();   
		add=sc.next();
		no=sc.next();
	}
	public void display()
	{
		System.out.println("Patient ID: " +PID+"\nPatient name: "+pname+"\nPatient age: "+age+"\nGender: "+gender+"\nAddress: "+add+"\nPhone number: "+no);
	}
}
class InPatient extends Patients
{
	public String rno= new String();
	public int ConsultFee, TestFee, daysno, rent;
	public String DOAdmission= new String();
	public String DODischarge= new String();
	
	public void getdata()
	{
		super.getdata();
		Scanner sc= new Scanner(System.in);
		rno=sc.next();
		ConsultFee=sc.nextInt(); 
		TestFee=sc.nextInt(); 
		DOAdmission=sc.next(); 
		DODischarge=sc.next();
		daysno=sc.nextInt();
		rent=sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Room no.: "+no+"\nConsultation fee: "+ConsultFee+"\nTest fee: "+TestFee+"\nDate of admission: "+DOAdmission+"\nDate of discharge: "+DODischarge+"\nNumber of days: "+daysno+"\nRent: "+rent);
	}
}

class Bill extends InPatient
{
	public String DObill=new String();
	public int Total;
	public void getdata()
	{
		super.getdata();
		Scanner sc= new Scanner(System.in);
		DObill=sc.next();
	}
	public void calc()
	{
		Total= super.ConsultFee+ super.TestFee+ super.rent*super.daysno;
		System.out.println("\nTotal fee:"+Total);	
	}
	public void display()
	{
		super.display();
		System.out.println("Date of bill: "+DObill+"\nTotal: "+Total);
	}
}

class q17
{
	public static void main( String[] args)
	{
		Bill ob = new Bill();
		ob.getdata();
		ob.calc();
		ob.display();
	}
}
