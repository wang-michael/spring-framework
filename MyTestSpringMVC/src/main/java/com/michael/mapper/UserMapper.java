package com.michael.mapper;

import com.michael.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by michael on 2018/9/15.
 */
//@Component("userMapper")
//@Mapper
public interface UserMapper {

    User searchUserByUserId(int userId);

    int insertUser(String userName, Integer userAge);
}
