#### 多模块项目构建
---

> **项目模块**
>> user-core  
>> user-log  
>> user-web  
>> user-service  
>> user-remote-web  
---

#### 项目构建
项目构建步骤如下：  
1. 创建多模块项目：MultiModule   maven-archetype-quickstart  
2. 构建项目子模块  
　2.1 构建user-core模块  maven-archetype-quickstart  
　2.2 构建user-log模块  maven-archetype-quickstart  
　2.3 构建user-web  maven-archetype-wepapp   
　2.4 构建user-service模块  maven-archetype-quickstart  

#### 项目功能：MultiModule
1. 声明项目中需要的公共属性：properties  
1.1  版本变量  
1.2  编码属性  
2. 声明项目当中需要的依赖和插件  
2.1  dependencyManagement  
2.2  build-pluginManagement-plugins  
#### 项目功能：user-log
测试项目发布，发布到公司公共仓库，供所有的项目组使用
``` xml
<distributionManagement>
    <repository>
        <id>public-releases</id>
        <name>public release resp</name>
        <url>http://localhost:8081/nexus/content/repositories/releases/</url>
    </repository>
    <snapshotRepository>
        <id>public-snapshots</id>
        <name>public snapshots resp</name>
        <url>http://localhost:8081/nexus/content/repositories/snapshots/</url>
    </snapshotRepository>
</distributionManagement>
```
#### 项目功能：user-core
测试项目打包，打包插件如下：   
1. 源代码source打包：maven-source-plugin  
2. 压缩包rar打包：maven-rar-plugin  
#### 项目功能：user-service
测试项目的编译、测试、测试覆盖率插件：  
1. 编译插件：maven-compiler-plugin  
2. 测试插件：maven-surefire-plugin
3. 覆盖率插件：cobertura-maven-plugin
#### 项目功能：user-web
测试war打包、jetty、cargo插件   
1. 打war包插件：maven-war-plugin      
2. 容器jetty插件：jetty-maven-plugin   
3. 容器cargo插件：cargo-maven2-plugin  
3.1 local-standalone  
3.2 local-existing  
#### 项目功能：user-remote-web
测试cargo插件，远程打包
