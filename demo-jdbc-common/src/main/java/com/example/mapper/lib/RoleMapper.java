package com.example.mapper.lib;

import com.example.model.lib.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Mapper
public interface RoleMapper {

	Role selectByPrimaryKey(Integer roleId);

	Role selectByUser(Integer userId);
}