package com.michael.service;

import com.michael.mapper.UserMapper;
import com.michael.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by michael on 2018/9/15.
 */
//@Service
//@Transactional(rollbackFor = Exception.class)
public class UserService {

    public UserService() {
        System.out.println("UserService init----" + this.getClass().getName());
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //    @Autowired
    private UserMapper userMapper;

    public User searchUserByUserId(Integer userId) {
        return userMapper.searchUserByUserId(userId);
    }

    public int insertUser(String userName, Integer userAge) {
        userMapper.insertUser(userName, userAge);
//        if (true) {
//            throw new RuntimeException("自定义exception！");
//        }
        return 1;
    }
}
