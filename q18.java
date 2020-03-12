import java.util.*;

interface EncryptDecrypt
{
String alpha="abcdefghijklmnopqrstuvwxyz";
void encrypt();
void decrypt();
}

class SpaceElimination
{
StringBuffer msg= new StringBuffer();
int i;
SpaceElimination(StringBuffer x)
{
	msg=x;
}
	
void remove()
{
	for (i=0;i<msg.length();i++)
	{
		if (msg.charAt(i)==' ')
		{
			msg.deleteCharAt(i);
			i=i-1;
		}
	}
}
}

class cipher extends SpaceElimination implements EncryptDecrypt
{
cipher( StringBuffer x)
{
	super(x);
}

public void encrypt()
{
	for (i=0;i<msg.length();i++)
	{
		String letter= msg.substring(i, i+1);
		int n= alpha.indexOf(letter);
		int pos= n+3;
		if (pos>25)
		pos=pos-26;
		System.out.print(alpha.charAt(pos));
	}
	System.out.println();
}
public void decrypt()
{
	for (i=0;i<msg.length();i++)
	{
		String letter= msg.substring(i, i+1);
		int n=alpha.indexOf(letter);
		int pos=n-3;
		if (pos<0)
		pos=pos+26;
		System.out.print(alpha.charAt(pos));;
	}
	System.out.println();
}
}

class q18
{
public static void main( String[] args )
{
StringBuffer ecode= new StringBuffer ("  abcde  ");
StringBuffer dcode= new StringBuffer ("defgh");
cipher obj= new cipher(ecode);
obj.remove();
cipher obj1= new cipher(dcode);
obj.encrypt();
obj1.decrypt();
}
}
