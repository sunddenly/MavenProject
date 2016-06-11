####命令行下构建Maven项目    
**参考文献：** http://blog.csdn.net/top_code/article/details/51566159  
**命令格式：**  
```  
mvn archetype:generate 
-DgroupId=[your groupId] 
-DartifactId=[your artifactId] 
-Dversion=[your version] 
-DarchetypeArtifactId=[archetypeArtifactId]
```  
**命令解析：** 用来生成Maven项目的骨架，就是生成一个标准的Maven项目结构包括：pom.xml、src目录等其他内容    
```	
1. archetype 原型，样板，范例的意思，也就是骨架的意思
2. DarchetypeArtifactId用来指定，项目构建的骨架类型，不同的项目结构采用不同的骨架来生成
   例如，普通Java项目和Web项目的结构是不同，两种类型项目需要采用不同的archetype来生成  
   普通Java项目骨架：maven-archetype-quickstart  
   通用Web项目骨架：maven-archetype-webapp  
```		   
**构建命令：**  
```
Java项目：mvn archetype:generate 
		  -DgroupId=com.hebut
		  -DartifactId=CMDExample 
		  -DarchetypeArtifactId=maven-archetype-quickstart
Web项目：mvn archetype:generate 
		  -DgroupId=com.hebut
		  -DartifactId=CMDExample 
```		  
**注意事项：**
```
1. mvn archetype:create ....,[create]命令已经过时，在Maven3以上版本运行会报错，不要使用该命令
2. 当不指定DarchetypeArtifactId，Dversion时，命令行下会给你列出一些参考选项一路回车，不做选择时，Maven默认配置如下：
	  DarchetypeArtifactId===>maven-archetype-quickstart
	  Dversion===> 1.0-SNAPSHOT
3. 命令任意目录下均可运行，生成的项目的根目录名称和指定的artifactId一样
4. 使用Maven命令创建Maven项目，需要用到Maven Archetype Plugin插件，当本地仓库没有Maven会自动下载
5. 使用IDE构建时，例如IntelliJ IDEA ，其内部内置了相关插件，所以不用去下载
6. Pom中的相关依赖在执行命令时，会自动去下载
```		   
**项目构建：**  
```
1. 在...\CDMExample\src\main\java\com\hebut\下新建Hello.java文件（默认该目录下会生成App.java）
2. 执行编译：mvn compile ，在CDMExample生成编译目录：target
	  |--CDMExample
		 |--src
		 |--target 编译生成目录
			|--classes 编译的类
			|--maven-status
3. 在..\CDMExample\src\test\java\com\hebut\下，新建测试类：在TestHello.java ，引入Junit包和注解  
4. 执行测试命令：mvn test，该命令会执行test目录下的所有测试类
  并在../target目录生成：test-classes测试编译目录
5. 执行打包命令：mvn package，将target编译内容打成jar包放到：../target/目录下
  默认jar包名称：artifactId+version===>CDMExample-1.0-SNAPSHOT 
6. 执行安装命令：mvn install,将上一步生成的jar安装到本地仓库	
7. 执行发布命令：mvn deploy ，将本地仓库jar包发布到远程的repository 
8. mvn clean/compile/package/test等均要包含pom.xml文件的目录下运行
```
**注意：** artifactID值和项目根目录名称可以不一样，构建时默认和artifactId值相同		   
####Maven常用命令  
```
mvn archetype:create 创建 Maven 项目
mvn compile          编译主程序源代码，不会编译test目录的源代码。第一次运行时，会下载相关的依赖包，可能会比较费时  
mvn test-compile     编译测试代码，compile之后会生成target文件夹，主程序编译在classes下面，测试程序放在test-classes下  
mvn test             运行应用程序中的单元测试   
mvn site             生成项目相关信息的网站  
mvn clean            清除目标目录中的生成结果  
mvn package          依据项目生成 jar/war等 文件，打包之前会进行编译，测试    
mvn install          在本地 Repository 中安装 jar  。  
mvn eclipse:eclipse  生成 Eclipse 项目文件及包引用定义  .  
mvn deploy           在整合或者发布环境下执行，将最终版本的包拷贝到远程的repository，使得其他的开发者或者工程可以共享  。		   
```

		   
