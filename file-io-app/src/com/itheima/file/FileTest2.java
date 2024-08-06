package com.itheima.file;
// TODO   File提供的判断文件类型，获取信息文件功能
import java.io.File;
public class FileTest2 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件对象，指代某个文件
        File f1 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\新建 文本文档.txt");

        // 2.判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(f1.exists());// true

        // 3.判断当前文件对象指代的是否是文件，是文件返回true,反之
        System.out.println(f1.isFile()); // true

        // 4.判断当前文件对象指代的是否是文件夹，是文件夹返回true,反之
        System.out.println(f1.isDirectory());// false

        // 5.获取文件的名称 包含后缀
        System.out.println(f1.getName());// 新建 文本文档.txt

        // 6.获取文件的大小，返回字节个数
        System.out.println(f1.length());// 540

        // 7.获取文件的最后修改时间
        System.out.println(f1.lastModified());// 1722664222184

        // 8.获取创建文件对象时，使用的路径
        File f2 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f2.getPath());// file-io-app\src\itheima.txt

        // 9.获取绝对路径
        File f3 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f3.getAbsolutePath());// C:\java-learning\java-note\file-io-app\src\itheima.txt

    }
}
