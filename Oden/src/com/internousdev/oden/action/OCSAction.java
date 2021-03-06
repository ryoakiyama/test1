package com.internousdev.oden.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.oden.dao.OCSDAO;

public class OCSAction extends ActionSupport implements SessionAware {


	private String odenId;
	private String odenPrice;
	private String odenName;
	public Map<String,Object> session;
	private OCSDAO ocsDAO = new OCSDAO();

	public String execute() throws SQLException{

		ocsDAO.createOden(session.get("odenId").toString(),
				session.get("odenPrice").toString(),
				session.get("odenName").toString());

		String result = SUCCESS;
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




}
