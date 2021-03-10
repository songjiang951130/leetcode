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
        TargetClass targetClass = new TargetClass();
        System.out.println(targetClass);
        CGLibProxy cgLibProxy = new CGLibProxy();
        TargetClass proxyObject = (TargetClass) cgLibProxy.getInstance(targetClass);
        //com.github.songjiang951130.designpattern.proxy.cglib.TargetClass$$EnhancerByCGLIB$$e1d6dc7f@1edf1c96
        //展示 类名@hashcode
        System.out.println(proxyObject);
        int ram = proxyObject.display();
        System.out.println("ram value:" + ram);
    }
}
