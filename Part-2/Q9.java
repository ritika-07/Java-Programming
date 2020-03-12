import java.util.*;
public class Q9 {
	static <E extends Comparable <E>> E calc(E[] ar) 
	{
		E max=ar[0];
		for(E i:ar) 
		{
			if(i.compareTo(max)>0)
			max=i; 
		}
		return max; 
	}
	public static void main(String args[]) 
	{
		Integer[] a1= {1,3, 3, 5, 2, 6};
		Float[] a2= {3.0f, 1.5f, 2.2f, 5.1f, 6.7f, 8.6f};
		System.out.println("Max integer value: "+calc(a1));
		System.out.println("Max float value: "+calc(a2)); 
	}
}
