package Threads;



public class Threads1  extends Thread implements Runnable {
    int x= 7;
    int y= 20;
    int a;

     Threads1(int a){
        this.a=a;
    }



    @Override
    public void run() {
         int z=0;

            float K;
            K = (float) y / x;
            z = ((int) (K * 1000000)) % 1000000;
            System.out.println(K);
            System.out.println(z);



        String d = String.valueOf(z);
            for(int s=(d.length()-1);s>=0;s--){
                char ch = d.charAt(s);
                System.out.println(ch);
            }

    }
}


