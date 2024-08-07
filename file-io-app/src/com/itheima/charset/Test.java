package com.itheima.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// TODO 使用java代码完成对字符的编码和解码
public class Test {
    public static void main(String[] args) throws Exception {
        // 1.编码
        String data = "a我b";
        byte[] bytes = data.getBytes();// 默认是按照平台字符集进行编码的  UTF-8
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 解码
        String s1 = new String(bytes);// 按照平台默认编码UTF-8解码
        System.out.println(s1);

        String s2 = new String(bytes1,"GBK");
        System.out.println(s2);
    }
}
