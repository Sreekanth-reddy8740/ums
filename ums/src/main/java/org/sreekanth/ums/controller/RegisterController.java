package org.sreekanth.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.sreekanth.ums.Dto.RegisterDto;
import org.sreekanth.ums.entity.RegisterEntity;
import org.sreekanth.ums.service.impl.RegisterServiceImpl;

// @Component (Generic type).
@Controller// give the Exactly which layer calling and Create a object for that class .
public class RegisterController {

	@Autowired // we want to inject the required object reference of the another class object in to this class(Dependency Injunction).
	private RegisterServiceImpl registerServiceImpl;
	
	@RequestMapping(value="/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterEntity registerEntity) {
		
		//System.out.println(registerEntity);
		registerServiceImpl.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");
	}                                                                 
}
