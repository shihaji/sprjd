package com.botree;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class JavaConfig {
	
	
	@Bean
	public DataSource dataSource() {
		
		var ds=new DriverManagerDataSource("jdbc:mysql://localhost:3306/employeedb","root","B@tr$$*2022");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		return new JdbcTemplate(dataSource());
		
	}
	
	
	@Bean
	public NamedParameterJdbcTemplate namedTemplate() {
		
		return new NamedParameterJdbcTemplate(dataSource());
		
	}
	

}
