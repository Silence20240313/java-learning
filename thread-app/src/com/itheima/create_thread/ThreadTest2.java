package com.itheima.create_thread;

// TODO 线程的创建方式二:实现Runnable接口

public class ThreadTest2 {
    public static void main(String[] args) {
       // 3.创建任务对象
        Runnable target = new MyRunnable();
       // 4.把任务对象交给一个线程对象处理
//        new Thread(target).start();

        Thread t = new Thread(target);
        t.start();

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("主线程main输出----" + i);
        }
    }
}
