import java.util.*;
class q14
{
	public static void main ( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		s=sc.nextLine();
		int n= s.indexOf('-');
		String react= s.substring(0,n);
		String prod = s.substring(n+3);
		String[] r=react.split(" ");
		String[] p=prod.split(" ");
		System.out.print("Reactants are ");
		for(i=0;i<r.length;i=i+2)
		{
			String ele= r[i];
			String moles= new String();
			String compound= new String();
			if (ele.charAt(0)>='0' && ele.charAt(0)<='9')
			{
				moles= ele.substring(0,1);
				compound= ele.substring(1);
			}
			else
			{
				moles="0";
				compound= ele.substring(0);
			}
			System.out.print(moles+ " number of moles of " +compound+ ",");
		}
		System.out.println();
		System.out.print("Products are ");
		for(i=0;i<p.length;i=i+2)
		{
			String ele= p[i];
			String moles= new String();
			String compound= new String();
			if (ele.charAt(0)>='0' && ele.charAt(0)<='9')
			{
				moles= ele.substring(0,1);
				compound= ele.substring(1);
			}
			else
			{
				moles="0";
				compound= ele.substring(0);
			}
			System.out.print(moles+ " number of moles of " +compound+ ",");
		}
	}
}
