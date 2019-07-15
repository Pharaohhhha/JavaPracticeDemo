package com.hand.tanchun.basic50;

/**
 * Created By TanChun On 2019/7/14
 * Description:子线程循环10次，接着主线程循环100次，接着又回到子线程循环10次，接着再回到主线程100次，如此循环50次
 */
public class ThreadLoop {
        public static void main(String[] args) {
            final Business business = new Business();
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 1; i <= 50; i++) {
                        business.sub(i);
                    }
                }
            }).start();
            for (int i = 1; i <= 50; i++) {
                business.main(i);
            }
        }
    }
    class Business {
        private boolean bShouldSub = true;
        public synchronized void sub(int i) {
            while (!bShouldSub) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 1; j <= 10; j++) {
                System.out.println("sub sequence is :" + j + "   main loop is :"
                        + i);
            }
            bShouldSub = false;
            this.notify();
        }
        public synchronized void main(int i) {
            while (bShouldSub) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 1; j <= 100; j++) {
                System.out.println("main sequence is :" + j + "   main loop is :"
                        + i);
            }
            bShouldSub = true;
            this.notify();
        }
    }


