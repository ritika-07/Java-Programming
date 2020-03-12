import java.util.*;
import java.io.*;

class Donor implements Serializable
{
	String name, add, num, bg;
	int age, dod;
	void getData()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Name: ");
		name=sc.nextLine();
		System.out.println("Age: ");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Address: ");
		add=sc.nextLine();
		System.out.println("Contact number: ");
		num=sc.nextLine();
		System.out.println("Blood group: ");
		bg=sc.nextLine();
		System.out.println("Date of last donation in months: ");
		dod=sc.nextInt();
	}
	void display()
	{
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+add);
        System.out.println("Contact number: "+num);
        System.out.println("Blood Group: "+bg);
        System.out.println("Last donated: "+dod);
    }
}
class Q8
{
	public static void main (String[] args)
	{
		System.out.println("Enter n: ");
		Scanner sc= new Scanner (System.in);
		int n,i;
		n=sc.nextInt();
		Donor[] ob= new Donor[n];
		for (i=0;i<n;i++)
		{
			ob[i]=new Donor();
			System.out.println("\nEnter details for donor " +(i+1));
			ob[i].getData();
		}
		try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Sample.txt"));
            for(Donor x: ob){
                out.writeObject(x);
            }
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Sample.txt"));
            System.out.println("\nDonors with A+ve blood group and had not donated for recent 6 months");
            for(i=0;i<n;i++){
                Donor d = (Donor) in.readObject();
                if(d.bg.equals("A+") && (d.dod>6)){
                    d.display();
                }
            }
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
		

        
        
		
			
