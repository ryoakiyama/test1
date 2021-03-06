package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	List<BuyItemDTO> myPageList = new ArrayList<BuyItemDTO>();

private DBConnector dbConnector = new DBConnector();
private Connection connection = dbConnector.getConnection();
private LoginDTO loginDTO = new LoginDTO();
public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword) {
	String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";
	//select フィールド from テーブル where 条件

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);
			ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()) {

			loginDTO.setLoginId(resultSet.getString("login_id"));
			loginDTO.setLoginPassword(resultSet.getString("login_pass"));
			loginDTO.setUserName(resultSet.getString("user_name"));
			//管理者かどうかのフラグをセットしましょう

		if(!(resultSet.getString("login_id").equals(null))) {
			loginDTO.setLoginFlg(true);
			}
		}
			} catch(Exception e) {
			e.printStackTrace();
			}
			return loginDTO;
		}
			public LoginDTO getLoginDTO() {
			return loginDTO;
		}


public List<BuyItemDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql2 = "SELECT * FROM item_info_transaction";
				try{
					PreparedStatement ps = con.prepareStatement(sql2);
					ResultSet rs = ps.executeQuery();


		//rsの中身がある限りループをまわす
				while(rs.next()){

					//ログイン情報とパスワードは二つでひとつなのでまとめる
					BuyItemDTO dto = new BuyItemDTO();
					dto.setItemName(rs.getString("item_name"));
					dto.setItemPrice(rs.getString("item_price"));

					myPageList.add(dto);
				}

			}catch(SQLException e){
				e.printStackTrace();
			}
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}

				return myPageList;
			}
}
