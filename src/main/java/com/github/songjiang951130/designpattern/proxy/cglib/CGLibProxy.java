package com.github.songjiang951130.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String name = method.getName();
        System.out.println("调用方法名字:" + name);
        Object res = methodProxy.invokeSuper(obj, objects);
        return res;
    }

    public Object getInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
        Object proxyObject = enhancer.create();
        return proxyObject;
    }
}
