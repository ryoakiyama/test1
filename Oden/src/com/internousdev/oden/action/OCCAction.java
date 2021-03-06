package com.internousdev.oden.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class OCCAction extends ActionSupport implements SessionAware {

	private String odenId;
	private String odenPrice;
	private String odenName;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){

		String result = SUCCESS;

		if(!(odenId.equals(""))
			&& !(odenPrice.equals(""))
			&& !(odenName.equals(""))){
				session.put("odenId",odenId);
				session.put("odenPrice",odenPrice);
				session.put("odenName",odenName);
			}else{
				setErrorMessage("未入力の項目があります");
				result = ERROR;
			}
		return result;

	}

	public String getOdenId() {
		return odenId;
	}

	public void setOdenId(String odenId) {
		this.odenId = odenId;
	}

	public String getOdenPrice() {
		return odenPrice;
	}

	public void setOdenPrice(String odenPrice) {
		this.odenPrice = odenPrice;
	}

	public String getOdenName() {
		return odenName;
	}

	public void setOdenName(String odenName) {
		this.odenName = odenName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
