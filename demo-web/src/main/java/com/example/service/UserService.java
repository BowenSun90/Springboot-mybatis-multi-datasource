package com.example.service;

import com.example.mapper.web.UserMapper;
import com.example.model.web.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Service
public class UserService {

	@Autowired
	public UserMapper userMapper;


	public User selectUser(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
}
