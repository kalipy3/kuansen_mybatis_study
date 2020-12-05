package com.kuang.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;

/*
 * UserDaoTest.java
 * Copyright (C) 2020 2020-12-05 21:31 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public class UserDaoTest
{
    @Test
	public void test() {
	    SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式一:getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
	}
    
    @Test
	public void test2() {
	    SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式二:
        List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList"); 

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
	}
}

