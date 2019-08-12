package com.github.songjiang951130.ioc.core;

import com.github.songjiang951130.ioc.core.utils.Assert;

import java.util.Arrays;
import java.util.List;

public class Container {
    /**
     * 参考博客：https://www.cnblogs.com/youdiaodaxue16/p/9813087.html
     * spring 源码
     */
    public void handle() {
        String className = "com.github.songjiang951130.leetcode.array.ArraySolution";
        try {
            Class<?> classTest = Class.forName(className);
            if (classTest.isAnnotation()) {
                List list = Arrays.asList(classTest.getAnnotatedInterfaces());
                System.out.println("hello");
                System.out.println(list);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void scan(Class<?> primarySource) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        Assert.notNull(primarySource, "PrimarySources must not be null");
        String packageName = primarySource.getPackage().getName();


    }

    public static void run(Class<?> primarySource) {
        new Container().scan(primarySource);
    }

}
