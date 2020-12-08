package com.kuang.utils;

import java.util.UUID;

/*
 * IDUtils.java
 * Copyright (C) 2020 2020-12-08 14:40 kalipy <kalipy@debian>
 *
 * Distributed under terms of the MIT license.
 */

public class IDUtils
{
    public static String getId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

