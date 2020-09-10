package com.example.vue.controller;

import com.example.vue.pojo.Users;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUsers")
	public List<Users> findUsers() {
		List<Users> findUser = null;
		try {
			findUser = userService.findUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findUser;
	}
	
	@RequestMapping("/findUserByUid")
	public Users findUserByUid(int uid) {
		System.out.println("-1111111111111111111111111111");
		Users user = null;
		try {
			user = userService.findUserByUid(uid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/updateUser")
	public boolean updateUser(@RequestBody Users users) {
		try {
			if(userService.updateUser(users) == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping("/deleteUser")
	public boolean deleteUser(int uid) {
		try {
			if(userService.deleteUser(uid) == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping("/insertUser")
	public Users insertUser(@RequestBody Users users) {
		System.out.println("11111111111111111111111111"+users.toString());
		try {
			userService.insertUser(users);
			return users;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
