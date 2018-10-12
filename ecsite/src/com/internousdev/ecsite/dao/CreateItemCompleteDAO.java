package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;
	public class CreateItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	//SQLに対応した文を追加する。ここの場合新商品なので商品データ
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, ?)";


	//悩んだ末にここを変えた。データベースにあるフォーマットではなくinputで入れたもの
	public void CreateItemInfo(String newItemName, String newItemPrice, String newItemStock) throws SQLException {

	try {


		//ここはなぜ全てStringなのか？
		//また、全て項目の名前なのにdateUtilだけ名前がないのはなぜか？
	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	preparedStatement.setString(1, newItemName);
	preparedStatement.setString(2, newItemPrice);
	preparedStatement.setString(3, newItemStock);
	preparedStatement.setString(4, dateUtil.getDate());
	preparedStatement.execute();
	} catch(Exception e) {

	e.printStackTrace();
	} finally {
	connection.close();

	  }
 }
}