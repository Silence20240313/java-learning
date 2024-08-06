package com.itheima.reflect;

// TODO 使用反射技术，设计一个保存对象的简易版框架

import org.junit.Test;

public class Test5Frame {
    @Test
    public void save() throws Exception {
        Student1 s1 = new Student1("黑马吴彦祖",45,'男',
                185.3,"篮球");
        Teacher t1 = new Teacher("波妞",999.9);

        // 需求：把任意对象的字段名和其对应的值等信息，保存到文件中去
        ObjectFrame.saveObject(t1);
        ObjectFrame.saveObject(s1);
    }
}
