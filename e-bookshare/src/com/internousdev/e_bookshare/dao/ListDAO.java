package com.internousdev.e_bookshare.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.e_bookshare.dto.BookDTO;
import com.internousdev.e_bookshare.util.DBConnector;


public class ListDAO {

	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public List<BookDTO> getMyPageUserInfo() throws SQLException {

		//BookDTO listDTO = new BookDTO();
		//ためしに無効化してみたけど特に変化はなかった。



		List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
		String sql = "SELECT * from book_list";
		//ここがリストにつめる作業

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultSet = stmt.executeQuery();


			while(resultSet.next()) {
				//DTOに入れてそれをリストに入れるという作業

				//登録した跡に全部のデータをもう一度持ってくる

				BookDTO dto = new BookDTO();

				dto.setBookname(resultSet.getString("bookname"));
				dto.setBookprice(resultSet.getString("bookprice"));
				bookDTOList.add(dto);

				// TODO 取得してDTOにつめたものをListにつめる
				//そのデータを何件も入る箱に入れている
				//そうして全て表示されたものがList

			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return bookDTOList;
	}

}

