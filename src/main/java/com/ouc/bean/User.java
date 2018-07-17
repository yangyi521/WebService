/**
 * 
 */
package com.ouc.bean;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
* Filename:    User.java
* @author:     yyi
* @version:    1.0
* @date:   2018Äê7ÔÂ17ÈÕ
* @Description:
 */
public class User {
	private int id;
	private String userName;
	private String passWord;
	private String eMail;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}
	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	

}
