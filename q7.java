import java.util.*;
class q7
{
	public static void main(String[] args)
	{
		int n= Integer.parseInt(args[0]);
		int a=1, b=1, c=2, i; 
		System.out.println(a+"\n"+b+"\n"+c);
		for (i=3;i<n;i++)
		{
			int temp=c;
			c=a+b+c;
			a=b;
			b=temp;
			System.out.println(c);
		}
	}
}
