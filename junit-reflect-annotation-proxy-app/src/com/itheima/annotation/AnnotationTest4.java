package com.itheima.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// TODO 模拟Junit框架的设计
public class AnnotationTest4 {
    public void test1(){
        System.out.println("---test1---");
    }

    @MyTest
    public void test2(){
        System.out.println("---test2---");
    }

    public void test3(){
        System.out.println("---test3---");
    }

    @MyTest
    public void test4(){
        System.out.println("---test4---");
    }

    public static void main(String[] args) throws Exception {
        AnnotationTest4 a = new AnnotationTest4();
        // 启动程序
        // 1.得到class对象
        Class c = AnnotationTest4.class;
        // 2.提取这个类中的全部成员方法
        Method[] methods =  c.getDeclaredMethods();
        // 3.遍历这个数组中的每个方法，看是否存在注解，存在触发该方法执行
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                // 说明当前方法上是存在MyTest注解，触发当前方法执行
                method.invoke(a);
            }
        }
    }
}
