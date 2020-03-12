import java.util.*;
class q9b
{
	public static void main(String args[])
	{
		int i,k,j;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for( i=1;i<=n;i++)
		{
			for( k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for( j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(i=1;i<=n;i++)
		{
			for(k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(j=n-i+1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
