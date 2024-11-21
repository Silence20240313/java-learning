##  SpringBootWeb-快速入门  
![img_1.png](image/image7/img_1.png)    
https://start.spring.io/  
①  会自动生成启动类  
![img_77.png](image/image7/img_77.png)  
②解压文件并放到一个没有中文没有空格的路径下  
③用IDEA打开  
④  
![img_78.png](image/image7/img_78.png)  
请求处理类(要实现什么功能)需要添加注解：stController  
RequestMapping注解后面添加路径  
return：返回执行的结果到路径下  
⑤运行-启动类  
![img_79.png](image/image7/img_79.png)  
⑥打开浏览器测试  
![img_80.png](image/image7/img_80.png)  
ip+端口：localhost:本机ip 8080：默认端口  
###  HTTP协议  
1.  概述  
![img_7.png](image/image7/img_7.png)  
2.  请求协议  
![img_11.png](image/image7/img_11.png)  
![img_9.png](image/image7/img_9.png)  
3.  响应协议  
![img_12.png](image/image7/img_12.png)  
![img_13.png](image/image7/img_13.png)  
![img_15.png](image/image7/img_15.png)  
4.  协议解析  
![img_16.png](image/image7/img_16.png)  
###  Tomcat  
1.  介绍  
![img_17.png](image/image7/img_17.png)  
![img_18.png](image/image7/img_18.png)  
2.  基本使用  
![img_22.png](image/image7/img_22.png)  
![img_23.png](image/image7/img_23.png)  
![img_24.png](image/image7/img_24.png)  
![img_25.png](image/image7/img_25.png)  
![img_26.png](image/image7/img_26.png)  
![img_28.png](image/image7/img_28.png)  
3.  入门程序解析（内嵌tomcat） 
![img_29.png](image/image7/img_29.png)  
![img_30.png](image/image7/img_30.png)  
![img_31.png](image/image7/img_31.png)  
###  请求响应  
1.  概述  
![img_34.png](image/image7/img_34.png)  
2.  postman工具  
![img_35.png](image/image7/img_35.png)  
作用：发送请求到自己写的程序，看返回值，测试程序写的对不对  
3.  简单参数&实体参数  
简单参数：  
繁琐：  
![img_36.png](image/image7/img_36.png)  
![img_40.png](image/image7/img_40.png)  
推荐：  
![img_39.png](image/image7/img_39.png)   
![img_41.png](image/image7/img_41.png)  
![img_42.png](image/image7/img_42.png)  
![img_43.png](image/image7/img_43.png)  
![img_45.png](image/image7/img_45.png)  
![img_46.png](image/image7/img_46.png)  
post:参数隐藏在请求体里面，不在路径上体现，比较安全  用于新增的请求    
请求属性：Body  
get:参数体现在路径上，用于查询的请求  
请求属性：Params  
put:参数隐藏在请求体里面，不在路径上体现，比较安全 用于修改的请求  
请求属性：Body  
delete:参数体现在路径上，用于删除的请求  
请求属性：Params  
实体参数：  
![img_47.png](image/image7/img_47.png)   
![img_48.png](image/image7/img_48.png)  
![img_49.png](image/image7/img_49.png)  
![img_50.png](image/image7/img_50.png)  
![img_51.png](image/image7/img_51.png)  
4.  数组集合参数  
![img_52.png](image/image7/img_52.png)  
![img_53.png](image/image7/img_53.png)  
![img_54.png](image/image7/img_54.png)  
![img_55.png](image/image7/img_55.png)  
![img_56.png](image/image7/img_56.png)  
集合需要在形参前面加注解：@RequestParam  
5.  日期参数&json参数  
![img_57.png](image/image7/img_57.png)  
![img_58.png](image/image7/img_58.png)  
![img_59.png](image/image7/img_59.png)  
![img_60.png](image/image7/img_60.png)  
日期参数：需要在形参前面加注解：@DateTimeFormat(pattern = ""yyyy-MM-dd HH:mm:ss")   
json参数:需要在形参前面加注解：@RequestBody  
![img_81.png](image/image7/img_81.png)  
6.  路径参数  
![img_62.png](image/image7/img_62.png)  
![img_61.png](image/image7/img_61.png)  
![img_63.png](image/image7/img_63.png)  
路径参数：需要在形参前面加注解：@PathVariable  
![img_82.png](image/image7/img_82.png)  
总结：  
![img_64.png](image/image7/img_64.png)  
7.  @ResponseBody&统一响应效果  
作用：正常情况下会返回不同类型的值 比如String List ...   
现在要返回一个统一的值：统一响应结果  
①code:响应码 比如0代表返回成功 1代表返回失败  
②msg: 提示信息  比如 失败啦  成功啦   
③date:返回的数据  比如 String List ...   
![img_65.png](image/image7/img_65.png)  
![img_66.png](image/image7/img_66.png)  
![img_67.png](image/image7/img_67.png)  
![img_68.png](image/image7/img_68.png)  
![img_69.png](image/image7/img_69.png)  
![img_70.png](image/image7/img_70.png)  
![img_72.png](image/image7/img_72.png)  
![img_73.png](image/image7/img_73.png)  
![img_74.png](image/image7/img_74.png)  
![img_71.png](image/image7/img_71.png)  
把类型都改成Result  
###  分层解耦  
1.  三层架构  
![img_83.png](image/image7/img_83.png)  
![img_85.png](image/image7/img_85.png)  
2.  分层解耦   
![img_87.png](image/image7/img_87.png)  
![img_86.png](image/image7/img_86.png)  
3.  IOC&DI入门  
![img_88.png](image/image7/img_88.png)  
![img_89.png](image/image7/img_89.png)  
![img_90.png](image/image7/img_90.png)  
![img_91.png](image/image7/img_91.png)  
不用new方法 就可以直接调用方法  
IOC：类似于一个仓库，所有自动new出来的对象都放在这里，可以直接调用此仓库里对象的方法  
并不是所有new出来的都放在IOC中，只有以下四个注解的new出来放在IOC中  
①Component②Controller③Service④Repository  
DI：从IOC里取出来的对象，放到使用类上  
Autowried:只要有这个注解就说明 这个对象是从IOC中拿出来的 可以直接调用他的方法 
4.  IOC详解  
![img_92.png](image/image7/img_92.png)  
![img_93.png](image/image7/img_93.png)  
5.  DI详解  
![img_95.png](image/image7/img_95.png)  
![img_96.png](image/image7/img_96.png)  


 