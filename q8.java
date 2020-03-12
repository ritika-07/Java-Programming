import java.util.*;
class q8
{
	public static void main (String[] args) 
	{
		int n= Integer.parseInt(args[0]); 
		while( n!=1)
		{
			System.out.println(n);
			if (n%2==0)
			{ n=n/2; }
			else
			{ n=(n*3)+1; }
		}
		System.out.println(n);
	}
}
