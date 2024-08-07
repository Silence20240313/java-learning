package com.itheima.byte_stream;
// TODO 文件字节输入流：一次性读取完文件的全部字节

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 1.一次性读取完文件的全部字节到一个字节数组中去
        // 创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("file-io-app\\src\\itheima03.txt"));

        // 2.准备一个字节数组，大小与文件的大小正好一样大
        /*  File f = new File("file-io-app\\src\\itheima03.txt");
        long size = f.length();
        byte[] buffer = new byte[(int)size];

        int len = is.read(buffer);
        System.out.println(new String(buffer));

        System.out.println(size);// 121
        System.out.println(len);// 121  */

        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
