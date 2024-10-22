package test2;

public class Test1 {
    public static void main(String[] args) {
        // TODO 1.main方法作为程序的入口，里面执行的逻辑就是主线程的任务
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main方法主线程执行啦！" + i);
        }

        // TODO 3.创建子线程对象，执行任务
        TestThread t = new TestThread();
        // TODO 将线程启动 一旦子线程启动，就会和主线程争抢资源
        t.start();

        // TODO 4.主线程中再加入一个循环
        for (int i = 1; i <= 50 ; i++) {
            System.out.println("main方法中第二个循环执行啦！" + i);
        }
    }
}
