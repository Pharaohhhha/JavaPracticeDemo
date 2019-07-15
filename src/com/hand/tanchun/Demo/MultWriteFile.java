package com.hand.tanchun.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class MultWriteFile {
    static File file=new File("test.txt");

    public static void main(String[] args) {
//        if(file.exists()){
//            file.delete();
//        }
//        new WriteFile(file,1).start();
//        new WriteFile(file,4).start();
//        new WriteFile(file,3).start();
//        new WriteFile(file,2).start();
//        new WriteFile(file,5).start();

        try {
            RandomAccessFile r = new RandomAccessFile(file, "r");
            r.seek(400);
            byte[] b=new byte[20];
            r.read(b);
            String s = new String(b);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

