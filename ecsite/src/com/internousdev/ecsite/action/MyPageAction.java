package com.internousdev.ecsite.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;
public class MyPageAction extends ActionSupport implements SessionAware {

public Map<String, Object> session;
private MyPageDAO myPageDAO = new MyPageDAO();
private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
private String deleteFlg;
private String message;
public String ore;


public String execute() throws SQLException {
	if (!session.containsKey("login_user_id")) {
	return ERROR;
	}
	//ログイン状態か否かを判断する


if(deleteFlg == null) {
	//このifデリートフラグは何なのか

	String user_master_id = session.get("login_user_id").toString();
	myPageList = myPageDAO.getMyPageUserInfo(user_master_id);
	//ここがgetMyPageUserInfo。それをmyPageListにいれ、MyPage.jspに続く。



	} else if(deleteFlg.equals("1")) {

	delete();

	}

	String result = SUCCESS;
	return result;
	}


//商品を削除するメソッド
	public void delete() throws SQLException {
	String user_master_id = session.get("login_user_id").toString();
	int res = myPageDAO.buyItemHistoryDelete(user_master_id);
		if(res > 0) {
		myPageList = null;
		setMessage("商品情報を正しく削除しました。");
		} else if(res == 0) {
		setMessage("商品情報の削除に失敗しました。");
		}
		}
//↑商品を削除するメソッド




	public void setDeleteFlg(String deleteFlg) {
	this.deleteFlg = deleteFlg;
	}
	@Override
	public void setSession(Map<String, Object> session) {
	this.session = session;

	}
	public ArrayList<MyPageDTO> getMyPageList() {
	return this.myPageList;

	}
	public String getMessage() {
	return this.message;

	}
	
	
	public void setMessage(String message) {
	this.message = message;
	}
}