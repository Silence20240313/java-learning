package com.itheima.interfac_attention;

public class Test {
    public static void main(String[] args) {
        // TODO 接口的多继承

    }
}

interface A{
    void test1();
}
interface B{
    void test2();
}
interface C{}
// 接口多继承
interface D extends C,B,A{

}

class E implements D{

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}

