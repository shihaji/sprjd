package com.botree.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.botree.User;

@Repository
public class EmployeeDao {
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	public boolean login(String name,String password) {
		
		System.out.println("helo world");
		
		System.out.println("helo from mybranch");
		
		String sql="select password from user where name=:name";
		
		String s=jdbcTemplate.queryForObject(sql, new MapSqlParameterSource("name",name) ,String.class);
		
		return s.equals(password);
		

	}
	
	
	public List<User> getAll(){
		
		String sql="select * from user";
		
		List<User> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
		
		return list;
	}
	
	

}
