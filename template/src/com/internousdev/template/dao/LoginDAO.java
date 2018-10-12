package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {

		DBConnector dbConnector = new DBConnector();
		//ここから指示が出されたからリターンでここに帰る
		Connection connection = dbConnector.getConnection();
		//接続された状態を持ち帰ることができる


		LoginDTO loginDTO = new LoginDTO();
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);
			ResultSet resultSet = preparedStatement.executeQuery();
			//executeQueryはselect*みたいなもの.検索をしにいけという命令

			if(resultSet.next()) {

			loginDTO.setLoginId(resultSet.getString("login_id"));
			loginDTO.setLoginPassword(resultSet.getString("login_pass"));
			loginDTO.setUserName(resultSet.getString("user_name"));
			if(!(resultSet.getString("login_id").equals(null))) {

			loginDTO.setLoginFlg(true);

			}

			}

		} catch(Exception e) {

		e.printStackTrace();

		}
		return loginDTO;

		}

		}


