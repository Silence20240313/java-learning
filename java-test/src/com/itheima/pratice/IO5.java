package com.itheima.pratice;

import java.io.*;

public class IO5 {
    public static void main(String[] args){
        // TODO IO流:读写数据
        //  输入(input)：读取外部文件到这个类中来
        //  输出(output)：在程序中把数据写出去，数据会自动生成到文件中（不需要自己去建文件）

        // TODO ⑤字节缓冲流：BufferedInputStream/BufferedOutputStream
        try(
                // TODO  复制文件：把itheima01.txt里的内容复制一份，复制到itheima01_bak.txt里面
                InputStream is = new FileInputStream("io-app2\\src\\itheima01.txt");// 已有的文件和内容
                // 1.定义一个字节缓冲输入流包装原始的字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("io-app2\\src\\itheima01_bak.txt");// 不需要自己建这个文件
                // 2.定义一个字节缓冲输出流包装原始的字节输出流
                OutputStream bos = new BufferedOutputStream(os);
                ) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
