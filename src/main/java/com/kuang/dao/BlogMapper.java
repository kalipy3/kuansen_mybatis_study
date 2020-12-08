package com.kuang.dao;

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
}

