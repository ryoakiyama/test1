package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CreateItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class CreateItemCompleteAction extends ActionSupport implements SessionAware {

	//もとはuserCreateCompleteActionだったもの

private String newItemName;
private String newItemPrice;
private String newItemStock;
public Map<String,Object> session;
private CreateItemCompleteDAO createItemCompleteDAO = new CreateItemCompleteDAO();

public String execute() throws SQLException {

	createItemCompleteDAO.CreateItemInfo(

			session.get("newItemName").toString(),
			session.get("newItemPrice").toString(),
			session.get("newItemStock").toString());


			String result = SUCCESS;
			return result ;

			}

	public String getNewItemName(){
		return newItemName;
	}

	public void setLoginId(String newItemName){
		this.newItemName = newItemName;
	}

	public String getNewItemPrice(){
		return newItemPrice;
	}

	public void setUserName(String newItemPrice){
		this.newItemPrice = newItemPrice;
	}


	public String getNewItemStock(){
		return newItemStock;
	}

	public void setLoginPassword(String newItemStock){
		this.newItemStock = newItemStock;
	}

	
	
				@Override
				public void setSession(Map<String, Object> session) {
				this.session = session;
				}
}