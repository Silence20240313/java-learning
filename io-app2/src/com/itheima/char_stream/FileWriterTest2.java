package com.itheima.char_stream;

// TODO 文件字节输出流：写字符数据出去

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {
    public static void main(String[] args) {
        try(
                //0.创建一个文件字符输出流管道与源文件接通
                // 覆盖管道
                // Writer fw = new FileWriter("io-app2\\src\\itheima02out.txt");
                // 追加数据管道
                Writer fw = new FileWriter("io-app2\\src\\itheima02out.txt",true);
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
