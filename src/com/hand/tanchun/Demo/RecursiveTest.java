package com.hand.tanchun.Demo;

public class RecursiveTest {
    public  static  int  addnum(int i){
        if (i==1){
            return 1;
        } else {
            return i+addnum(i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(addnum(100));
    }
}
