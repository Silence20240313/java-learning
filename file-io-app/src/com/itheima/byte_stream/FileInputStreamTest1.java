package com.itheima.byte_stream;
// TODO 文件字节输入流：每次读取一个字节

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
     // 1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("file-io-app\\src\\itheima01.txt"));

    // 2.开始读取文件的字节数据
        // 每次读取一个字节返回，如果没有数据了，返回-1
        // int b1 = is.read();
        // System.out.println((char)b1); // a

        // int b2 = is.read();
        // System.out.println((char)b2); // b

        // 3.使用循环改造上述代码
        int b;// 用于记住读取的字节
        while ((b = is.read())!= -1){
            System.out.print((char) b);
        }

        // 读取数据的性能很差
        // 读取汉字输出会乱码 无法避免
        // 流使用完毕之后必须关闭，要释放系统资源
        is.close();
    }
}
