package com.hand.tanchun.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class WriteFile extends Thread{
    File file;
    int block;
    int L=100;

    public WriteFile(File file, int block) {
        this.file = file;
        this.block = block;
    }

    @Override
    public void run() {
        try {
            RandomAccessFile rw = new RandomAccessFile(file, "rw");
            rw.seek((block-1)*L);
            rw.writeBytes("this is block"+block);
            for (int i = 0; i < 20; i++) {
                rw.writeBytes("-");
            }
            rw.writeBytes("\n");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}

