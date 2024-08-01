package com.itheima.collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// TODO Set系列集合的特点
public class SetTest1 {
    public static void main(String[] args) {
        // 1.创建一个Set集合的对象
         Set<Integer> set = new HashSet<>();// 创建了一个HashSet的集合对象  经典代码 无序不重复无索引 // [888, 777, 666, 555]
        // Set<Integer> set = new LinkedHashSet<>();// 有序 不重复 无索引  [666, 555, 888, 777]
        // Set<Integer> set = new TreeSet<>();// 可排序 不重复 无索引  [555, 666, 777, 888]
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);//
    }
}
