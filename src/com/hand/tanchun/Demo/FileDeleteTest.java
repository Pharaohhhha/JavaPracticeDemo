package com.hand.tanchun.Demo;

import java.io.File;
import java.io.IOException;

/**
 * Created By Tc In 2019/7/12 14:52
 * Description:文件常规操作以及递归删除文件
 */
public class FileDeleteTest {
    public static boolean deleteFile(File dirFile) {
        // 如果dir对应的文件不存在，则退出
        if (!dirFile.exists()) {
            return false;
        }

        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {
            for (File file : dirFile.listFiles()) {
                deleteFile(file);
            }
        }


        return dirFile.delete();
}
        public static void main(String[] args) {
            File file = new File("hello/hand");
            System.out.println(deleteFile(file));

//        File file = new File("hello/hand/one/three");
//        File file2 = new File("hello/hand/three");
//        file.renameTo(file2);
//        File file = new File("hello/hand/one");
//        if (file.delete()) {
//            System.out.println("done");
//        }else {
//            System.out.println("fail");
//        }
//        file.mkdir();
//        System.out.println("文件夹创建成功");
//        if(file.exists()){
//            File file1 = new File("new Hello.txt");
//            file.renameTo(file1);
//            System.out.println(file.isFile()+"---");
//            System.out.println(file.isDirectory()+"+++");
//            file.delete();
//            System.out.println("删除"+file.getName()+"成功");
//        }else{
//            System.out.println("文件不存在");
//            try {
//                file.createNewFile();
//                System.out.println("文件已经成功创建");
//            } catch (IOException e) {
//                System.out.println("文件无法创建");
//            }
//        }
    }
}

