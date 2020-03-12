import java.io.*;
import java.util.*;
class StudGrade
{
	String regno= new String();
	String marks= new String();
	double[] m= new double[10];
	int n;
	int i;
	void getdata()
	{
		System.out.println("Enter details");
		Scanner sc= new Scanner(System.in);
		regno=sc.nextLine();
		marks=sc.nextLine();
		String[] strm=marks.split(" ");
		n=strm.length;
		for (i=0;i<strm.length;i++)
		{
			m[i]=Double.parseDouble(strm[i]);
		}
	}
	void grade()
	{
		int count=0;
		for(i=0;i<n;i++)
		{
			if (m[i]>=90)
			{
				System.out.println(m[i]+" S grade");
				count=count+1;
			}
			else if (m[i]>=80)
			{
				System.out.println(m[i]+" A grade");
			}
			else if (m[i]>=70)
			{
				System.out.println(m[i]+" B grade");
			}
			else if (m[i]>=60)
			{
				System.out.println(m[i]+" C grade");
			}
			else if (m[i]>=55)
			{
				System.out.println(m[i]+" D grade");
			}
			else if (m[i]>=50)
			{
				System.out.println(m[i]+" E grade");
			}
			else
			{
				System.out.println(m[i]+" F grade");
			}
		}
		System.out.println("Number of S grades = "+count+"\n");
	}
}

class q13
{
	public static void main(String[] args)
	{
		StudGrade obj[]= new StudGrade[5];
		int i;
		for (i=0;i<5;i++)
		{
			obj[i]= new StudGrade();
			System.out.println("\nFor student "+ (i+1));
			obj[i].getdata();
		}
		for(i=0;i<5;i++)
		{
			if (obj[i].m.length!=0)
			{
				
				System.out.println("For "+ obj[i].regno);
				obj[i].grade();
			}
			else
			{
				System.out.println("No courses registered");
			}
		}
	
	}
}
