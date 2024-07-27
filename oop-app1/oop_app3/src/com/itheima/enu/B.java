package com.itheima.enu;
// 扩展：抽象枚举
public enum B {
    X(){
        @Override
        public void go() {

        }
    },Y("张三"){
        @Override
        public void go() {
            System.out.println(getName() + "在跑");
        }
    };
    private String name;

    B() {
    }

    B(String name) {
        this.name = name;
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
