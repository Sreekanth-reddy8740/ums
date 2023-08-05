package org.sreekanth.ums.service;

import java.util.List;

import org.sreekanth.ums.entity.RegisterEntity;

public interface RegisterService {

	public void processUserInfo(RegisterEntity registerEntity);
	
	public List<RegisterEntity> getAllUser();
}
