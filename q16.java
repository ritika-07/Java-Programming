import java.util.*;
abstract class Themepark
{
int n,m;
Themepark(int x,int y)
{
	n=x;
	m=y;
}
void total()
{
	System.out.println("Total cost = "+(n*500+m*300)+"\n");
}	

abstract void playGame(int x);
}

class Queensland extends Themepark
{
Boolean[] games= new Boolean[30];
int i;
Queensland(int x, int y)
{
super(x, y);
for(i=0;i<30; i++)
{
	games[i]=false;
}
}

void playGame(int x)
{
if (games[x]==true)
{
	System.out.println("Already played, another choice\n");
}
else
{
	games[x]=true;
	System.out.println("Game "+x+" played\n");
}
}
}

class Wonderla extends Themepark
{
	
int[] games= new int[40];
int i, countp, countnp;
Wonderla(int x, int y)
{
super(x, y);
for(i=0;i<40;i++)
{
	games[i]=0;
}
}

void playGame(int x)
{
if (games[x]==0)
{
	games[x]=1;
	System.out.println("Game "+x+" played");
}
else
{
	System.out.println("Game "+x+" played");
}
countp=0;
countnp=0;
for(i=0;i<40;i++)
{
	if (games[i]==1)
	countp=countp+1;
	else
	countnp=countnp+1;
}

System.out.println("Number of games repeated =" +countp + "\nNumber of games not played =" +countnp+"\n");
}
}

class q16
{
public static void main (String args[])
{
	Queensland q = new Queensland(2,3);
	System.out.println("For Queensland, ");
	q.total();
	Wonderla w= new Wonderla(2,3);
	System.out.println("For Wonderla, ");
	w.total();
	q.playGame(0);
	q.playGame(0);
	q.playGame(1);
	w.playGame(0);
	w.playGame(0);
	w.playGame(1);
	w.playGame(4);
	w.playGame(39);
}
}
