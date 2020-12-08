package com.kuang.dao;

import java.util.List;
import java.util.Map;

import com.kuang.pojo.Blog;

/*
 * BlogMapper.java
 * Copyright (C) 2020 2020-12-08 14:39 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public interface BlogMapper
{
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);
    
    List<Blog> queryBlogChoose(Map map);

    //更新
    int updateBlog(Map map);

    //查询id=(1,3)区间的记录
    List<Blog> queryBlogForeach(Map map);
}

