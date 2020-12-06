package com.kuang.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;

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
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);

        System.out.println(user);
        logger.info("user-------:"+user);

        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
}

