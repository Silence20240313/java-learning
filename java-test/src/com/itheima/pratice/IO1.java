package com.itheima.pratice;

import java.io.*;

public class IO1 {
    public static void main(String[] args)throws Exception {
        // TODO IO流:读写数据
        //  输入(input)：读取外部文件到这个类中来
        //  输出(output)：在程序中把数据写出去，数据会自动生成到文件中（不需要自己去建文件）

        // TODO ①字节-输入流：FileInputStream   读取文件！！！！！！
        //      首先需要准备一个txt文件（C盘）
        //      把C盘中txt文件的内容读取到程序中（下方输出栏中）
        // 1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("C:\\汪苏泷\\wang.txt"));// 多态写法  C盘txt文件路径
        // 2.使用循环读取文件中的字节
        byte[] buffer = new byte[3];// 字节数组，用来存储读取出来的字节 每次最多读3个字节
        int len;// 记住每次读取了多少个字节
        while ((len = is.read(buffer)) != -1){
            // read：读取字节 放到buffer数组中
            // 读取多少 倒出多少
            String rs = new String(buffer,0,len);// 字节数组转成字符串形式 从0开始读
            System.out.print(rs);// ABCDEFG  打印不要换行
        }
        is.close();// 关闭流
    }
}
