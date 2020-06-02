package Threads;

public class Threads4 extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(getName() + " : " + i);
            if (i ==3  && getName().equals("child2")) {
                try {
                Thread.sleep(500);
                }catch (Exception e){

                    e.printStackTrace();
                }
            }
        }
    }
}
