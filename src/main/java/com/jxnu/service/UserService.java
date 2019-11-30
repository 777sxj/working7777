package com.jxnu.service;

import com.jxnu.pojo.Users;

import java.util.List;

public interface UserService {
    public Boolean userLogin(String username, String password);
    int adduser(Users user);
    List<Users> queryAllUser(String username);
    int update(Users user);
}
