## Java高级        

###  单元测试    
1.  概述  
![img_117.png](img_117.png)  
2.  Junit框架快速入门  
![img_118.png](img_118.png)  
![img_119.png](img_119.png)  
![img_120.png](img_120.png)  
3.  Junit框架的常见注解  
![img_121.png](img_121.png)  
![img_123.png](img_123.png)  
![img_122.png](img_122.png)  

###  反射   
1.  认识反射  
![img_125.png](img_125.png)  
2.  获取类  
![img_126.png](img_126.png)  
```java
package com.itheima.reflect;
// TODO 获取class对象
public class Test1Class {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        System.out.println(c1.getName());// 全类名 com.itheima.reflect.Student
        System.out.println(c1.getSimpleName());// 简名 Student

        Class c2 = Class.forName("com.itheima.reflect.Student");
        System.out.println(c1 == c2);// true

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c2);// true
    }
}

```  
3.  获取类的构造器  
![img_127.png](img_127.png)  
```java
package com.itheima.reflect;

// TODO 获取类的构造器，并对其进行操作

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors(){
       // 1.反射第一步：必须先得到这个类的class对象
       Class c = Cat.class;
       // 2.获取类的全部构造器
      // Constructor[] constructors =c.getConstructors();
      Constructor[] constructors =c.getDeclaredConstructors();// 推荐
      // 3.遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->"
            + constructor.getParameterCount());
        }
    }
    @Test
    public void testGetConstructor() throws Exception {
        // 1.反射第一步：必须先得到这个类的class对象
        Class c = Cat.class;
        // 2.获取某个构造器-无参构造器
        // Constructor constructor = c.getConstructor();
        Constructor constructor = c.getDeclaredConstructor();// 推荐
        System.out.println(constructor.getName() + "--->"
                + constructor.getParameterCount());

        // 3.获取有参构造器
        Constructor constructor2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName() + "--->"
                + constructor2.getParameterCount());
    }
}
```
![img_128.png](img_128.png)  
![img_129.png](img_129.png)  
4.  获取类的成员变量  
![img_130.png](img_130.png)  
```java
package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Field;

// TODO 获取类的成员变量，并对其进行操作
public class Test3Field {
    @Test
    public void testGetFields() throws Exception {
      // 1.反射第一步：必须是先得到类的class对象
        Class c = Cat.class;
        // 2.获取类的全部成员变量
        Field[] fields =c.getDeclaredFields();
        // 3.遍历这个成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName() +"-->" + field.getType());
        }
        // 4.定位某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + "-->" + fName.getType());

        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "-->" + fAge.getType());
    }
}

```
![img_131.png](img_131.png)  
![img_132.png](img_132.png)  
5.  获取类的成员方法  
![img_133.png](img_133.png)  
```java
package com.itheima.reflect;
// TODO 获取类的成员方法并对其进行操作

import org.junit.Test;

import java.lang.reflect.Method;

public class Test3Method {
    @Test
    public void testGetMethods() throws Exception {
       // 1.反射第一步：先得到class对象
        Class c = Cat.class;
        // 2.获取类的全部成员方法
        Method[] methods =  c.getDeclaredMethods();
        // 3.遍历这个数组中的每个方法对象
        for (Method method : methods) {
            System.out.println(method.getName() + "--->"
                    + method.getParameterCount() + "--->"
                    +method.getReturnType());
        }
        // 4.获取某个方法对象
        Method run = c.getDeclaredMethod("run");// 拿run方法 无参的
        System.out.println(run.getName() + "--->"
                + run.getParameterCount() + "--->"
                +run.getReturnType());

        Method eat =c.getDeclaredMethod("eat",String.class);
        System.out.println(eat.getName() + "--->"
                + eat.getParameterCount() + "--->"
                +eat.getReturnType());
    }
}

```
![img_134.png](img_134.png)  
![img_135.png](img_135.png)  
6.  作用，应用场景
![img_136.png](img_136.png)  
![img_137.png](img_137.png)  
![img_138.png](img_138.png)  
![img_139.png](img_139.png)  

###  注解    
1.  概述 自定义注解  
![img_146.png](img_146.png)  
![img_147.png](img_147.png)  
![img_148.png](img_148.png)  
![img_149.png](img_149.png)  
2.  元注解  
![img_152.png](img_152.png)  
![img_151.png](img_151.png)  
3.  注解的解析  
![img_153.png](img_153.png)  

4.  应用场景  


###  动态代理    
![img_141.png](img_141.png)  
![img_142.png](img_142.png)  
![img_143.png](img_143.png)  


