package com.itheima.thread_safe;

// TODO 模拟线程安全问题
public class ThreadTest {
    public static void main(String[] args) {
      // 1.创建一个账户对象，代表两个人的共享账户
        Account acc = new Account("ICBC110",100000);
        // 2.创建两个线程，分别代表小明和小红，再去同一个账户对象中取钱10万
        new DrawThread(acc,"小明").start();// 小明
        new DrawThread(acc,"小红").start();// 小红
    }
}
