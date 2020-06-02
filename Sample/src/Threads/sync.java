package Threads;

public class sync {
private int count=0;
      synchronized void display(){
        for(int i=0;i<20;i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + "Run" +count);

        }
    }
}
