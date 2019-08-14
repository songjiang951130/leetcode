package com.github.songjiang951130.ioc.core;

import com.github.songjiang951130.ioc.core.annotation.Component;
import com.github.songjiang951130.ioc.core.utils.Assert;
import com.github.songjiang951130.leetcode.array.ArraySolution;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class Container {
    //存储实例化的bean
    private static Map<String, Object> beanMap = new HashMap<>();


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
        String packagePath = packageName.replace(".", "/");
        try {
            Enumeration<URL> resource = classloader.getResources(packagePath);
            while (resource.hasMoreElements()) {
                URL url = resource.nextElement();
                //仅处理文件型
                if (url.getProtocol().equals("file")) {
                    scanPackage(url.getFile(), packageName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void run(Class<?> primarySource) {
        new Container().scan(primarySource);
    }

    private void scanPackage(String path, String packageName) {
        File[] fileList = new File(path).listFiles(pathName -> {
            if (pathName.isDirectory()) {
                return true;
            }
            return pathName.getName().endsWith(".class");
        });
        if (fileList == null) {
            return;
        }

        for (File file : fileList) {
            if (file.isDirectory()) {
                //继续扫描文件夹
                path = file.getAbsolutePath().replace(".", "/");
                scanPackage(path, packageName + "." + file.getName());
            } else {
                String fileName = file.getName().replace(".class", "");

                String className = packageName + "." + fileName;
                try {
                    Class targetClass = Class.forName(className);
                    if (targetClass.isAnnotationPresent(Component.class)) {
                        for (Annotation annotation : targetClass.getAnnotations()) {
                            System.out.println("注解 type:" + annotation.annotationType().toString() + " " + targetClass.getName());
                            //java 9 不推荐用了
                            Object object = targetClass.newInstance();
                            beanMap.put(targetClass.getName(), object);
                            System.out.println(beanMap);
                        }
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Object getBean(String name) {
        return beanMap.get(name);
    }
}
