# spring-mvc-study
1.0搭建Maven Web 环境
maven 的一些配置环境 不赘述
mvn archetype:generate -DgroupId=com.xxy -DartifactId=spring-mvc-study -DarchetypeArtifactId=maven-archetype-webapp
2.0构建Maven依赖 ，spring  log4j ，中间件使用jetty 
mvn -Dslf4j=false -Dlog4j.configuration=file:./src/main/webapp/WEB-INF/config/log4j.properties jetty:run
要使用 log4j 打印日志时   mvn -Dslf4j=false -Dlog4j.configuration=file:./src/main/webapp/WEB-INF/config/log4j.properties 要加上
3.0 hellow.jsp 简单验证 spring controller 
4.0 course.jsp 简单使用 controller  注入  cours 和  charp   pojo
5.0 index.jsp  网上找的 bootstrap模板 试试能不能 执行
6.0 load.jsp   自己开始写 bootstrap ，个人比较喜欢bootstrap的响应式布局，不用考虑不同大小屏幕的分辨率，
先写个导航栏 ，再引入文件上传插件
7.0先搞个静态网页再说


https://matata2017.github.io/cpts_517_tys 一个网站模板