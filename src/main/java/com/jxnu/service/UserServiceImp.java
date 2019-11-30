package com.jxnu.service;

import com.jxnu.dao.UserMapper;
import com.jxnu.pojo.Users;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Boolean userLogin(String username, String password) {
        return userMapper.userLogin(username, password)==null?false:true;
    }
    public int adduser(Users user) {
        return userMapper.adduser(user);
    }
    public List<Users> queryAllUser(String username) {
        return userMapper.queryAllUser(username);
    }
    public int update(Users user) {return userMapper.update(user);}

}
