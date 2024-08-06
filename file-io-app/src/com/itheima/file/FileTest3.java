package com.itheima.file;
// TODO   File创建和删除文件相关的方法

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个新文件（文件内容为空），创建成功返回true,反之
        File f1 = new File("C:/resource/itheima2.txt");
        System.out.println(f1.createNewFile());

        // 2.用于创建文件夹，注意，只能创建一级文件夹
        File f2 = new File("C:/resource/aaa");
        System.out.println(f2.mkdir());

        // 3.用于创建文件夹，注意，可以创建多级文件夹
        File f3 = new File("C:/resource/bbb/ccc/ddd");
        System.out.println(f3.mkdirs());

        // 4.删除文件或者空文件，注意，不能删除非空文件
        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
