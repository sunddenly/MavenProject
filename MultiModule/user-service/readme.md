配置测试插件  

参考：http://maven.apache.org/surefire/maven-surefire-plugin/
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <configuration>
        
    </configuration>
</plugin>
clean test -Dtest=TestUserService
clean test -Dtest=Test*
clean package -DskipTests

测试编译插件：
参考：http://maven.apache.org/plugins/maven-compiler-plugin/plugin-info.html
http://www.mojohaus.org/cobertura-maven-plugin/

