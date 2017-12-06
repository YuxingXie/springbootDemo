### 构建一个springboot web应用程序
除非特别喜欢maven，推荐使用gradle版本，gradle版本见 https://github.com/YuxingXie/springBootDataJpaGradle

####构建内容包括：
- maven
- spring-boot 
- spring-data-jpa  
- springmvc
- Thymeleaf
#### 应用介绍 ####  
参考书籍：[美] Craig Walls 沃尔斯. Spring实战（第4版）  
  

应用是一个简单的联系人列表。它允许用户输入联系人信息（名字、电话号码以及Email地址），
并且能够列出用户之前输入的所有联系人信息。  

目前没有使用gradle，暂用maven。

#### 一些知识点

- spring-boot环境要求  
  servlet3.0以上版本，如tomcat7
- 默认页面映射路径：  
classpath:/templates/*.html
- 静态文件路径:  
classpath:/static/
- Thymeleaf是xhtml，必须严格编写
- 如何启动springboot  
用maven package打成jar(not war)包，包在target目录中，命令行java -jar target/jpa.jar启动springboot.
如果使用的IDE是intellij idea，可以点击tool button中的MavenProjects，找到Plugins-->spring-boot-->spring-boot:run运行，也可以右击spring-boot:run-->Create 'xxx[spring-boot:run]',这样会创建一个快捷run按钮。

### 整合spring-data-jpa(mysql为例)
- mysql建表
```sql
CREATE TABLE user(
        id char(20) not null primary key,
        name char(20),
        age int
    );
```
- 配置数据源
需要添加的依赖见pom.xml

- 创建repository类
### 一些问题
- intellij 无法解析thymeleaf表达式
- 如何在IDE中进行debug
- 因为我比较懒，没有真正实现jpa


  


 