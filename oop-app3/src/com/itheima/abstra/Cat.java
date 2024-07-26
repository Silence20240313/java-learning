package com.itheima.abstra;

import java.sql.SQLOutput;

public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println(getName()+"喵喵喵");
    }
}
