package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyUtil {
    public static Star1 createProxy(Star star){
        // 参数1：用于指定一个类加载器
        // 参数2：指定生成的代理长什么样子，也就是有哪些方法
        // 参数3：用来指定生成的代理对象要干什么事情
        Star1 star1Proxy = (Star1)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), new Class[]{Star1.class},
                new InvocationHandler() {
                    @Override// 回调方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 代理对象要做的事情，会在这里写代码
                        if (method.getName().equals("sing")){
                            System.out.println("准备话筒 收款20万");
                        } else if (method.getName().equals("dance")) {
                            System.out.println("准备场地 收款30万");
                        }
                            return method.invoke(star,args);
                        }
                });
        return star1Proxy;
    }
}
