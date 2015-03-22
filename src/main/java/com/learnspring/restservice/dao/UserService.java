package com.learnspring.restservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.learnspring.restservice.domain.HocSinh;
import com.learnspring.restservice.utility.DBUtility;

public class UserService {
	
	private Connection connection;
	
	
	public UserService() {
		connection = DBUtility.getConnection();
	}
	
	public List<HocSinh> getAllUser() {
		List<HocSinh> hss = new ArrayList<HocSinh>();
		
		try {
			String strQuery = "select * from hoc_sinh";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(strQuery);
			while (rs.next()) {
				HocSinh hs = new HocSinh();
				hs.setMaHocSinh(rs.getString("ma_hoc_sinh"));
				hs.setTenHocSinh(rs.getString("ten_hoc_sinh"));
				hs.setHoHocSinh(rs.getString("ho_hoc_sinh"));
				hss.add(hs);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return hss;				
	}
}
