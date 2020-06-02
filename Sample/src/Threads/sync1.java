package Threads;

public class sync1 extends Thread{
    sync s;
    sync1(sync s){
        this.s=s;
    }
    public void run(){
        s.display();
    }
}
