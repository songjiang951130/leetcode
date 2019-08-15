package com.github.songjiang951130.ioc.core.aspectj;

/**
 * 参考文档：https://blog.csdn.net/gavin_john/article/details/80156963
 */
public aspect UserAspectJ {
    void around():call(void User.login()){
        System.out.println("begin");
        proceed();
        System.out.println("end");
    }
}