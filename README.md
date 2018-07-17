# WebService
webServiceDemo
将webservice发布到tomcat上，调用webservice进行访问数据

其中可以将多个方法发布到同一个的webService，进而提高使用效率，在调用的时候在项目中的terminal中使用wsimport -s ./src -d ./bin -p org.ccnt.jax.web.client 命令
进行代码生成，使用生成的代码调用webService
其中在将webService 发布到tomcat上的时候需要使用一个maven的配置：

<dependency>
			<groupId>com.sun.xml.ws</groupId>
			<artifactId>jaxws-rt</artifactId>
			<version>2.1.4</version>
</dependency>
同时引用的jar包需要拷贝到tomcat下面。

在web-inf文件夹下面创建sun-jaxws.xml,配置以下属性：
<?xml version="1.0" encoding="UTF-8"?>
<endpoints xmlns='http://java.sun.com/xml/ns/jax-ws/ri/runtime'
        version='2.0'>
<endpoint name='Hello' implementation='com.ouc.service.HelloDemo'
          url-pattern='/Service/hello' />
 <endpoint name='Service' implementation='com.ouc.serviceMapper.Service'
          url-pattern='/Service/testfindUser' />
</endpoints>
即将两个方法发布到的webservice发布到tomcat。。。。。注意:再发布到tomcat的时候,webService标签属相,没有实现与spring的管理,
TestWebService就是此webService的测试！
访问：
http://localhost:8080/WebServiceDemo/Service/hello?wsdl
