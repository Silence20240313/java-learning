package com.itheima.annotation;
@MyTest1(aaa="牛魔王",ccc={"HTML","JAVA"})
@MyTest2("孙悟空")
public class Annotation {

    @MyTest1(aaa="铁扇公主",bbb= false,ccc={"Python","前端","JAVA"})
    public void test1(){

    }

    public static void main(String[] args) {

    }
}
