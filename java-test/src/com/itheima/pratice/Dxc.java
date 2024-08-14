package com.itheima.pratice;

import com.itheima.pratice.DXC.Dxc1;
import com.itheima.pratice.DXC.Dxc2;
import com.itheima.pratice.DXC.Dxc3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Dxc {

    public static void main(String[] args) throws Exception {
        // TODO 多线程的创建方式一：继承Thread类
        //   ①定义一个子类继承Thread
        //   ②子类中重写run方法
        //   ③测试类中创建子类对象
        //   ④启动线程：子类对象.start()
        Thread t = new Dxc1();
        t.start();

        System.out.println("111主线程main方法执行啦！");

        // TODO 多线程的创建方式二：实现Runnable接口
        //  ①定义一个子类实现Runnable接口
        //  ②子类中重写run方法
        //  ③测试类中创建子类对象
        //  ④把子类对象交给Thread处理，启动线程  new Thread(r).start();
        Runnable r = new Dxc2();
        new Thread(r).start();

        System.out.println("222主线程main方法执行啦！");

        // TODO 多线程的创建方式三：实现Callable接口
        //  ①定义一个子类实现Callable接口(要返回的类型)
        //  ②子类中重写call方法
        //  ③子类中封装要做的事情，和要返回的数据（写变量，构造器，方法...）
        //  ④测试类中创建子类对象
        //  ⑤把子类对象封装成一个FutureTask对象（获取线程执行完毕后的结果）
        //  ⑥把FutureTask对象交给Thread对象,并启动
        //  ⑦通过FutureTask对象的get方法获取执行结果
        Callable<String> c = new Dxc3(100);// 填入类型和参数
        FutureTask<String> f = new FutureTask<>(c);// 第五步
        new Thread(f).start();// 第六步
        System.out.println(f.get());
    }
}
