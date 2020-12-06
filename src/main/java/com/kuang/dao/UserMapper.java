package com.kuang.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.kuang.pojo.User;
/*
 * UserDao.java
 * Copyright (C) 2020 2020-12-05 21:22 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public interface UserMapper
{
    @Select("select * from user")
    List<User> getUsers();
}

