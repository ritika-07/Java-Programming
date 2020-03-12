import java.io.*;
import java.util.*;
class q11
{
	public static void main(String[] args)
	{
		int i,j, count=0;
		int ja[][]=new int[4][];
		Scanner sc= new Scanner(System.in);
		for (i=0;i<4;i++)
		{
			System.out.println("Enter number of kids failed in batch "+(i+1));;
			int n=sc.nextInt();
			if (n%4==0)
			{
				ja[i]= new int[n/4];
				for (j=0;j<n/4;j++)
				{
					ja[i][j]=4;
					count=count+1;
				}
			}
			else
			{
				ja[i]= new int[(n/4)+1];
				for (j=0;j<n/4;j++)
				{
					ja[i][j]=4;
					count=count+1;
				}
				ja[i][n/4]=n%4;
			}
		}
		for (int[] x: ja)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("\nNumber of full groups = "+count);
	}
}
