package com.kuang.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;

import org.junit.Test;

import com.kuang.dao.UserMapper;
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
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(7, "Hello", "11223344"));
        logger.info("logger.info()--addUser():");
        sqlSession.close();
    }
}

