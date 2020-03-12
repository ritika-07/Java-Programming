import java.io.*;
public class Q7 {
	public static void main(String args[]) throws IOException
	{
		try {
			FileReader in= new FileReader("input.txt"); 
			FileWriter out=new FileWriter("output.txt"); 
			int c;
			while((c=in.read())!=-1) 
			{
				System.out.print((char)c); 
				out.write((char)c);
			}
			in.close();
			out.close();
			}
		catch(Exception e) { System.out.println(e); }
	}
}
