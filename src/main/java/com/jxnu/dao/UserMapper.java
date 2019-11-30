package com.jxnu.dao;

import com.jxnu.pojo.Users;

import java.util.List;

public interface UserMapper {
    public Users userLogin(String username, String password);
    int adduser(Users uesr);
    List<Users> queryAllUser(String username);
    int update(Users user);
}
