import java.util.*;

class count{
    int c = 0;
    synchronized void update(){
        c++;     
        try{
            Thread.sleep(1000);  
        } 
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    int getCount(){
        return c;
    }
}

class newthread extends Thread{
    int[] arr = new int[60];
    count a,b,c;
    newthread(int[] a1,int n1,int n2,count x,count y,count z){
        a = x;
        b = y;
        c = z;
        for(int i=n1;i<n2;i++){
            arr[i-n1] = a1[i];
        }
        start();
    }

    public void run(){
        for(int x: arr){
            if(x==1)
            a.update();
            else if(x==2)
            b.update();
            else
            c.update();
        }
    }
}

class Q4{
    public static void main(String[] args){
        int[] arr = new int[240];
        Random r = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(3)+1;
        } 

        count a = new count();
        count b = new count();
        count c = new count();

        newthread t1 = new newthread(arr,0,60,a,b,c);
        newthread t2 = new newthread(arr,60,120,a,b,c);
        newthread t3 = new newthread(arr,120,180,a,b,c);
        newthread t4 = new newthread(arr,180,240,a,b,c);

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();  
        } 
        catch(InterruptedException e){
            System.out.println(e);
        }

        int ac = a.getCount();
        int bc = b.getCount();
        int cc = c.getCount();
        
        System.out.println("No. of votes of A: "+ac+"\nNo. of votes of B: "+bc+"\nNo. of votes of C: "+cc);

        if (ac>bc)
        {
			if (ac>cc)
			{
				System.out.println("A won");
			}
			else if (ac<cc)
			{
				System.out.println("C won");
			}
			else
			{
				System.out.println("A and C are tied");
			}
		}
		else if (bc>ac)
		{
			if (bc>cc)
			{
				System.out.println("B won");
			}
			else if (cc>bc)
			{
				System.out.println("C won");
			}
			else
			{
				System.out.println("B and C are tied");
			}
		}
		else
		{
			if (ac>cc)
			{
				System.out.println("A and B are tied");
			}
			else
			{
				System.out.println("C won");
			}
		}
    }
}
