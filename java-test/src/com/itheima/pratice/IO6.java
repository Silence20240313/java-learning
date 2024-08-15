package com.itheima.pratice;

import java.io.*;

public class IO6 {
    public static void main(String[] args){
        // TODO IO流:读写数据
        //  输入(input)：外部内容读取到程序中来
        //  输出(output)：在程序中把数据写出去

        // TODO ⑥字符缓冲输入流：BufferedReader
        //  用了try-catch 就不用写关闭流的操作了
        try(
                Reader fr = new FileReader("io-app2\\src\\itheima04.txt");// Reader 已有的
                // 创建一个字符缓冲输入流包装原始的字符输入流
                Reader br = new BufferedReader(fr);
        ){
            char[] buffer = new char[3];
            int len;
            while ((len = br.read(buffer))!= -1){
                System.out.print(new String(buffer, 0, len));
                //得奖的是
                //眼泪落下之前
                //那个男孩
                //十万伏特
                //某人
                //全城热恋
                //行走的鱼
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
