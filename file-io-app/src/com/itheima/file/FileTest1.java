package com.itheima.file;

// TODO   File创建对象，代表具体文件的方案

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        // 1.创建一个File对象，指代某个具体的文件
        File f1 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\新建 文本文档.txt");
        System.out.println(f1.length());// 文件大小  540

        File f2 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\test");
        System.out.println(f2.length());

        // File对象，可以指代一个不存在的文件路径
        File f3 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\aaa");
        System.out.println(f3.length());
        System.out.println(f3.exists());// false

        // 要定位的文件是在模块中，如何定位
        // 绝对路径 带盘符的
        // File f4 = new File("C:\\java-learning\\java-note\\file-io-app\\src\\itheima.txt");
        // 相对路径 不带盘符 默认直接去工程下寻找文件
        File f4 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f4.length());// 3
    }
}
