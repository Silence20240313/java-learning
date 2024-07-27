package com.itheima.generics_interface;

import com.itheima.generics_class.Animal;

import java.util.ArrayList;

// 泛型接口
public interface Data<T extends Animal> {
    void add(T t);
    ArrayList<T>getByName(String name);
}
