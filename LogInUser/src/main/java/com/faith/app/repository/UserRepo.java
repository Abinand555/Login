 package com.faith.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.faith.app.model.Login;


public interface UserRepo extends JpaRepositoryImplementation<Login, Integer> {

	//Query to list user
	@Query("from User where username=?1 and password=?2")
	Login findByUser(String username,String password);
}
