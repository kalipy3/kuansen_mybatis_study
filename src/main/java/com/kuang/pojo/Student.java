package com.kuang.pojo;

import lombok.Data;

import com.kuang.pojo.Teacher;
/*
 * Student.java
 * Copyright (C) 2020 2020-12-06 21:06 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
@Data
public class Student
{
    private int id;
    private String name;
    //学生要关联一个老师
    private Teacher teacher; 
}

