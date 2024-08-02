package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO Collections集合工具类的使用
public class CollectionsTest1 {
    public static void main(String[] args) {

        // 1.为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三","李四","王五","赵六");
        System.out.println(names);// [张三, 李四, 王五, 赵六]

        // 2.打乱LIST集合中的元素顺序
        Collections.shuffle(names);
        System.out.println(names);// 打乱顺序

        // 3.对LIST集合中的元素进行升序排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);// [2, 3, 5]

        // 4.对LIST集合中元素，按照比较器对象指定的规则进行
    }
}
