import java.util.*;
class q10
{
	public static void main (String[] args)
	{
		int i, count=0; 
		double sum=0, avg;
		double[] a= new double[12];
		Scanner sc= new Scanner(System.in);
		for (i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Avg= "+avg);
		for (i=0;i<a.length;i++)
		{
			if (a[i]>avg)
			{
				count=count+1;
			}
		}
		System.out.println("Count="+count);
	}
}
			
