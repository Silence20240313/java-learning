package com.itheima.reflect;

// TODO 获取类的构造器，并对其进行操作

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors(){
       // 1.反射第一步：必须先得到这个类的class对象
       Class c = Cat.class;
       // 2.获取类的全部构造器
      // Constructor[] constructors =c.getConstructors();
      Constructor[] constructors =c.getDeclaredConstructors();// 推荐
      // 3.遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->"
            + constructor.getParameterCount());
        }
    }
    @Test
    public void testGetConstructor() throws Exception {
        // 1.反射第一步：必须先得到这个类的class对象
        Class c = Cat.class;
        // 2.获取某个构造器-无参构造器
        Constructor constructor1 = c.getDeclaredConstructor();// 推荐
        System.out.println(constructor1.getName() + "--->"
                + constructor1.getParameterCount());
        constructor1.setAccessible(true);// 禁止检查访问权限
        Cat cat = (Cat) constructor1.newInstance();
        System.out.println(cat);

        // 3.获取有参构造器
        Constructor constructor2 =
                c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName() + "--->"
                + constructor2.getParameterCount());
        constructor2.setAccessible(true);// 禁止检查访问权限
        Cat cat2 = (Cat) constructor2.newInstance("叮当猫",3);
        System.out.println(cat2);
    }
}
