##  常用API二    
###  Math System Runtime  
![img_94.png](img_94.png)  
```java
package com.itheima.math;

public class MathTest {
    public static void main(String[] args) {
        // TODO Math类提供的常见方法
        // 1.
        System.out.println(Math.abs(-12));// 12
        System.out.println(Math.abs(123));// 123
        System.out.println(Math.abs(-3.14));// 3.14

        // 2.
        System.out.println(Math.ceil(4.000001));// 5.0
        System.out.println(Math.ceil(4.0));// 4.0

        // 3.
        System.out.println(Math.floor(4.9999999));// 4.0
        System.out.println(Math.floor(4.0));// 4.0

        // 4.
        System.out.println(Math.round(3.49999));// 3
        System.out.println(Math.round(3.500001));// 4

        // 5.
        System.out.println(Math.max(10, 20));// 20
        System.out.println(Math.min(10, 20));// 10

        // 6.
        System.out.println(Math.pow(2, 3));// 8.0   2的3次方
        System.out.println(Math.pow(3, 2));// 9.0   3的2次方

        // 7.
        System.out.println(Math.random());// 随机的 0.4248507561876931
    }
}

```
![img_95.png](img_95.png)  
```java
package com.itheima.math;

public class SystemTest {
    public static void main(String[] args) {
        // TODO System类的常见方法
        // 1.
        //System.exit(0);// 人为的终止虚拟机  不要使用

        // 2.
        long time = System.currentTimeMillis();
        System.out.println(time);// 1722214876826
    }
}

```
![img_96.png](img_96.png)  
```java 
package com.itheima.math;

// Runtime的几个常见方法
public class RuntimeTest {
    public static void main(String[] args) {

        // 1.
        Runtime r = Runtime.getRuntime();

        //2.
        // r.exit(0);

        //3.
        System.out.println(r.availableProcessors());// 12

        //4.
        System.out.println(r.totalMemory());// 268435456

        //5.
        System.out.println(r.freeMemory());// 265413464

        //6.
        // r.exec(""); //输入程序的路径
        // Process p = r.exec("QQ");
        // Thread.sleep(5000);// 让程序在这里暂停五秒后继续往下走
        // p.destroy();// 销毁关闭程序
    }
}

```
###  BigDecimal  

###  JDK8之前传统的日期，时间  

###  JDK8开始新增的日期，时间

###  Arrays  

###  JDK8新特性：Lambda表达式 

###  JDK8新特性：方法引用  

