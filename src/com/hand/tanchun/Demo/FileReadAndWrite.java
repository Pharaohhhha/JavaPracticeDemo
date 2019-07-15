package com.hand.tanchun.Demo;

import java.io.*;

/**
 * Created By TanChun On 2019/7/13
 * Description:
 */
public class FileReadAndWrite {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file2 = new File("test.txt");
//        try {
//            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2));
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//            String s;
//            while ((s=bufferedReader.readLine())!=null){
//                System.out.println(s);
//                bufferedWriter.write(s);
//            }
//            bufferedWriter.close();
//            outputStreamWriter.close();
//            bufferedReader.close();
//            inputStreamReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(file2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String s;
            while ((s=bufferedReader.readLine())!=null){
                bufferedWriter.write(s+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

