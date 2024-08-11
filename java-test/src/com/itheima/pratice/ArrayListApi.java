package com.itheima.pratice;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args) {
        // TODO 1.创建一个ArrayList的集合对象
        ArrayList<String> list = new ArrayList<>();

        list.add("黑马");
        list.add("黑马");
        list.add("Java");
        System.out.println(list);//[黑马, 黑马, Java]

        // TODO 2.往集合中的某个索引位置处添加一个数据
        list.add(1,"MYSQL") ;
        System.out.println(list);// [黑马, MYSQL, 黑马, Java]

        // TODO 3.根据索引获取集合中某个索引位置处的值
        String rs =list.get(1);
        System.out.println(rs);// MYSQL

        // TODO 4.获取集合的大小，返回集合中存储的元素个数
        System.out.println(list.size());// 4

        // TODO 5.根据索引删除集合中的某个元素值，会返回被删除的元素值给我们
        System.out.println(list.remove(1));// MYSQL
        System.out.println(list);// [黑马, 黑马, Java]

        // TODO 6.直接删除某个元素值，删除成功会返回true,反之返回false
        System.out.println(list.remove("Java"));// true
        System.out.println(list);// [黑马, 黑马]

        list.add(1,"html");
        System.out.println(list);//[html, 黑马]

        // TODO 默认删除的是第一次出现的这个黑马的数据的
        System.out.println(list.remove("黑马"));// true
        System.out.println(list);// [黑马]

        // TODO 7.修改某个索引位置处的数据，修改后会返回原来的值给我们
        System.out.println(list.set(1, "黑马程序员"));// 黑马
        System.out.println(list);// [html, 黑马程序员]
    }
}
