package com.kuang.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    //若方法存在多个参数，所有的参数前面都要加上@Param("xx"),#{id}名字与Param("id")要一样
    @Select("select * from user where id = #{id}")
    User getUerById(@Param("id") int id);

    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{password})")
    int addUser(User user);

    @Update("update user set name=#{name}, pwd=#{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}

