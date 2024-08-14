package com.itheima.pratice.DXC;

import java.util.concurrent.Callable;

public class Dxc3 implements Callable<String> {

    private int n;
    // 有参构造器
    public Dxc3(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
       if (n >= 95){
           return "棒极了";
       }else {
           return "继续努力";
       }
    }
}
