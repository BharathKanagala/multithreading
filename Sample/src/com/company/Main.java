package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code h
        Demo d= new Demo(10,"90 lbs");
        System.out.println(d.getx());
        d.setx(20);
        System.out.println(d.getx());
        System.out.println(d.toString());
        String k= d.getS();
        System.out.println(k );
    }
}
