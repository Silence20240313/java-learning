package com.itheima.char_stream;

// TODO 字符输出流使用时的注意事项

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest3 {
    public static void main(String[] args) throws Exception {
                Writer fw = new FileWriter("io-app2\\src\\itheima03out.txt");

            // 写字符数据出去
            fw.write('a');
            fw.write('b');
            fw.write('c');
            fw.write('d');
            fw.write("\r\n");// 换行

            fw.write("我爱你中国");
            fw.write("\r\n");// 换行
            fw.write("我爱你中国");

            fw.close();//关闭流，包含刷新操作
    }
}
