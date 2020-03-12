import java.util.*; 
class Book
{
	String id, name, author, publisher;
	Book() 
	{
		id=null; 
		name=null; 
		author=null; 
		publisher=null;
	}
	Book (String a, String b, String c, String d) 
	{
		id=a;
		name=b; 
		author=c; 
		publisher=d;
	}
	void getData()
	{ 
		Scanner sc = new Scanner(System.in);
		id=sc.next(); 
		sc.nextLine();
		name=sc.nextLine(); 
		author=sc.nextLine(); 
		publisher=sc.nextLine();
	}
	void display()
	{ 
		System.out.println("ID: " + id + "\nName: " + name + "\nAuthor: "+ author + "\nPublisher: " + publisher);
	}
}
class Q11 {
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		Book[] ob=new Book[n]; 
		List<Book> l =new LinkedList<>();
		for(int i=0;i<n;i++)
		{ 
			ob[i]=new Book();
			System.out.println("\nEnter details for Book " +(i+1));
			ob[i].getData();
			l.add(ob[i]); 
		}
		Iterator<Book> it=l.iterator();
		Book x;
		System.out.println("\nEnter 1 to search by author \nEnter 2 to search by publisher"); 
		int ch=sc.nextInt();
		sc.nextLine();
		if(ch==1)
		{
			String s=sc.nextLine(); 
			while(it.hasNext()) 
			{
				x=it.next();
				if(x.author.equals(s)) 
				{ x.display(); }
			} 
		}
		else
		{
			String s=sc.nextLine(); 
			while(it.hasNext())
			{
				x=it.next();
				if(x.publisher.equals(s)) 
				{ x.display(); }
			}
		}
	}
}
		
		
