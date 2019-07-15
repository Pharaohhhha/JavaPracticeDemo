package com.hand.tanchun.Demo;

public class OverLoadTest {
    public static void main(String[] args) {
        System.out.println(tell(1, 2));
    }
    public  static int  tell(int a,int b){
        return a+b;
    }
    public  static int  tell(int a,int b,int c){
        return a+b;
    }

}
