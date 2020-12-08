package com.kuang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kuang.pojo.Teacher;
/*
 * TeacherMapper.java
 * Copyright (C) 2020 2020-12-06 21:10 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public interface TeacherMapper
{
    List<Teacher> getTeacher();
}

