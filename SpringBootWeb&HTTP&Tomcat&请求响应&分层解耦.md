##  SpringBootWeb-快速入门  
![img_1.png](img_1.png)    
https://start.spring.io/  
①  会自动生成启动类  
![img_77.png](img_77.png)  
②解压文件并放到一个没有中文没有空格的路径下  
③用IDEA打开  
④  
![img_78.png](img_78.png)  
⑤运行-启动类  
![img_79.png](img_79.png)  
⑥打开浏览器测试  
![img_80.png](img_80.png)  

###  HTTP协议  
1.  概述  
![img_7.png](img_7.png)  
2.  请求协议  
![img_11.png](img_11.png)  
![img_9.png](img_9.png)  
3.  响应协议  
![img_12.png](img_12.png)  
![img_13.png](img_13.png)  
![img_15.png](img_15.png)  
4.  协议解析  
![img_16.png](img_16.png)  
###  Tomcat  
1.  介绍  
![img_17.png](img_17.png)  
![img_18.png](img_18.png)  
2.  基本使用  
![img_22.png](img_22.png)  
![img_23.png](img_23.png)  
![img_24.png](img_24.png)  
![img_25.png](img_25.png)  
![img_26.png](img_26.png)  
![img_28.png](img_28.png)  
3.  入门程序解析（内嵌tomcat） 
![img_29.png](img_29.png)  
![img_30.png](img_30.png)  
![img_31.png](img_31.png)  
###  请求响应  
1.  概述  
![img_34.png](img_34.png)  
2.  postman工具  
![img_35.png](img_35.png)  
3.  简单参数&实体参数  
简单参数：  
繁琐：  
![img_36.png](img_36.png)  
![img_40.png](img_40.png)  
推荐：  
![img_39.png](img_39.png)   
![img_41.png](img_41.png)  
![img_42.png](img_42.png)  
![img_43.png](img_43.png)  
![img_45.png](img_45.png)  
![img_46.png](img_46.png)  
实体参数：  
![img_47.png](img_47.png)   
![img_48.png](img_48.png)  
![img_49.png](img_49.png)  
![img_50.png](img_50.png)  
![img_51.png](img_51.png)  
4.  数组集合参数  
![img_52.png](img_52.png)  
![img_53.png](img_53.png)  
![img_54.png](img_54.png)  
![img_55.png](img_55.png)  
![img_56.png](img_56.png)  
集合需要在形参前面加注解：@RequestParam  
5.  日期参数&json参数  
![img_57.png](img_57.png)  
![img_58.png](img_58.png)  
![img_59.png](img_59.png)  
![img_60.png](img_60.png)  
日期参数：需要在形参前面加注解：@DateTimeFormat(pattern = ""yyyy-MM-dd HH:mm:ss")   
json参数:需要在形参前面加注解：@RequestBody  
![img_81.png](img_81.png)  
6.  路径参数  
![img_62.png](img_62.png)  
![img_61.png](img_61.png)  
![img_63.png](img_63.png)  
路径参数：需要在形参前面加注解：@PathVariable  
![img_82.png](img_82.png)  
总结：  
![img_64.png](img_64.png)  
7.  @ResponseBody&统一响应效果  
![img_65.png](img_65.png)  
![img_66.png](img_66.png)  
![img_67.png](img_67.png)  
![img_68.png](img_68.png)  
![img_69.png](img_69.png)  
![img_70.png](img_70.png)  
![img_72.png](img_72.png)  
![img_73.png](img_73.png)  
![img_74.png](img_74.png)  
![img_71.png](img_71.png)  
把类型都改成Result  
###  分层解耦  
1.  三层架构  

2.  IOC-DI引入  

3.  IOC&DI入门  

4.  IOC&DI-IOC详解  

5.  IOC&DI-DI详解  


 