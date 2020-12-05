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
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
	}
    
    @Test
	public void getUserById() {
	    SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    //注意：增删改一定要提交事务
    //@Test
    //public void addUser() {
    //    SqlSession sqlSession = MybatisUtils.getSqlSession();

    //    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    //    int res = mapper.addUser(new User(4, "kalipy", "pwd2233"));
    //    if (res > 0) {
    //        System.out.println("insert into 成功！");
    //    }

    //    //提交事务
    //    sqlSession.commit();
    //    sqlSession.close();
    //}
    
    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4, "yousa", "666"));

        sqlSession.commit();
        sqlSession.close();
    }
}

