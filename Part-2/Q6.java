import java.util.*;
class Buff {
   int contents;
   boolean available = false;
   
   public synchronized int get() {
      while (available == false) {
         try {
            wait();
         } catch (InterruptedException e) {}
      }
      available = false;
      notifyAll();
      return contents;
   }
   public synchronized void put(int value) {
      while (available == true) {
         try {
            wait();
         } catch (InterruptedException e) { } 
      }
      contents = value;
      available = true;
      notifyAll();
   }
}
class Consumer extends Thread {
   Buff b;
   private int n;
   
   public Consumer(Buff c, int num) {
      b = c;
      n = num;
   }
   public void run() {
      int value = 0;
      for (int i = 0; i < 10; i++) {
         value = b.get();
         System.out.println("Consumer " + n + " consumed: " + value);
      }
   }
}
class Producer extends Thread {
   Buff b;
   private int n;
   public Producer(Buff c, int num) {
      b = c;
      n = num;
   } 
   public void run() {
      for (int i = 0; i < 10; i++) {
         b.put(i);
         System.out.println("Producer " + n + " produced: " + i);
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { 
			 System.out.println(e);
			 }
      } 
   }
} 
class Q6 {
   public static void main(String[] args) {
      Buff c = new Buff();
      Producer p1 = new Producer(c, 1);
      Consumer c1 = new Consumer(c, 1);
      p1.start(); 
      c1.start();
   }
}



