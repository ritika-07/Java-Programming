import java.util.*; 

class Q12
{
	public static void main(String args[])
	{ 
		Map<String,String> h1=new HashMap<>(); 
		Map<String,String> h2=new HashMap<>(); 
		Scanner sc=new Scanner(System.in);
		String name, course, fac;
		h1.put("Ritika","Java Statistics Python"); 
		h1.put("Manorama","Java C++");
		h1.put("Avani","C++ Python"); 
		h1.put("Nakul","Statistics Python");
		System.out.println("\nContents of h1"); 
		for (Map.Entry<String,String> ele : h1.entrySet()) 
		{
			System.out.println(ele);
		}

		System.out.println("\nSize of h1 before removing student 'Nakul': "+h1.size());
		h1.remove("Nakul");
		System.out.println("\nContents of h1 after removing student 'Nakul': ");
		for(Map.Entry<String,String> ele : h1.entrySet()) 
		{
			System.out.println(ele);
		}
		System.out.println("\nSize of h1 after removing student 'Nakul': "+h1.size());
		
		h2.put("Java","Prof. Thilagavathi");
		h2.put("Statistics","Prof. Ramesh"); 
		h2.put("Python","Prof. Geraldine"); 
		h2.put("C++","Prof. Hilda"); 
		System.out.println("\nContents of h2:"); 
		for(Map.Entry<String,String> ele : h2.entrySet()) 
		{
			System.out.println(ele.getKey()+" : "+ele.getValue());
		}
		System.out.println("Size of h2= "+h2.size());
		System.out.println("\nEnter student name to find faculty: "); 
		String s=sc.next();
		String[] x=null;
		String b=null;
		for(Map.Entry<String,String> ele : h1.entrySet()) 
		{
			if(ele.getKey().equals(s))
			{ x=ele.getValue().split(" "); }
		}
		for (String q:x) 
		{
			for(Map.Entry<String,String> ele : h2.entrySet()) 
			{
				if(ele.getKey().equals(q))
				{
					System.out.println(ele.getValue()); 
				}
			}
		} 
	}
}
