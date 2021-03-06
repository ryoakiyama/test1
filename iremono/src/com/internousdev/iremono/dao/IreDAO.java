package com.internousdev.iremono.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.iremono.dto.IreDTO;
import com.internousdev.iremono.util.DBConnector;

public class IreDAO {

	List<IreDTO> BobDTOList = new ArrayList<IreDTO>();

	public List<IreDTO> select(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				IreDTO dto = new IreDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続できる");

				BobDTOList.add(dto);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return BobDTOList;
	}
}


