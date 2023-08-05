package org.sreekanth.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.sreekanth.ums.entity.RegisterEntity;
import org.sreekanth.ums.service.impl.RegisterServiceImpl;

// @Controller --> to create object of controller class
// @ResponseBody --> it is used to convert the java object into the JSON data.
@RestController // to create object of controller class and to convert the java object into the JSON data.
public class RegisterRestController {

	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	 
//	@RequestMapping(value="/getAllUser", method = RequestMethod.GET)// accept the all types of Requests.
	
	@GetMapping(value = "/getAllUser")
	public @ResponseBody List<RegisterEntity> getAllUser() {
		return registerServiceImpl.getAllUser();
		
	}
//	@RequestMapping(value="/saveRegisterDetails",method = RequestMethod.GET)
	
//	 @RequestBody--> is used to convert JSON data to java Object.
	
	@PostMapping(value = "/saveRegisterDetails")
	public void saveUserDetails(@RequestBody RegisterEntity registerEntity) {
		registerServiceImpl.processUserInfo(registerEntity);
	}
}
