######项目描述：测试安装项目的引用，新建项目CMDExample2，对安装项目CMDExample进行引用

	1. 复制CMDExample或使用命令，构建新项目CMDExample2	
	2. 在CMDExample2中pom设置对CMDExample项目的依赖	  
	   <dependency>
	      <groupId>com.hebut</groupId>
	      <artifactId>CDMExample</artifactId>
	      <version>1.0-SNAPSHOT</version>
	      <scope>compile</scope>
	    </dependency> 
	3. 在CMDExample2中编写Word.java,引用CMDExample中的Hello类的sayHello()方法
	5. 执行编译：mvn compile ，测试MDExample2中对CMDExample的引用是否成功
	4. 对依赖项目CMDExample进行修改，在Hello类中添加getHello()方法
	5. 在CMDExample中，进行mvn install再次安装到本地仓库
	6. 修改项目CMDExample2，在Word类中调用CMDExample项目新添加的Hello.getHello()方法  
	7. 执行编译：mvn compile ，测试MDExample2中对CMDExample的引用是否成功  
		   

		   
