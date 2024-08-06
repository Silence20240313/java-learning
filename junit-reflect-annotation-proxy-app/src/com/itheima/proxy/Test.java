package com.itheima.proxy;

public class Test {
    public static void main(String[] args) {
        Star s = new Star("杨超越");
        Star1 starProxy = ProxyUtil.createProxy(s);

        String rs = starProxy.sing("好日子");
        System.out.println(rs);

        starProxy.dance();
    }
}
