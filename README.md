#GradleSpringBootProject
* 使用spring-boot建立基于springmvc的项目自带启动
* 注意：web.xml如果不设置，则无法放入war包中启动
* org.springframework.boot:spring-boot-starter-web:2.0.0.BUILD-SNAPSHOT
* 
* 添加application-{profile}多环境应用
* java运行时 在Arguments中添加 --spring.profiles.active=dev
* 通过@ConfigurationProperties与@EnableConfigurationProperties读取配置文件