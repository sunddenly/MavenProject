#��Ŀ�������������¹���Maven��Ŀ
#�ο����ף�http://blog.csdn.net/top_code/article/details/51566159
#�����ʽ��mvn archetype:generate 
           -DgroupId=[your groupId] 
		   -DartifactId=[your artifactId] 
		   -Dversion=[your version] 
		   -DarchetypeArtifactId=[archetypeArtifactId]
#�����������������Maven��Ŀ�ĹǼܣ���������һ����׼��Maven��Ŀ�ṹ������pom.xml��srcĿ¼����������
           archetype ԭ�ͣ����壬��������˼��Ҳ���ǹǼܵ���˼
		   DarchetypeArtifactId����ָ������Ŀ�����ĹǼ����ͣ���ͬ����Ŀ�ṹ���ò�ͬ�ĹǼ������ɡ�
		   ���磬��ͨJava��Ŀ��Web��Ŀ�Ľṹ�ǲ�ͬ������������Ŀ��Ҫ���ò�ͬ��archetype������
		   ��ͨJava��Ŀ�Ǽܣ�maven-archetype-quickstart
		   ͨ��Web��Ŀ�Ǽܣ�maven-archetype-webapp
#�������
Java��Ŀ��mvn archetype:generate 
          -DgroupId=com.hebut
          -DartifactId=CMDExample 
          -DarchetypeArtifactId=maven-archetype-quickstart
Web��Ŀ��mvn archetype:generate 
          -DgroupId=com.hebut
          -DartifactId=CMDExample 
#ע�����1. mvn archetype:create ....,[create]�����Ѿ���ʱ����Maven3���ϰ汾���лᱨ����Ҫʹ�ø�����
           2. ����ָ��DarchetypeArtifactId��Dversionʱ���������»�����г�һЩ�ο�ѡ��
		      һ·�س�������ѡ��ʱ��MavenĬ���������£�
			  DarchetypeArtifactId===>maven-archetype-quickstart
			  Dversion===> 1.0-SNAPSHOT
           3. ��������Ŀ¼�¾������У����ɵ���Ŀ�ĸ�Ŀ¼���ƺ�ָ����artifactIdһ��
		   4. ʹ��Maven�����Maven��Ŀ����Ҫ�õ�Maven Archetype Plugin����������زֿ�û��Maven���Զ�����
		   5. ʹ��IDE����ʱ������IntelliJ IDEA �����ڲ���������ز�������Բ���ȥ����
		   6. Pom�е����������ִ������ʱ�����Զ�ȥ����
		   
#��Ŀ������1. ��...\CDMExample\src\main\java\com\hebut\���½�Hello.java�ļ���Ĭ�ϸ�Ŀ¼�»�����App.java��
           2. ִ�б��룺mvn compile ����CDMExample���ɱ���Ŀ¼��target
			      |--CDMExample
				     |--src
					 |--target ��������Ŀ¼
					    |--classes �������
						|--maven-status
		   3. ��..\CDMExample\src\test\java\com\hebut\�£��½������ࣺ��TestHello.java ������Junit����ע��  
           4. ִ�в������mvn test���������ִ��testĿ¼�µ����в�����
              ����../targetĿ¼���ɣ�test-classes���Ա���Ŀ¼
           5. ִ�д�����mvn package����target�������ݴ��jar���ŵ���../target/Ŀ¼��
              Ĭ��jar�����ƣ�artifactId+version===>CDMExample-1.0-SNAPSHOT 
           6. ִ�а�װ���mvn install,����һ�����ɵ�jar��װ�����زֿ�	
           7. ִ�з������mvn deploy �������زֿ�jar��������Զ�̵�repository 
           8. mvn clean/compile/package/test�Ⱦ�Ҫ����pom.xml�ļ���Ŀ¼������
ע�⣺artifactIDֵ����Ŀ��Ŀ¼���ƿ��Բ�һ��������ʱĬ�Ϻ�artifactIdֵ��ͬ		   
#===========================Maven��������============================
mvn archetype:create ���� Maven ��Ŀ
mvn compile          ����������Դ���룬�������testĿ¼��Դ���롣��һ������ʱ����������ص������������ܻ�ȽϷ�ʱ
mvn test-compile     ������Դ��룬compile֮�������target�ļ��У������������classes���棬���Գ������test-classes��
mvn test             ����Ӧ�ó����еĵ�Ԫ���� 
mvn site             ������Ŀ�����Ϣ����վ
mvn clean            ���Ŀ��Ŀ¼�е����ɽ��
mvn package          ������Ŀ���� jar/war�� �ļ������֮ǰ����б��룬����
mvn install          �ڱ��� Repository �а�װ jar��
mvn eclipse:eclipse  ���� Eclipse ��Ŀ�ļ��������ö���
mvn deploy           �����ϻ��߷���������ִ�У������հ汾�İ�������Զ�̵�repository��ʹ�������Ŀ����߻��߹��̿��Թ���		   
		   

		   
