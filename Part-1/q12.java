import java.io.*;
import java.util.*;
class Film
{
	String name= new String();
	String lang= new String();
	String actor= new String();
	String cat= new String();
	int dur;
	Film()
	{
		name="-";
		lang="-";
		actor="-";
		cat="-";
		dur=0;
	}
	Film (String n, String l, String a, String c, int d)
	{
		name=n;
		lang=l;
		actor=a;
		cat=c;
		dur=d;
	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		name= sc.next();
		lang= sc.next();
		actor= sc.next();
		cat= sc.next();
		dur= sc.nextInt();
		
	}
	void print()
	{
		System.out.println(name+" "+lang+" "+actor+" "+cat+" "+dur +"\n");
	}
}
class FilmMain
{
	static void method1(Film[] obj)
	{
		System.out.println("The English film(s) that has Arnold as its lead actor and that runs for shortest duration:");
		int i, index=0, duration=500;
		for (i=0;i<5;i++)
		{
			if (obj[i].actor.equalsIgnoreCase("Arnold") && obj[i].lang.equalsIgnoreCase("English") )
			{
				if (obj[i].dur<duration)
				{
					index=i;
				}
			}
		}
		obj[index].print();
	}
	
	static void method2(Film[] obj)
	{
		System.out.println("The Tamil film(s) with Rajini as lead actor:");
		int i;
		for (i=0;i<5;i++)
		{
			if (obj[i].actor.equalsIgnoreCase("Rajni") && obj[i].lang.equalsIgnoreCase("Tamil") )
			{
				obj[i].print();
			}
		}
	}
	
	static void method3( Film[] obj)
	{
		System.out.println("All the comedy movies:");
		int i;
		for (i=0;i<5;i++)
		{
			if (obj[i].cat.equalsIgnoreCase("Comedy"))
			{
				obj[i].print();
			}
		}
	}
		
		
	public static void main(String[] args)
	{
		Film obj[]= new Film[5];
		int i;
		
		for(i=0;i<5;i++)
		{
			System.out.println("\nEnter details for movie "+ (i+1));
			obj[i]= new Film();
			obj[i].getdata();
		}
		method1(obj);
		method2(obj);
		method3(obj);
	}
}
		
		
