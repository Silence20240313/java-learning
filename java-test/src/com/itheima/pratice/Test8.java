package com.itheima.pratice;

import org.junit.Test;

public class Test8 {
    @Test
    public void demo8(){
        // TODO 多态
        People p = new Parents();
        // TODO 调用方法
        p.eat();
    }

    @Test
    public void demo9(){
        // TODO 多态
        Action a = new Parents();
        // TODO 调用方法
        a.study();
        a.work();
    }
}
