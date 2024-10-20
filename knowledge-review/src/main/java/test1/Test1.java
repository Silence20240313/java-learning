package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// TODO 目标：读取文件内容
public class Test1 {
    public static void main(String[] args) throws IOException {
        // TODO 1.new文件类对象f，并将路径填入()中
        File f = new File("C:\\io\\test.txt");
        // TODO 2.管道--（将管子怼到文件上--管子和文件相结合）
        FileReader fr = new FileReader(f);
        // TODO 3.开始动作--读取
        //  （一个字符一个字符去读取，什么时候读到-1，说明里面的字符已经被读取完了）
        int n = fr.read();
        while (n != -1){
            System.out.println(n);
            n = fr.read();
        }
        // TODO 4.关闭流操作
        fr.close();
    }
}
