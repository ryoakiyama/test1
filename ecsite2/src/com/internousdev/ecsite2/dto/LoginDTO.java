package com.internousdev.ecsite2.dto;

public class LoginDTO {

	private String login_id;
	private String login_pass;
	private String user_name;
	private boolean loginFlg;

	public String getLoginId(){
		return login_id;
	}

	public void setLoginId(String login_id){
		this.login_id = login_id;
	}

	public String getLoginPassword(){
		return login_pass;
	}

	public void setLoginPassword(String login_pass){
		this.login_pass = login_pass;
	}

	public String getUserName(){
		return user_name;
	}

	public void setUserName(String user_name){
		this.user_name = user_name;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean LoginFlg){
		this.loginFlg=LoginFlg;

	}



}

