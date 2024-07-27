package com.itheima.generics_class;

public class Test {
    public static void main(String[] args) {
        // TODO 泛型类的定义和使用
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<Cat,String> c2 = new MyClass2<>();
        MyClass3<Animal> c3 = new MyClass3<>();
        MyClass3<Dog> c4 = new MyClass3<>();
    }
}
