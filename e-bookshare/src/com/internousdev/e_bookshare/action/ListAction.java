package com.internousdev.e_bookshare.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.e_bookshare.dao.ListDAO;
import com.internousdev.e_bookshare.dto.BookDTO;
import com.opensymphony.xwork2.ActionSupport;
public class ListAction extends ActionSupport implements SessionAware {

	private Map<String,Object> session;

public String execute() throws SQLException {


	ListDAO listDAO = new ListDAO();
	List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
	// TODO ほんの情報を取得する
	bookDTOList = listDAO.getMyPageUserInfo();

	session.put("bookDTOList", bookDTOList);
	//Listが何件も持っているかもしれないから、その対策にリストごとまとめて突っ込む


	String result = SUCCESS;
	return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
	this.session = session;

	}

	public Map<String,Object>getSession(){
		return session;
	}

}