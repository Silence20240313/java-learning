package com.itheima.proxy;
public class Star implements Star1 {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name + "正在唱:" + name);
        return "谢谢";
    }
    public void dance(){
        System.out.println(this.name + "正在跳舞");
    }
}
