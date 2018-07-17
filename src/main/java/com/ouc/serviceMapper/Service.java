/**
 * 
 */
package com.ouc.serviceMapper;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.shiro.config.Ini;
import org.springframework.web.context.ContextLoaderListener;

import com.ouc.bean.User;
import com.ouc.mapper.SelectUserByIdMapper;

/**
* Filename:    Service.java
* @author:     yyi
* @version:    1.0
* @date:   2018年7月17日
* @Description:
 */
@WebService
public class Service {
	
	private SelectUserByIdMapper selectUserByIdMapper;
	@WebMethod
	public User testSelectUserById(int id){
		System.out.println("调用testSelectUserById:" +id);
		selectUserByIdMapper = ContextLoaderListener.getCurrentWebApplicationContext().getBean(SelectUserByIdMapper.class);
		User user =  selectUserByIdMapper.SelectUerById(id);
		return user;
	}

}
