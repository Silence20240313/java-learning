package com.itheima.pratice;

import java.io.*;

public class IO7 {
    public static void main(String[] args){
        // TODO IO流:读写数据
        //  输入(input)：读取外部文件到这个类中来
        //  输出(output)：在程序中把数据写出去，数据会自动生成到文件中（不需要自己去建文件）

        // TODO ⑦字符缓冲输出流：BufferedWriter
        //   写字符到itheima30out.txt中去
        try(
                Writer fw = new FileWriter("io-app2\\src\\itheima30out.txt",true);
                // 创建一个字符缓冲输出流管道包装原始的字符输出流
                BufferedWriter bw = new BufferedWriter(fw)
        ){
            bw.write('a');
            bw.write(97);
            bw.write('磊');
            bw.newLine();// 换行

            bw.write("我爱你中国abc");
            bw.newLine();

        } catch (Exception ex) {
            ex.printStackTrace();

            // TODO itheima30out.txt中就有了以下内容
            // aa磊
            //我爱你中国abc
        }
    }
}
