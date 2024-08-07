package com.itheima.byte_stream;

// TODO 使用字节流完成对文件的复制操作

import java.io.*;

public class CopyTest5 {
    public static void main(String[] args) throws Exception {
        // 需求：复制照片
        // 1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("C:\\Users\\liang\\OneDrive\\デスクトップ\\test\\1.jpg"));
        // 2.创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("C:\\汪苏泷\\1.jpg");
        // 3.创建一个字节数组，负责转移字节数据
        byte[] buffer = new byte[1024];// 1kb
        // 4.从字节输入流中读取字节数据，写出去到字节输出流中，读多少写出去多少
        int len;// 记住每次读取了多少个字节
        while ((len = is.read(buffer))!= -1){
            os.write(buffer,0,len);
        }
        os.close();
        is.close();
        System.out.println("复制完成");
    }
}
