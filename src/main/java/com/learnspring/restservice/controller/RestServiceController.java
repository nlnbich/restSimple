package com.learnspring.restservice.controller;

import java.util.List;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.restservice.dao.UserService;
import com.learnspring.restservice.domain.HocSinh;
import com.learnspring.restservice.utility.DBUtility;
//
//
@RestController
@RequestMapping("/service")
public class RestServiceController {
	
	
	UserService userService = new UserService();
    
	 
	 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET, headers="Accept=application/json")	 
	 public List<HocSinh> getAllUsers() {
	  List<HocSinh> users=userService.getAllUser();
	  return users;		
	 }
	

}