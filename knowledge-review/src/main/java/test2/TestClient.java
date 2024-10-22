package test2;

import java.io.*;
import java.net.Socket;

// TODO 客户端
public class TestClient {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动！");
        // TODO 1.套接字：指定服务器的ip和端口号
        Socket s = new Socket("192.168.0.12",8888);
        // TODO 2.对于程序员来说，感受利用输出流在传送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        // TODO 3.传送数据
        dos.writeUTF("你好，服务器，我是客户端");
        // TODO 4.对服务器返回的数据做处理
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器对我说:" + str);
        // TODO 5.关闭流，网络资源
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}

