package com.example.service;

import com.example.model.lib.Role;
import com.example.model.web.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Service
public class UserRoleService {

	@Autowired
	public UserService userService;

	@Autowired
	public RoleService roleService;

	@Autowired
	public UtilService utilService;

	public String getUserRoleName(Integer userId) {
		utilService.ping();

		User user = userService.selectUser(userId);
		Role role = roleService.selectRoleByUser(userId);
		return user.getUserName() + " "
				+ role.getRoleName();
	}
}
