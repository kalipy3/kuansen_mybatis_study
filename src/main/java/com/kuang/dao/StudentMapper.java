package com.kuang.dao;

import java.util.List;

import com.kuang.pojo.Student;

/*
 * StudentMapper.java
 * Copyright (C) 2020 2020-12-06 21:10 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public interface StudentMapper
{
    //查询所有的学生信息，以及对应的老师的信息
    public List<Student> getStudent();
}

