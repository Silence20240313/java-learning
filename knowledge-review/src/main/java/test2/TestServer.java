package test2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// TODO 服务端
public class TestServer {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动！");
        // TODO 1.套接字
        ServerSocket ss = new ServerSocket(8888);
        // TODO 2.等待客户端发送数据
        Socket s = ss.accept();
        // TODO 3.服务器端感受到的输入流
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        // TODO 4.接收客户端发送的数据
        String str = dis.readUTF();
        System.out.println("客户端说:" + str);
        // TODO 5.向客户端发送数据
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，客户端，我接收到你的消息了");
        // TODO 6.关闭流，网络资源
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}

