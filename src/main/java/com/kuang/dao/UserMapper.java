package com.kuang.dao;

import java.util.List;
import java.util.Map;

import com.kuang.pojo.User;
/*
 * UserDao.java
 * Copyright (C) 2020 2020-12-05 21:22 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public interface UserMapper
{
    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

    //万能的Map
    int addUser2(Map<String, Object> map);

    User getUserById2(Map<String, Object> map);

    List<User> getUserLike(String value);

    //分页
    List<User> getUserByLimit(Map<String, Integer> map);
}

