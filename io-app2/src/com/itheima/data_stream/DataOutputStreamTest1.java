package com.itheima.data_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// TODO 数据输出流
public class DataOutputStreamTest1 {
    public static void main(String[] args) {
        try(
                // 1.创建一个字节输出流包装低级的字节输出流
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream("io-app2\\src\\itheima10out.txt"));
                ) {
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("黑马程序员666");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
