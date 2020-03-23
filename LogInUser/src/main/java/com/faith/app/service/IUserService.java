package com.faith.app.service;

import java.util.List;
import com.faith.app.model.Login;

public interface IUserService {

	//public User addUser(User user);

	
	//Method to find user using username and password
	public Login findUser(String username,String password);
	

}
