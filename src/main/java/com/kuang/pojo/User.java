package com.kuang.pojo;

import org.apache.ibatis.type.Alias;

/*
 * User.java
 * Copyright (C) 2020 2020-12-05 21:20 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public class User
{
    private int id;

    private String name;

    private String password;

	public User() {
		
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
            "id = " + getId() +
            ", name = " + getName() +
            ", password = " + getPassword() +
            "}";
    }

}

