package com.itheima.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// TODO 异常的处理
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();// 打印异常对象的信息，记录下来
        } catch (ParseException e) {
            System.out.println("解析的时间有问题");
            e.printStackTrace();// 打印异常对象的信息，记录下来
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11  10:24");
        System.out.println(d);
        test2();
    }
    public static void test2() throws FileNotFoundException {
        // 读取文件的
        InputStream s = new FileInputStream("D:/meinv.png");
    }
}
