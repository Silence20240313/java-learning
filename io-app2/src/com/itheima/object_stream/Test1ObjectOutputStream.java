package com.itheima.object_stream;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLOutput;

// TODO 对象字节输出流的使用：序列化对象
public class Test1ObjectOutputStream {
    public static void main(String[] args) {
        try(
                // 2.创建一个对象字节输出流包装原始的字节输出流
                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream("io-app2\\src\\itheima11out.txt"));
                ) {
            // 1.创建一个java对象
            User u = new User("admin","张三",32,"666888xyz");
            // 3.序列化对象到文件中去
            oos.writeObject(u);
            System.out.println("序列化对象成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
