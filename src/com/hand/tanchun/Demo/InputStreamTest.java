package com.hand.tanchun.Demo;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created By Tc On 2019/7/12/16:17
 * Description:
 */
public class InputStreamTest {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
           byte input[]=new byte[20];
//             fileInputStream.read(input);
//            String string = new String(input);
//            System.out.println(string);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

