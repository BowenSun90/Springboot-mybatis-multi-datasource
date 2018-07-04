package com.example.service;

import com.example.mapper.lib.RoleMapper;
import com.example.model.lib.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Service
@Slf4j
public class RoleService {

	@Autowired
	public RoleMapper roleMapper;

	public Role selectRole(Integer roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}

	public Role selectRoleByUser(Integer userId) {
		return roleMapper.selectByUser(userId);
	}

	public void ping() {
		log.info("ping");
	}
}
