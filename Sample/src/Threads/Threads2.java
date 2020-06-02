package Threads;
import java.lang.*;

public class Threads2 extends Thread{
   int x=0;
   boolean y= false;

   public void setx(int x){
       this.x=x;
       y=true;

   }
   public void run(){
       if(!y){
           throw new IllegalStateException("Error: X is not initialized for "+"the thread["+getName()+"]");
           }
       for(int i=0;i<this.x;i++){
           System.out.println(getName()+"Run :"+i);

       }
       Threads1 t= new Threads1(3);
       t.start();
   }

}
