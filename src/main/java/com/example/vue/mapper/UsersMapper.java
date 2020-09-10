package com.example.vue.mapper;


import com.example.vue.pojo.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {

	@Select("select * from users where uid = #{uid}")
	Users findUserByUid(int uid);
	
	@Select("select * from users")
	List<Users> findUser();
	
	@Update("update users set username = #{username}, gender = #{gender}, age = #{age} where uid = #{uid}")
	int updateUser(Users users);
	
	@Delete("delete from users where uid =#{uid}")
	int deleteUser(int uid);
	
	@Insert("insert into users(username,gender,age) value(#{username}, #{gender}, #{age})")
	@Options(useGeneratedKeys=true, keyProperty="uid", keyColumn="uid")
	void insertUser(Users users);
}
