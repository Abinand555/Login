package com.faith.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.model.Login;
import com.faith.app.repository.UserRepo;

@Service
public class UserServiceImplementation implements IUserService {

	@Autowired
	private UserRepo repo; //instance for UserRepo

	/*@Transactional
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}
   */
	
	
  //Find user using username and password
	@Override
	public Login findUser(String username, String password) {
		// TODO Auto-generated method stub
		return repo.findByUser(username, password);
	}

}
