package com.itheima.transform_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

// TODO 不同编码读取乱码的问题
public class Test1 {
    public static void main(String[] args) {
        try(     // 1.创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("io-app2\\src\\itheima04.txt");
                // 2.把文件字符输入流包装成缓冲字符输入流
                 BufferedReader br = new BufferedReader(fr);
                ) {
                String line;
                while ((line= br.readLine()) != null){
                    System.out.println(line);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
