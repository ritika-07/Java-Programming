import java.util.*;

class Fib extends Thread
{
	int n;
	List<Integer> ar= new ArrayList<>(); 
	Fib()
	{n=100000;}
	public void run()
	{
	try {
		int a=0,b=1,c=a+b;
		ar.add(0); 
		ar.add(1); 
		while(c<=n) 
		{
			ar.add(c);
			a=b; 
			b=c; 
			c=a+b;
		} 
		}
		catch(Exception e)
		{ 
			System.out.println("Exception"); 
		}
	}
	public List display()
	{
		return ar;
	} 
}

class Prime extends Thread 
{
int n;
List<Integer> ar= new ArrayList<>(); 
Prime()
{ n=100000; }
public void run()
{
	try{
		ar.add(2);
		int flag;
		for(int i=3;i<=n;i++)
		{
			flag=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{ 
					flag=1;
					break; 
				}
			} 
			if(flag==0)
			{ ar.add(i); }
		}
	}
	catch(Exception e) 
	{
		System.out.println("Exception occured "+e); 
	}
}

public List display() 
{
	return ar;
}
}

public class Q5 {
	public static void main(String args[]) {
		Fib t1=new Fib(); 
		Prime t2=new Prime();
		t1.start(); t2.start(); 
		try {
				t1.join();
				t2.join(); 
			}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		List <Integer> a1=t1.display();
		List <Integer> a2=t2.display();
		System.out.println("The common fibonacci and prime  no. under 100000 are: "); 
		for(int i:a1)
		{
			for(int j:a2) {
				if(i==j)
				{ System.out.println(i); }
				} 
		} 
		}
}


 

