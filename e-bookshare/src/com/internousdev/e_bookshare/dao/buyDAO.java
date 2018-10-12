package com.internousdev.e_bookshare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.e_bookshare.util.DBConnector;
	public class buyDAO{
		
		ArrayList<BuyDTOList>

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private String sql = "INSERT INTO book_list (bookname, bookprice) VALUES(?, ?)";

	
	public void newbook(String bookname, String bookprice) throws SQLException {
	try {

		PreparedStatement ps = connection.prepareStatement(sql);
		//prepadestatementはSQL文を送信するときに必要
		//上で定義したSQl文を引数にしてconnectionに送る
		
		ps.setString(1, bookname);
		ps.setString(2, bookprice);
		//上記の？にここが代入される
		
		
		BuyDTO.setBookname(.getString("bookname"));
		BuyDTO.setBookPrice(.getString("bookprice"));

		//これで箱がリストに入った
		BuyDTOList.add();
		
		
		ps.execute();
		} catch(Exception e) {

		e.printStackTrace();
		} finally {
		connection.close();

		}
	}
}