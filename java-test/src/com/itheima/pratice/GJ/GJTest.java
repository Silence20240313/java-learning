package com.itheima.pratice.GJ;

import com.itheima.pratice.GAOJI;
import org.junit.Assert;
import org.junit.Test;

public class GJTest {
    // TODO 测试方法
    //   测试方法上必须声明@Test注解
    //   为业务方法，编写对应的测试方法（必须：公共 无参 无返回值）
    //   在测试方法中，调用被测试的方法进行测试
    @Test
    public void  testlength(){
        int nullLength = GAOJI.length(null);
        //  TODO 断言机制测试方法：
        //   Assert.assertEquals（期待值，返回值的名称）
        Assert.assertEquals(-1,nullLength);

        int strLength = GAOJI.length("汪苏泷");
        Assert.assertEquals(3,strLength);
    }
}
