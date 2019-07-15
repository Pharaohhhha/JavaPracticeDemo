package com.hand.tanchun.Demo;

/**
 * Created By Tc On 2019/7/12/17:09
 * Description:
 */
public class SynchronizedTest implements Runnable{
    private  int ticket=5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this){
                if(ticket>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("车票:"+ticket--);
                }
            }
            tell();
        }
    }
    public synchronized void tell(){
        if(ticket>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("车票:"+ticket--);
        }

    }

    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        Thread t1 = new Thread(synchronizedTest);
        Thread t2 = new Thread(synchronizedTest);
        Thread t3 = new Thread(synchronizedTest);
        t1.start();
        t2.start();
        t3.start();
    }
}

