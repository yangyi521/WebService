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
* @date:   2018��7��17��
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
         //Ҫת��w3dom����ʽ
         System.out.println(d.getFirstChild().getTextContent());
         System.out.println(d.getElementsByTagName("groupInfoDefault").item(0).getTextContent());
         System.out.println("����ǣ�"+results11[0].toString()); 
         Source xmlSource = new DOMSource(d);
       //������
       TransformerFactory factory = TransformerFactory.newInstance();
       //ת����
       Transformer transformer = factory.newTransformer();
       //���������ʽ������
      /* transformer.setOutputproties();*/
       //���������
       String path = "C:\\Users\\Administrator\\Desktop\\webservice\\test.xml";
       Result result = new StreamResult(new File(path));
       transformer.transform(xmlSource, result);
         //��ȡ����dom�ļ�
         System.out.println(result);
    }
}
