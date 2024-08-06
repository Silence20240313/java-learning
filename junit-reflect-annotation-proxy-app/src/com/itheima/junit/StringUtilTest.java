package com.itheima.junit;

import org.junit.*;

import java.net.Socket;

// 测试类
public class StringUtilTest {
    @Before
    public void test1(){
        System.out.println("---> test1  Before执行了---");
    }

    @BeforeClass
    public static void test11(){
        System.out.println("---> test11  BeforeClass执行了---");
    }

    @After
    public void test2(){
        System.out.println("---> test2  After执行了---");
    }

    @AfterClass
    public static void test22(){
        System.out.println("---> test22  AfterClass执行了---");
    }

    @Test // 测试方法
    public void testPrintNumber(){
        StringUtil.printNumber("admin");// 5
        StringUtil.printNumber(null);// 0
    }

        @Test // 测试方法
        public void testGetMaxIndex(){
            int index1 = StringUtil.getMaxIndex(null);
            System.out.println(index1);// -1

            int index2 =StringUtil.getMaxIndex("admin");
            System.out.println(index2);// 4

            // 断言机制：程序员可以通过预测业务方法的结果
            Assert.assertEquals("方法内部有bug",4,index2);



        }
}
