package com.itheima.pratice;

import com.itheima.pratice.DT.Action;
import com.itheima.pratice.DT.Parents;
import com.itheima.pratice.DT.People;
import org.junit.Test;

public class DuoTai {
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