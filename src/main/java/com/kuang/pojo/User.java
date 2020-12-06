package com.kuang.pojo;

import org.apache.ibatis.type.Alias;

/*
 * User.java
 * Copyright (C) 2020 2020-12-05 21:20 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

@Alias("hello")
public class User
{
    private int id;

    private String name;

    private String pwd;

	public User() {
		
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
            "id = " + getId() +
            ", name = " + getName() +
            ", pwd = " + getPwd() +
            "}";
    }

}

