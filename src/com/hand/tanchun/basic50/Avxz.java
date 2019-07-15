package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/15
 * Description:
 */
public class Avxz extends  Thread {
    public   int a(int a){
        return a=1;
    }

    public static void main(String[] args) {
        Avxz t1 = new Avxz();
        Avxz t2 = new Avxz();
        int a = t1.a(1);
        int a1 = t2.a(2);
        t1.start();
        t2.start();
        System.out.println(a);
        System.out.println(a1);


    }
}

