package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.apache.ibatis.type.Alias;
/*
 * User.java
 * Copyright (C) 2020 2020-12-05 21:20 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */
@Data
@AllArgsConstructor 
@NoArgsConstructor 
public class User
{
    private int id;

    private String name;

    private String password;

}

