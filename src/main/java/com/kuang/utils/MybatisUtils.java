package com.kuang.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * MybatisUtils.java
 * Copyright (C) 2020 2020-12-05 21:02 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public class MybatisUtils
{
   private static SqlSessionFactory sqlSessionFactory;

   static {
       try {
           //使用mybatis第一步,获取sqlSessionFactory对象
           String resource = "mybatis-config.xml";
           InputStream inputStream = Resources.getResourceAsStream(resource);
           sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   //SqlSession 完全包含了面向数据库执行SQL命令所需要的方法
   public static SqlSession getSqlSession() {
       //自动提交事务 true
       return sqlSessionFactory.openSession(true);
   }
}

