package com.itheima.thread_safe;

public class DrawThread extends Thread {
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
       // 取钱  小明和小红
        acc.drawMoney(100000);
    }
}
