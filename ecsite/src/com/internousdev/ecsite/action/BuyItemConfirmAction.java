package com.internousdev.ecsite.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() throws SQLException {


//		BuyItemDAO buyItemDAO = new BuyItemDAO();
//		List<BuyItemDTO> buyItemDTOList = buyItemDAO.getBuyItemInfo();
//		session.put("buyItemDTOList", buyItemDTOList);
		String result = SUCCESS;
		return result;

	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {

		this.session = session;

	}

}