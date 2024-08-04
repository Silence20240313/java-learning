package com.itheima.tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.SecureCacheResponse;
import java.net.Socket;
import java.util.Scanner;

// TODO TCP通信快速入门-客户端开发，实现1发1收
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建对象Socket并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);

        // 2.从Socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3.把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        // 4.开始写数据出去
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            // 一旦用户输入exit,就退出客户端程序
            if ("exit".equals(msg)){
                System.out.println("欢迎您下次光临，退出成功");
                dos.close();
                socket.close();
                break;
            }

            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
