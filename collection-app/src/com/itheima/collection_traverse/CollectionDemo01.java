package com.itheima.collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// TODO Collection集合的遍历方式一：使用迭代器Iterator遍历
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);
        // c =  [赵敏, 小昭, 素素, 灭绝]
        //         it

        // 使用迭代器遍历集合
        // 1.从集合对象中获取迭代器对象
        Iterator<String> it =  c.iterator();
        // System.out.println(it.next());// 赵敏
        // System.out.println(it.next());// 小昭
        // System.out.println(it.next());// 素素
        // System.out.println(it.next());// 灭绝
        // System.out.println(it.next());// 出现异常

        // 2.使用循环结合迭代器遍历集合
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
            // 赵敏
            // 小昭
            // 素素
            // 灭绝
            // System.out.println(it.next());  × 别用
        }
    }
}
