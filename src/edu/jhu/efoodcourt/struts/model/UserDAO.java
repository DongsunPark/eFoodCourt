package edu.jhu.efoodcourt.struts.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	public UserDAO() {
	}

	public boolean isRegistered(String name, String password) {

		boolean isRegistered = false;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			conn = ConnectionPool.getInstance();
			String query = "select count(*) from users where name=? and password=?";
			
			// create a statement
			pstmt = conn.prepareStatement(query); 
			
			//set input parameter
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			// extract data from the ResultSet
			
			if(rs.next()) {
				if(rs.getInt(1)>0) isRegistered = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isRegistered;
	}
}
