package com.itheima.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IO2 {
    public static void main(String[] args)throws Exception {
        // TODO IO流:读写数据
        //  输入(input)：外部内容读取到程序中来
        //  输出(output)：在程序中把数据写出去

        // TODO ②字节-输出流：FileOutputStream
        //  需求：复制照片（从C盘汪苏泷文件夹复制一张照片到演唱会文件夹）
        // 1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("C:\\汪苏泷\\1.jpg"));// 旧 从哪儿拷贝
        // 2.创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("C:\\演唱会\\1.jpg");// 新 拷贝到哪儿去
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
