package com.itheima.thread_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 描述任务是干啥的
        System.out.println(Thread.currentThread().getName()+"---> 输出666");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
