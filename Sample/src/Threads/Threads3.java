package Threads;

public class Threads3 extends Thread {
     public void run(){

         Threads2 t= new Threads2();
         t.setx(2);
         t.start();
        System.out.println("Hi all");

    }

}


