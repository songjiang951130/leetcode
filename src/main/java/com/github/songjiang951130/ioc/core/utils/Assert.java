package com.github.songjiang951130.ioc.core.utils;

public class Assert {
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new NullPointerException(message);
        }

    }
}
