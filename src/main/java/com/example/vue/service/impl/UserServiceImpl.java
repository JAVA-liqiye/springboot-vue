package com.example.vue.service.impl;


import com.example.vue.mapper.UsersMapper;
import com.example.vue.pojo.Users;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users findUserByUid(int uid) {
		return usersMapper.findUserByUid(uid);
	}

	@Override
	public List<Users> findUser() {
		return usersMapper.findUser();
	}

	@Override
	public int updateUser(Users users) {
		return usersMapper.updateUser(users);
	}

	@Override
	public int deleteUser(int uid) {
		return usersMapper.deleteUser(uid);
	}

	@Override
	public void insertUser(Users users) {

		usersMapper.insertUser(users);
	}

}
