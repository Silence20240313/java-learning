package com.itheima.byte_stream;
// TODO 文件字节输入流：每次读取多个字节

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件字节输入流管道，与源文件接通
        InputStream is = new FileInputStream(("file-io-app\\src\\itheima02.txt"));

        // 2.开始读取文件中的字节数据，每次读取多个字节
        // 每次读取多个字节到字节数组中去，返回读取的字节数量，读取完毕会返回-1
        /* byte[] buffer = new byte[3];
        int len = is.read(buffer);
        String rs = new String(buffer);
        System.out.println(rs);// abc
        System.out.println(len);// 当次读取的字节数量  3

        int len2 = is.read(buffer);
        String rs2 = new String(buffer,0,len2);
        System.out.println(rs2);// 66
        System.out.println(len2);// 当次读取的字节数量  2

        int len3 = is.read(buffer);
        System.out.println(len3);// -1 */

        // 3.使用循环改造
        byte[] buffer = new byte[3];
        int len;// 记住每次读取了多少个字节
        while ((len = is.read(buffer)) != -1){
            // 注意：读取多少 倒出多少
            String rs = new String(buffer,0,len);
            System.out.print(rs);// abc66
        }

        // 性能得到了明显的提升
        // 这种方案也不能避免读取汉字输出乱码的问题

        is.close();// 关闭流
    }
}
