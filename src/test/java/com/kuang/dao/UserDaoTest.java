package com.kuang.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;

import org.junit.Test;

import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
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
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        logger.info("logger.info()--getTeacher():"+teacher);
        sqlSession.close();
    }
    
    @Test
    public void testStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            logger.info("logger.info()--testStudent():"+student);
        }
        sqlSession.close();
    }
}

