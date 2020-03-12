import java.util.*;

class Fib extends Thread {
	int n;
	int[] ar= new int[20];
	Fib(int x)
	{
		n=x;
	}
	public void run()
	{
		int a=1, b=1, c, i=2;
		ar[0]=1;
		ar[1]=1;
		c=a+b;
		while(c<=n)
		{
			ar[i]=c;
			i=i+1;
			b=c;
			a=b;
			c=a+b;
		}
	}
	void display()
	{
		int i=0;
		System.out.println("Fibonacci sequence: ");
		while(ar[i]!=0)
		{
			System.out.println(ar[i]);
			i=i+1;
		}
	}
}
	
class Fact extends Thread {
	int n, prod=1;
	Fact(int x)
	{ 
		n=x;
	}
	public void run()
	{
		int i=2;
		while (i!=n+1)
		{
			prod=prod*i;
			i=i+1;
		}
	}
	void display()
	{
		System.out.println("Factorial: "+prod);
	}
}

class Q3 {
	public static void main ( String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		Fib ob1= new Fib(n);
		Fact ob2= new Fact(n);
		ob1.start();
		ob2.start();
		try
		{
			ob1.join();
			ob2.join();
			ob1.display();
			ob2.display();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
		
		
