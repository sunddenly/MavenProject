#### 插件编写
----

> **实现步骤：**
>> 1. 创建一个maven项目,packaging设置为maven-plugin  
>> 2. 编写自定义插件类继承AbstractMojo
>> 3. 定义相应的属性标志
>> 4. 编写execute方法
>> 5. 插件的配置
---

**编写步骤：**   
1 使用maven-archetype-mojo插件创建一个maven项目。其中，maven项目中的packaging设置为maven-plugin  
``` xml
<modelVersion>4.0.0</modelVersion>
<groupId>com.hebut.maven</groupId>
<artifactId>maven-hello-plugin</artifactId>
<packaging>maven-plugin</packaging>
<version>1.0-SNAPSHOT</version>
<name>maven-hello-plugin Maven Mojo</name>
<url>http://maven.apache.org</url>
```
2 编写插件类继承AbstractMojo  
``` java

```
3 定义相应的属性标志  
默认显示${project.build.directory}即target  
4 [查看compiler 插件源代码](http://svn.apache.org/viewvc/maven/plugins/tags/maven-compiler-plugin-3.5.1/)  
5 在setting配置插件组：plugingroups，使得插件的引用更加方便
