package com.itheima.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

// TODO 打印流
public class PrintTest1 {
    public static void main(String[] args) {

        try (
                // 1.创建一个打印流管道
                // PrintStream ps =
                // new PrintStream("io-app2\\src\\itheima08.txt", Charset.forName("GBK"));
                // PrintStream ps =
                        // new PrintStream("io-app2\\src\\itheima08.txt");
                PrintWriter ps =
                        new PrintWriter("io-app2\\src\\itheima08.txt");
        ) {
            ps.println(97);
            ps.println('a');
            ps.println("我爱你中国abc");
            ps.println(true);
            ps.println(99.5);

            // ps.write(97);//'a'

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
