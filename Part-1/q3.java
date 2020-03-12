import java.util.*;
class q3
{
	public static void main( String[] args)
	{
		double w, h, bmi;
		w= Double.parseDouble(args[2]);
		h= Double.parseDouble(args[3]);
		bmi= w/(h*h);
		System.out.println(args[0]+" "+args[1]);
		if (bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if (bmi<25)
		{
			System.out.println("Normal (healthy weight)");
		}
		else if (bmi<30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
	}
}
