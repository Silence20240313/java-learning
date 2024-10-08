##  Vue  
###  Vue快速入门  
Vue:html,js,css的结合体，框架！  
![img.png](image/image6/img.png)  
![img_1.png](image/image6/img_1.png)  
![img_26.png](image/image6/img_26.png)  
data对象中定义了一个message属性  
数据模型将被绑定到视图中，并且可以动态地更新视图内容  
v-model="message"用于实现双向数据绑定，当你在输入框中输入内容时，message的值会动态更新  
{{ message }}会实时显示message的值  
实现数据的双向绑定，用户输入的内容会自动更新绑定的数据，并且更新后的数据也会自动反映在视图上  
###  Vue常用指令   
![img_2.png](image/image6/img_2.png)  
![img_8.png](image/image6/img_8.png)  
![img_9.png](image/image6/img_9.png)  
![img_10.png](image/image6/img_10.png)  
![img_11.png](image/image6/img_11.png)  
![img_12.png](image/image6/img_12.png)  
![img_27.png](image/image6/img_27.png)  
![img_28.png](image/image6/img_28.png)  
![img_29.png](image/image6/img_29.png)  
![img_30.png](image/image6/img_30.png)  
![img_31.png](image/image6/img_31.png)  
![img_32.png](image/image6/img_32.png)  
![img_33.png](image/image6/img_33.png)  
常用指令：  
①v-bind:为标签绑定属性值，如href css样式   
②v-model:表单元素上创建双向绑定  
③v-on:为标签绑定事件  
④v-if  v-else-if  v-else:条件性的渲染  
⑤v-show:根据条件展示  
⑥v-for:遍历元素或属性  
Vue三部曲：  
①引入Vue.js文件  
②创建Vue核心对象，定义数据模型  
③编写视图  
###  Vue生命周期   
![img_5.png](image/image6/img_5.png)    
![img_6.png](image/image6/img_6.png)  
![img_34.png](image/image6/img_34.png)  
![img_35.png](image/image6/img_35.png)  
##  Ajax   
![img_13.png](image/image6/img_13.png)  
![img_14.png](image/image6/img_14.png)  
1.  Axios  
![img_18.png](image/image6/img_18.png)    
![img_36.png](image/image6/img_36.png)  
![img_21.png](image/image6/img_21.png)    
步骤：  
①引入Axios的js文件  
②使用Axios发送请求，并获取响应结果  
2.  案例  
![img_22.png](image/image6/img_22.png)  


##  前端工程化  
1.  环境准备  
下载：Nodejs     安装：vue-cli  
![img_25.png](image/image6/img_25.png)  
![img_37.png](image/image6/img_37.png)  
2.  Vue项目简介  
vue项目创建：命令行 vue create vue-project01  
命令行启动：npm run serve   终止：ctrl+c  
![img_38.png](image/image6/img_38.png)  
![img_50.png](image/image6/img_50.png)  
![img_51.png](image/image6/img_51.png)  
![img_52.png](image/image6/img_52.png)  
3.  Vue项目开发流程  
![img_55.png](image/image6/img_55.png)  
![img_57.png](image/image6/img_57.png)   
Vue三部曲：  
①< template > :html代码  
②< script >:创建对象  
③< style >:css样式  

##  Vue组件库Element  
![img_40.png](image/image6/img_40.png)  
好看的组件：超链接 按钮 图片 表格 表单 分页条等  
1.  快速入门  
![img_41.png](image/image6/img_41.png)  
2.  常见组件  
element ui 网址：https://element.eleme.io/#/zh-CN  
从网站上复制下来的代码 放在< template >标签中  
新建一个vue项目：  
①建工程：文件夹内打开命令行，输入vue create 项目名称（vue-project01）  
②在vscode中打开工程文件夹  
③创建vue组件，输入三件套  
![img_98.png](image/image6/img_98.png)  
![img_97.png](image/image6/img_97.png)    
![img_99.png](image/image6/img_99.png)  
![img_100.png](image/image6/img_100.png)  
①Table表格  
![img_61.png](image/image6/img_61.png)  
ctrl+alt+l:代码格式化  
②Pagination分页  
![img_65.png](image/image6/img_65.png)  
③Dialog对话框  
![img_66.png](image/image6/img_66.png)  
④From表单  
![img_67.png](image/image6/img_67.png)  
![img_68.png](image/image6/img_68.png)  
![img_69.png](image/image6/img_69.png)  
![img_70.png](image/image6/img_70.png)  
![img_71.png](image/image6/img_71.png)  
![img_72.png](image/image6/img_72.png)  
![img_73.png](image/image6/img_73.png)  
![img_74.png](image/image6/img_74.png)  
![img_75.png](image/image6/img_75.png)  
3.  案例    
![img_76.png](image/image6/img_76.png)    
![img_78.png](image/image6/img_78.png)   
![img_79.png](image/image6/img_79.png)   
![img_80.png](image/image6/img_80.png)  
①基本页面布局  
②页面组件实现  
③axios异步加载数据  
![img_82.png](image/image6/img_82.png)  
![img_83.png](image/image6/img_83.png)  
![img_84.png](image/image6/img_84.png)  
![img_85.png](image/image6/img_85.png)  
##  Vue路由  
![img_86.png](image/image6/img_86.png)  
![img_88.png](image/image6/img_88.png)  
![img_89.png](image/image6/img_89.png)  
![img_90.png](image/image6/img_90.png)  
![img_91.png](image/image6/img_91.png)  
![img_92.png](image/image6/img_92.png)  
![img_93.png](image/image6/img_93.png)  
![img_101.png](image/image6/img_101.png)  
![img_102.png](image/image6/img_102.png)  
##  打包部署  
打包：命令行：npm run build  
打包出来的文件在dist中  
部署：①打包好的dist目录下的文件复制到NGINX的HTML文件夹中  
②双击nginx文件  
![img_94.png](image/image6/img_94.png)  
![img_95.png](image/image6/img_95.png)  
![img_96.png](image/image6/img_96.png)  

##  maven  
1.  安装配置    
![img_43.png](image/image6/img_43.png)  
2.  IDEA集成Maven  
①配置Maven环境  
![img_46.png](image/image6/img_46.png)  
![img_47.png](image/image6/img_47.png)  
②创建Maven项目  
![img_48.png](image/image6/img_48.png)  
![img_58.png](image/image6/img_58.png)  
③导入Maven项目  
![img_59.png](image/image6/img_59.png)  
![img_60.png](image/image6/img_60.png)  
3. 依赖管理    
①依赖配置    
![img_104.png](image/image6/img_104.png)  
![img_105.png](image/image6/img_105.png)  
![img_106.png](image/image6/img_106.png)  
②依赖传递    
![img_107.png](image/image6/img_107.png)  
![img_109.png](image/image6/img_109.png)  
③依赖范围     
![img_110.png](image/image6/img_110.png)  
④生命周期    
![img_112.png](image/image6/img_112.png)  
![img_113.png](image/image6/img_113.png)  
![img_114.png](image/image6/img_114.png)  


