package com.hand.tanchun.Demo;

interface  USB{
    void start();
    void stop();
}
class USBDisk implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束");
    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        USBDisk usbDisk = new USBDisk();
        Printer printer = new Printer();
        usbDisk.start();usbDisk.stop();
        printer.start();printer.stop();
    }
}
