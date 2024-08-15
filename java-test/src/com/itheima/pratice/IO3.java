package com.itheima.pratice;

import java.io.*;

public class IO3 {
    public static void main(String[] args)throws Exception {
        // TODO IO流:读写数据
        //  输入(input)：外部内容读取到程序中来
        //  输出(output)：在程序中把数据写出去

        // TODO ③字符-输入流：FileReader  读取文件内容！！！
        //      首先需要准备一个txt文件（C盘）
        //      把C盘中txt文件的内容读取到程序中（下方输出栏中）
        try(
                // 1.创建文件字符输入流管道，与源文件接通
                Reader fr = new FileReader(("C:\\汪苏泷\\sulong.txt"));// 多态写法  C盘txt文件路径
                ) {
                // 2.读取文本文件的内容
            char[] buffer = new char[3];
            int len;// 记住每次读取了多少个字符
            while ((len = fr.read(buffer)) != -1){
                // 读取多少 倒出多少
                System.out.print(new String(buffer, 0, len));// 打印不换行 字符数组转成字符串形式
                // 汪苏泷
                // 123
                // ABC
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
