package com.example.mapper.web;

import com.example.model.web.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Alex
 * Created by Alex on 2018/7/3.
 */
@Mapper
public interface UserMapper {

	User selectByPrimaryKey(Integer userId);

}