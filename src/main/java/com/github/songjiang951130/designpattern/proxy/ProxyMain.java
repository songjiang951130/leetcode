package com.github.songjiang951130.designpattern.proxy;

import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        LogHandler logHandler = new LogHandler(userService);
        UserService proxyUserService = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                logHandler
        );
        proxyUserService.select();
    }
}
