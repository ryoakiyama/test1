package com.internousdev.ecsite.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemSelectDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	public String execute() {

		String result = "login";
		if (session.containsKey("login_user_id")) {
			// ここから
			BuyItemSelectDAO buyItemSelectDAO = new BuyItemSelectDAO();
			List<BuyItemDTO> buyItemDTOList = buyItemSelectDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);
			//ここまで

			result = SUCCESS;
		}
		return result;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}
}