package com.itheima.byte_stream;
// TODO 文件字节输出流的使用

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamTest4 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件字节输入流管道，与源文件接通
        // 覆盖管道，覆盖之前的数据
        /* OutputStream os =
                new FileOutputStream(("file-io-app\\src\\itheima04out.txt"));*/
        // 追加数据的管道
        OutputStream os =
                new FileOutputStream("file-io-app\\src\\itheima04out.txt",true);
        // 2.开始写字节数据出去了
       os.write(97);// 97就是一个字节 代表a
       os.write('b');// 'b'也是一个字节

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,15);

        // 换行符
       os.write("\r\n".getBytes());

        os.close();// 关闭流
    }
}
