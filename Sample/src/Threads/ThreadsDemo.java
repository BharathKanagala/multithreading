package Threads;

public class ThreadsDemo  {

    public static void main(String[] args)  {
int[] ar = new int[3];

ar[0]=9;
ar[1]=8;
ar[2]=7;

int[] newar = new int[4];

for (int i=0;i<ar.length;i++) {

    System.out.println(ar[i]);
}

for (int i=0;i<ar.length;i++){
     newar[i]=ar[i];
    System.out.println(newar[i]);
}




    }
}
