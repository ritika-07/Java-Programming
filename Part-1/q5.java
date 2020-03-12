class q5
{
	public static int sum_Squares(int n) 
	{
		int i=0, sum=0;
		for (i=1;i<=n;i++)
		{
			sum=sum+(i*i);
		}
		return sum;
	}
	public int square_Sum(int n)
	{
		int i=0, sum=0;
		for (i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		sum=sum*sum;
		return sum;
	}
	public static void main(String[] args)
	{
		int n= Integer.parseInt(args[0]);
		System.out.println("Sum of squares = " + sum_Squares(n)); 
		q5 ob= new q5();
		System.out.println("Square of sum = " + ob.square_Sum(n)); 
		System.out.println("Difference = " +(ob.square_Sum(n)-sum_Squares(n)));
	}
}
