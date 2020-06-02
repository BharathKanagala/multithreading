package com.company;

public class Demo {
    int x;
    String s = " ";
    public Demo(int x,String s){
         this.x=x;
        this.s=s;

    }
    public void setx(int x){
        this.x=x;

    }
    public int getx(){
        return x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public String toString(){
        return "My age is "+x+" with weigth of " +s;
    }
}
