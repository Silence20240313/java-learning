package com.itheima.pratice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KuangJia1 {
    @Test
    public void demo11(){
        // TODO Collection：单列  （ArrayList，HashSet）
        // TODO ArrayList框架：有序 可重复 有索引
        ArrayList<Long> list = new ArrayList<>();
        list.add(5l);// add 添加元素
        list.add(10l);
        list.add(15l);
        list.add(20l);
        System.out.println(list.size());// 4
        System.out.println(list.isEmpty());// false 判断是否为空
        System.out.println(list.remove(2));// 15  移除元素
        System.out.println(list);// [5, 10, 20]
        System.out.println(list.contains(20l));// true  是否包含某个元素
        // TODO 增强for循环遍历
        //   遍历格式：for（元素的数据类型 变量名 ： 数组或者集合）{
        //             变量名.sout  }
        //    变量名：需要起一个名字
        for (Long l : list ){
            System.out.println(l);
        }
        // TODO fori循环遍历
        for (int i = 0; i < list.size(); i++) {
            long l = list.get(i);
            System.out.println(l);
            // get：用于获取列表中指定位置的元素。
        }
    }
    @Test
    public void demo12(){
        // TODO HashSet框架：无序 不重复 无索引
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        System.out.println(set.size());// 4
        System.out.println(set.remove("赵六"));// true  HashSet无索引 不能用索引
        System.out.println(set);// [李四, 张三, 王五]
        System.out.println(set.contains("前七"));// false
        // TODO 增强for循环遍历
        for (String s :set ){
            System.out.println(s);
        }
    }
}
