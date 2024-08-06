package com.itheima.file;
// TODO   File提供的遍历文件夹的方法
import java.io.File;

public class FileTest4 {
    public static void main(String[] args) throws Exception {
        // 1.获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        File f1 = new File("C:\\code");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
            // javasepro
            //得奖的是
            //汪苏泷
            //雨天
        }

        // 2.重点：获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            // C:\code\javasepro
            //C:\code\得奖的是
            //C:\code\汪苏泷
            //C:\code\雨天
        }
    }
}
