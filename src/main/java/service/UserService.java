package service;

import mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.User;

@Service
public class UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	
	
	public User readUserByUsername(String username){
		User selectUser = userMapper.selectUser(username);
		return selectUser;
	}
}
