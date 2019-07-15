package com.hand.tanchun.Demo;

import java.io.*;

/**
 * Created By Tc In 2019/7/12 15:30
 * Description:文件拷贝
 */
public class FileReadTest {
    public static void printFiles(File dir){
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
                if (files[i].isFile()){
//                    System.out.println(files[i].getName());
                }else {
                    printFiles(files[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
//        File file = new File("../01_JavaPracticeDemo");
//        printFiles(file);
//        System.out.println("判断文件是否存在"+file.exists());
//        System.out.println("读取文件名称"+file.getName());
//        System.out.println("读取文件路径"+file.getPath());
//        System.out.println("读取文件绝对路径"+file.getAbsolutePath());
//        System.out.println("读取文件父级路径"+new File(file.getAbsolutePath()).getParent());
//        System.out.println("读取文件大小"+(float)file.length()/1000+"KB");
//        System.out.println("判断文件是否被隐藏"+file.isHidden());
//        System.out.println("读取文件是否可读"+file.canRead());
//        System.out.println("读取文件是否可写"+file.canWrite());
//        System.out.println("读取文件是否为文件夹"+file.isDirectory());
//        System.out.println("-------------------------------");
//
//        if(file.exists()){
//            file.setWritable(false);
//            file.setReadable(false);
//        }

        File file = new File("test.txt");
        File file2 = new File("test.txt");
        if (file.exists()) {
            System.out.println("存在");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStream = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStream);

                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

                String line;
                while ((line=bufferedReader.readLine())!=null){
                    bufferedWriter.write(line+"\n");
                }

                bufferedReader.close();
                inputStream.close();
                fileInputStream.close();
                bufferedWriter.close();
                outputStreamWriter.close();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

