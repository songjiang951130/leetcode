package com.github.songjiang951130.designpattern.proxy;

import com.github.songjiang951130.designpattern.proxy.cglib.CGLibProxy;
import com.github.songjiang951130.designpattern.proxy.cglib.TargetClass;
import com.github.songjiang951130.designpattern.proxy.jdk.LogHandler;

import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        showJdkProxy();
        showCGLibProxy();
    }

    public static void showJdkProxy() {
        UserService userService = new UserServiceImpl();
        LogHandler logHandler = new LogHandler(userService);
        UserService proxyUserService = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                logHandler
        );
        proxyUserService.select();
        proxyUserService.update();
    }

    public static void showCGLibProxy() {
        TargetClass userService = new TargetClass();
        CGLibProxy cgLibProxy = new CGLibProxy();
        TargetClass proxyObject = (TargetClass) cgLibProxy.getInstance(userService);
        int ram = proxyObject.display();
        System.out.println("ram value:" + ram);
    }
}
