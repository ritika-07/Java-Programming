import java.util.*; 
class Q10
{
	public static void main(String args[]) 
	{
		int i, n, flag=0;
		Scanner sc=new Scanner(System.in); 
		ArrayList<Integer> a1=new ArrayList<>(); 
		ArrayList<Integer> a2=new ArrayList<>(); 
		ArrayList<Integer> ans=new ArrayList<>(); 
		System.out.println("Enter the number of elements"); 
		n=sc.nextInt();
		System.out.println("Enter elements for list 1"); 
		for(i=0;i<n;i++)
		{
			int ele =sc.nextInt();
			a1.add(ele);
		}
		System.out.println("Enter elements for list 2"); 
		for(i=0;i<n;i++)
		{
			int ele=sc.nextInt();
			a2.add(ele);
		}
		for (i=0;i<n;i++)
		{
			int ele=a1.get(i)- a2.get(i);
			ans.add(ele);
		}
		System.out.println("Difference :");
		for (int x: ans)
		{
			System.out.println(x);
			if (x!=0)
			flag=1;
		}	

		if(flag==0)
		System.out.println("The two array lists are equal");
		else
		System.out.println("The two array lists are not equal");
	}
}
