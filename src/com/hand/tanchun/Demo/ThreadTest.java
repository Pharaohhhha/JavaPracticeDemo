package com.hand.tanchun.Demo;

/**
 * Created By Tc On 2019/7/12/16:39
 * Description:
 */
 class ThreadDemo01{
    public static void main(String[] args) {
        ThreadTest a = new ThreadTest("A");
        ThreadTest b = new ThreadTest("B");
        System.out.println(a.isAlive());
        a.start();
        for (int i = 0; i < 50; i++) {
            if(i>10){
                try {
                    a.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程"+i);
        }
        System.out.println(a.isAlive());
//        b.start();
//        MyRunnable a = new MyRunnable("A");
//        MyRunnable b = new MyRunnable("B");
//        Thread aa = new Thread(a);
//        Thread bb = new Thread(b);
//        aa.start();
//        bb.start();
    }
}

public class ThreadTest  extends Thread{
    private  String name;


    public ThreadTest(String name) {
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("当前线程："+Thread.currentThread().getName()+":"+name+":"+i);
        }
        super.run();
    }
}
class  MyRunnable implements Runnable{
     private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name+":"+i);
        }
    }
}

