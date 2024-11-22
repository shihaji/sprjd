package com.botree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.botree.dao.EmployeeDao;

@Controller
public class AppController {
	
	@Autowired
	EmployeeDao empDao;
	
	@GetMapping("/")
	public String getlogin() {
		
		return "index";
	}
	
	
	@PostMapping("authenticate")
	public String login(@RequestParam String name,@RequestParam String password) {
		
		// empDao.login(name, password);
		
		System.out.println(empDao.getAll());
		
		return "home";
	}
	
	

}
