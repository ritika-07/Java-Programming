import java.util.*;
class q4
{
public static void main (String[] args)
{
	Scanner sc= new Scanner(System.in);
	int counti=0, countf=0, i=1, sumi=0, flag=0;
	float sumf=0;
	int[] a= new int[10];
	float[] b= new float[10];
	while (i==1)
	{
		if (sc.hasNextInt())
		{
			a[counti]=sc.nextInt();
			counti=counti+1;
			flag=0;
		}
		else if (sc.hasNextFloat())
		{
			b[countf]=sc.nextFloat();
			countf=countf+1;
			flag=0;
		}
		else if (sc.hasNextLine())
		{
			sc.next();
			flag=flag+1;
		}
		if (flag==3)
		{
			i=0;
		}
	}
	for (i=0; i<counti; i++)
	{
		sumi=sumi+a[i];
	}
	float avgi=sumi/counti;
	for (i=0; i<countf; i++)
	{
		sumf=sumf+b[i];
	}
	float avgf=sumf/countf;
	System.out.println("Count of integers is = " + counti); 
	System.out.println("Avg of integers is = " + avgi); 
	System.out.println("Count of float values is = " + countf); 
	System.out.println("Avg of float values is = " + avgf);
} }
