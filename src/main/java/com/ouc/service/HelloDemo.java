/**
 * 
 */
package com.ouc.service;

import javax.jws.WebService;

/**
* Filename:    Hello.java
* @author:     yyi
* @version:    1.0
* @date:   2018��7��17��
* @Description:
 */
@WebService
public class HelloDemo {
	public String testService(String name){
		System.out.println("Hello "+name);
		return "Hello "+name;
	}
}
