/**
 * 
 */
package com.ouc.test;

import java.io.File;
import java.net.URL;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.codehaus.xfire.client.Client;
import org.w3c.dom.Document;

/**
* Filename:    Test.java
* @author:     yyi
* @version:    1.0
* @date:   2018年7月17日
* @Description:
 */
public class Test {
    public static void main(String[] args) throws Exception {  
    	//String wsdl = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL";  
    	String wsdl  = "http://10.138.22.94:8080/WebService_airconditionerlanshia1014/services/service?wsdl"; 
    	 Client client = new Client(new URL(wsdl));
    	 Object[] results11 = client.invoke("getTestUnitInfo", new Object[]{"airconditionerlanshia1014"});
         //Object[] results11 = client.invoke("getHello", new Object[]{});
    	 //Object[] results11 = client.invoke("getMobileCodeInfo", new Object[]{"13780631855",""});
         Document d = (Document)results11[0];
         //要转成w3dom的形式
         System.out.println(d.getFirstChild().getTextContent());
         System.out.println(d.getElementsByTagName("groupInfoDefault").item(0).getTextContent());
         System.out.println("结果是："+results11[0].toString()); 
         Source xmlSource = new DOMSource(d);
       //工厂类
       TransformerFactory factory = TransformerFactory.newInstance();
       //转换器
       Transformer transformer = factory.newTransformer();
       //设置输出格式和属性
      /* transformer.setOutputproties();*/
       //创建结果树
       String path = "C:\\Users\\Administrator\\Desktop\\webservice\\test.xml";
       Result result = new StreamResult(new File(path));
       transformer.transform(xmlSource, result);
         //获取整个dom文件
         System.out.println(result);
    }
}
