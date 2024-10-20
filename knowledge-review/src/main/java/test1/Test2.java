package test1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// TODO 目标：将程序中的内容输出到文件中去
public class Test2 {
    public static void main(String[] args) throws IOException {
        // TODO 1.程序中的字符串
        String str = "abc你好";
        // TODO 2.new文件类对象f,并设置对应的路径及文件名
        File f = new File("C:\\io\\test111.txt");
        // TODO 3.管道--（将管子怼到文件上--管子和文件相结合）
        FileWriter fw = new FileWriter(f);
        // TODO 4.开始动作--输出
        fw.write(str);
        // TODO 5.关闭流操作
        fw.close();
    }
}
