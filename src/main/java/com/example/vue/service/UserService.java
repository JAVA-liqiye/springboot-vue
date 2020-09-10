package com.example.vue.service;


import com.example.vue.pojo.Users;

import java.util.List;

public interface UserService {

	Users findUserByUid(int uid);
	
	List<Users> findUser();
	
	int updateUser(Users users);
	
	int deleteUser(int uid);
	
	void insertUser(Users users);
}
