## 1.创建Vue CLI项目
#### ①安装Vue CLI
提前安装好Node.js
IDEA的Terminal命令行：
```
npm install -g @vue/cil
```
#### ②创建web应用(项目名称：web)
IDEA的Terminal命令行：
```
vue create web
```
#### ③启动web应用
进入web
```
cd web
```
启动web
```
npm run serve
```
## 2.集成Ant Design Vue
官网：https://antdv.com/docs/vue/getting-started-cn#%E5%BC%95%E5%85%A5-ant-design-vue
#### ①安装流程
进入web
```
cd web
```
安装Ant Design Vue
```
 npm i --save ant-design-vue@4.x
```
#### ②使用Vue默认的模板语法，需要注册组件后才可使用，方法如下
（集成第三方组件，一般都在main.ts里加配置）
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/67a69939-6bca-1d1f-c9de-6a0c07b1f9b5.png)
⭐在主页中配置按钮，复制模板语法到Home.vue文件中，执行web。
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/7ed889a1-2240-74c8-f140-c56db5a55dda.png)
## 3.网站首页布局开发
#### 1.加入Ant Design Vue布局
将布局写在App.vue,将各页面变化的部分放到各自路由页面
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/e1d52cf6-69bf-9f6a-c01f-fbb7b5e577b6.png)
①在App.vue中粘贴布局代码及style,css代码
②添加首页路由：
⭐：router-link标签：路由的跳转（超链接）
⭐：router-view标签:用来填充路由内容
注意：头部尾部是公共部分不变的，所有页面都有的。
中间部分的sider及Content，是变动的，需要设置路由
在App.vue中，将sider及Content剪切，并在当前位置添加router-view标签
sider及Content剪切到home主页的template标签中，用a-layout标签包起来
## 4.制定Vue自定义组件
公共的代码做成公共的组件(组件的名字：the-xxx)
#### ①将header提取成组件
⭐在components包下新建the-header.vue文件
⭐在文件的template标签中：写头部的代码（在App.vue中剪切过来）。添加script部分：：把name改为the-header
```vue 
<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-header',
});
</script>
```
⭐在App.vue中，导入头部组件。在原来的头部位置处添加the-header标签。添加script部分：（绿色部分为改动部分）
```diff
<script lang="ts">
import { defineComponent } from 'vue';
+ import TheHeader  from "@/components/the-header.vue";
export default defineComponent({
+  name: 'app',
  components:{
+   TheHeader,
  },
});
</script>
```
注意：引入组件步骤：
1.import组件页面
2.comonents加入该组件
3.在template中使用组件
#### ②将footer提取成组件
步骤同上：唯一不同在于
```diff
<script lang="ts">
import { defineComponent } from 'vue';
import TheHeader  from "@/components/the-header.vue";
+ import TheFooter  from "@/components/the-footer.vue";
export default defineComponent({
  name: 'app',
  components:{
    TheHeader,
+    TheFooter,
  },
});
</script>
```








