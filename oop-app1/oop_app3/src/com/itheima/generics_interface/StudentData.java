package com.itheima.generics_interface;

import com.itheima.generics_class.Cat;

import java.util.ArrayList;

public class StudentData implements Data<Cat> {


    @Override
    public void add(Cat cat) {

    }

    @Override
    public ArrayList<Cat> getByName(String name) {
        return null;
    }
}
