package com.kuang.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;

import org.junit.Test;

import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
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
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("title01");
        blog.setAuthor("author01");
        blog.setCreateTime(new Date());
        blog.setViews(100);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("title02");
        blog.setAuthor("author02");
        blog.setCreateTime(new Date());
        blog.setViews(200);
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("title03");
        blog.setAuthor("author03");
        blog.setCreateTime(new Date());
        blog.setViews(300);
        mapper.addBlog(blog);

        logger.info("logger.info()--test():");
        sqlSession.close();
    }
    
    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            logger.info("logger.info()--test--queryBlogIF():"+blog);
        }

        sqlSession.close();
    }
}

