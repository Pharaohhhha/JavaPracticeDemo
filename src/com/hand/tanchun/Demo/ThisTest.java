package com.hand.tanchun.Demo;

public class ThisTest {
    private  int age;
    public ThisTest(){
        System.out.println("this()测试kon");
    }
    public ThisTest(int age){
        this();
        this.age=age;
        System.out.println("this()测试");
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest(20);
        System.out.println(thisTest);
    }
}
