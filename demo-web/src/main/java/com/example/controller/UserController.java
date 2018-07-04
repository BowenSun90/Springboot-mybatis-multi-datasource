package com.example.controller;

import com.example.model.web.User;
import com.example.service.UserRoleService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;

	@Autowired
	public UserRoleService userRoleService;

	@GetMapping("/ping")
	public void ping() {
		log.info("ping");
	}

	@GetMapping("/select/{userId}")
	public Object getUser(@PathVariable Integer userId) {
		log.info("select " + userId);
		User user = userService.selectUser(userId);
		return user;
	}

	@GetMapping("/role/{userId}")
	public Object getUserRole(@PathVariable Integer userId) {
		log.info("select " + userId);
		String result = userRoleService.getUserRoleName(userId);
		return result;
	}
}
