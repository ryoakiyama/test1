package com.internousdev.e_bookshare.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.e_bookshare.dao.buyDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyAction extends ActionSupport implements SessionAware {

	private String bookname;
	private String bookprice;
	//次にここに入る。ここに入ればexecuteがスタートする！

	public Map<String,Object> session;
	private buyDAO buyDAO = new buyDAO();


public String execute() throws SQLException {

	session.put("bookname",bookname);
	session.put("bookprice",bookprice);
	//単純にセッションに置かれていなかった。だからここでsessionを作る。（1つめ）booknameという名前でbooknameを引き受ける引き出しを作る



	buyDAO.newbook(
			session.get("bookname").toString(),
			session.get("bookprice").toString());

	//toStringとはなにか？
	//Stringはキーワード。objectはあいまいなもの。それをストリングにするのがtoString

	//このあたりについか。
	//TODO リストを作る。DAOを使ってデーターベースの情報を取得する
	ArrayList<String> BuyDTOList = new ArrayList<String>();
	

	//取得したものをリストに登録する
    //商品をもてきて、それをDTOにつめてJSPに渡す作業が必要あおいろ7番



	String result = SUCCESS;
			return result;
}


//まずここに入る
public String getBookname(){
	return bookname;
}
//この辺にGetsetを書くのはJSPに値を渡すため


public void setBookname(String bookname){
	this.bookname = bookname;
}

public String getBookprice(){
	return bookprice;
}

public void setBookprice(String bookprice){
	this.bookprice = bookprice;
}
public void setSession(Map<String, Object> session) {
this.session = session;
}
}