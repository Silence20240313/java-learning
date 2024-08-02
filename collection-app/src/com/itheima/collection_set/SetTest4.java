package com.itheima.collection_set;

import java.util.Set;
import java.util.TreeSet;

// TODO TreeSet集合的使用
public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);// [5, 6, 7]
    }
}
