package com.internousdev.oden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.oden.dto.OdenDTO;
import com.internousdev.util.DBConnector;

public class OdenDAO {

	List<OdenDTO> odenDTOList = new ArrayList<OdenDTO>();

	public List<OdenDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from oden";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				OdenDTO dto = new OdenDTO();
				dto.setOdenId(rs.getInt("oden_id"));
				dto.setOdenName(rs.getString("oden_name"));
				dto.setOdenPrice(rs.getString("oden_price"));
				odenDTOList.add(dto);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return odenDTOList;

	}

}





