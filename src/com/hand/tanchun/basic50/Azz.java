package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/15
 * Description:
 */
public class Azz{
    public static void main(String[] args) {
       final Bussines bussines = new Bussines();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    bussines.sub();
                }
            }
        }).start();
        for(int i=0;i<20;i++){
            bussines.main();
        }
    }

}
class  Bussines{
    boolean issubrunning=true;
    public  synchronized void  sub() {
        while (!issubrunning) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            for (int i = 0; i < 10; i++) {
                System.out.println("sub" + i);
            }
            issubrunning = false;
            this.notify();

    }
    public  synchronized void  main() {
        while (issubrunning) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            for (int i = 0; i < 100; i++) {
                System.out.println("main" + i);
            }
            issubrunning = true;
            this.notify();

    }

}

