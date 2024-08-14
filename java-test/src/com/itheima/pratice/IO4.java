package com.itheima.pratice;

import java.io.*;

public class IO4 {
    public static void main(String[] args)throws Exception {
        // TODO IO流:读写数据
        //  输入(input)：外部内容读取到程序中来
        //  输出(output)：在程序中把数据写出去

        // TODO ④字符-输出流：FileWriter
        try(
                // 0.创建一个文件字符输出流管道与目标文件接通（目标文件自动生成）
                Writer fw = new FileWriter("io-app2\\src\\itheima20out.txt",true);
                ) {
            // 1.写一个字符出去
            fw.write('a');
            fw.write(97);
            fw.write('磊');// 写一个字符出去
            fw.write("\r\n");// 换行

            // 2.写一个字符串出去
            fw.write("我爱你中国abc");

            // 3.写字符串的一部分出去
            fw.write("我爱你中国abc",0,5);

            // 4.写一个字符数组出去
            char[] buffer = {'黑','马','a','b','c'};
            fw.write(buffer);

            // 5.写字符数组的一部分出去
            fw.write(buffer,0,2);

            // TODO 把以下内容写道了itheima20out.txt文件中
            // aa磊
            //我爱你中国abc我爱你中国黑马abc黑马aa磊
            //我爱你中国abc我爱你中国黑马abc黑马

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
