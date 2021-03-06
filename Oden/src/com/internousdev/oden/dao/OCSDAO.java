package com.internousdev.oden.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

public class OCSDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private String sql = "INSERT INTO oden (oden_id,oden_price,oden_name) VALUES(?, ? ,?)";

			public void createOden(String odenId, String odenPrice, String odenName) throws SQLException {

				try{
					PreparedStatement ps = connection.prepareStatement(sql);
					ps.setString(1, odenId);
					ps.setString(2, odenPrice);
				    ps.setString(3, odenName);

				    ps.execute();
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					connection.close();
				}

			}

}
