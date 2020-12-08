package com.kuang.pojo;

import java.util.List;

import lombok.Data;
import com.kuang.pojo.Student;

/*
 * Teacher.java
 * Copyright (C) 2020 2020-12-06 21:07 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
@Data 
public class Teacher
{
    private int id;

    private String name;

    //一个老师有多个学生
    private List<Student> students;
}

