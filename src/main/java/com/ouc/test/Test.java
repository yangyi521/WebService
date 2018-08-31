/**
 * 
 */
package com.ouc.test;

import java.net.URL;

import org.apache.commons.httpclient.params.HttpClientParams;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.transport.http.CommonsHttpMessageSender;
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
        
         System.out.println(d.getFirstChild().getTextContent());
         System.out.println(d.getElementsByTagName("groupInfoDefault").item(0).getTextContent());
         System.out.println("结果是："+results11[0].toString()); 
    }
}
