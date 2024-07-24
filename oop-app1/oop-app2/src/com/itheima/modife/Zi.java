package com.itheima.modife;

import com.itheima.modifer.Fu;

public class Zi extends Fu {
    public void test(){
        // privateMethod(); // 报错
        // method(); // 报错
        protectedMethod();
        publicMethod();
    }
}
