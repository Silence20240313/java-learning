package com.itheima.tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// TODO TCP通信快速入门-服务端开发，实现1发1收
public class Server {
    public static void main(String[] args)throws Exception {
        System.out.println("服务端启动成功");
        // 1.创建ServerSocket对象同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
        // 2.使用ServerSocket对象调用一个accept方法等待客户端的连接请求
        Socket socket = serverSocket.accept();

        System.out.println("有人上线了："+ socket.getRemoteSocketAddress());

        // 3.把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
        new ServerReaderThread(socket).start();
        }
    }
}
