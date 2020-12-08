package com.kuang.pojo;

import java.util.Date;

import lombok.Data;

/*
 * Blog.java
 * Copyright (C) 2020 2020-12-08 14:22 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
@Data
public class Blog
{
    private String id;

    private String title;

    private String author;

    private Date createTime;//属性名和字段名不一致

    private int views;
}

