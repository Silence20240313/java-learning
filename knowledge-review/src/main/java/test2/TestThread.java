package test2;

// TODO 2.创建一个线程类:TestThread
//  想要具备多线程的能力:extends Thread
public class TestThread extends Thread {
    // TODO 线程对应的任务放在一个方法中
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println( "子线程执行啦" + i);
        }
    }
}
