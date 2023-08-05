package org.sreekanth.ums.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sreekanth.ums.entity.RegisterEntity;
import org.sreekanth.ums.repositoty.RegisterRepository;
import org.sreekanth.ums.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		registerRepository.saveUser(registerEntity);
		
	}
	
	@Override
	public List<RegisterEntity> getAllUser() {
		return registerRepository.findAllUsers();
	}
	

}
