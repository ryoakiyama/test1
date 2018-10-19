package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class CreateItemConfirmAction extends ActionSupport implements SessionAware {

	private String newItemName;
	private String newItemPrice;
	private String newItemStock;
	public Map<String,Object> session;
	private String errorMassage;

	public String execute() {


		//ここにひとまずサクセスを入れている理由は何？
		String result = SUCCESS;

		if(!(newItemName.equals(""))
		&& !(newItemPrice.equals(""))
		&& !(newItemStock.equals(""))){
			if(newItemName.equals("ばか")){
				setErrorMassage("その言葉は使えません");
				result = ERROR;
			} else {
				session.put("newItemName", newItemName);
				session.put("newItemPrice", newItemPrice);
				session.put("newItemStock", newItemStock);
			}
		} else{
			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}
	public String getNewItemName() {
		return newItemName;
	}
	public void setNewItemName(String newItemName) {
		this.newItemName = newItemName;
	}
	public String getNewItemPrice() {
		return newItemPrice;
	}
	public void setNewItemPrice(String newItemPrice) {
		this.newItemPrice = newItemPrice;
	}
	public String getNewItemStock() {
		return newItemStock;
	}
	public void setNewItemStock(String newItemStock) {
		this.newItemStock = newItemStock;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getErrorMassage() {
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;

	}
}

