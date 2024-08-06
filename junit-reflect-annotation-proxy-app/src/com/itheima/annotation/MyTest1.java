package com.itheima.annotation;

// TODO 自定义注解

public @interface MyTest1 {
    String aaa();
    boolean bbb() default true;
    String[] ccc();
}
