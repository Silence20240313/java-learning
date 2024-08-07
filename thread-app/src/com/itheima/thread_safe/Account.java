package com.itheima.thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;// 卡号
    private double money;// 余额
    // 创建了一个锁对象
    private final Lock lk = new ReentrantLock();
    public Account() {
    }
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    // 小明和小红同时过来的
    // 同步方法
    public  void drawMoney(double money) {
        // 先搞清楚谁来取钱
        String name = Thread.currentThread().getName();
        lk.lock();// 加锁
        // 1.判断余额是否足够
        try {
            if (this.money >= money){
                System.out.println(name + "来取钱" + money + "成功");
                this.money -= money;
                System.out.println(name +"来取钱后，余额剩余：" +this.money);
            }else{
                System.out.println(name + "来取钱，余额不足");
        }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock();// 解锁
        }

    }
    public String getCardId() {
        return cardId;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
