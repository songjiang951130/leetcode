package com.github.songjiang951130.ioc.core;

import com.github.songjiang951130.ioc.core.annotation.Autowired;
import com.github.songjiang951130.ioc.core.annotation.Component;
import com.github.songjiang951130.ioc.core.utils.Assert;
import com.github.songjiang951130.leetcode.array.ArraySolution;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class Container {
    //存储实例化的bean
    private static Map<String, Object> beanMap = new HashMap<>();


    /**
     * 参考博客：
     * https://www.cnblogs.com/youdiaodaxue16/p/9813087.html
     * https://www.cnblogs.com/javaLin/p/8341388.html
     * spring 源码
     */
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

    /**
     * @param path        文件绝对路径
     * @param packageName 类报名
     */
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
                handleClassFile(className);

            }
        }
    }

    public void handleClassFile(String name) {
        try {
            Class targetClass = Class.forName(name);
            if (targetClass.isAnnotationPresent(Component.class)) {
                for (Annotation annotation : targetClass.getAnnotations()) {
                    Object object = targetClass.newInstance();
                    System.out.println("注解 type:" + annotation.annotationType().toString() + " " + targetClass.getName());
                    Field[] fields = targetClass.getDeclaredFields();

                    System.out.println("length:" + fields.length);

                    for (Field field : fields) {
                        field.setAccessible(true);
                        System.out.println("field:" + field);
                        System.out.println("设置field 000"+field.isAnnotationPresent(Autowired.class));
                        if (field.isAnnotationPresent(Autowired.class)) {
                            System.out.println("设置field 1111"+" "+field.getType().getClass().toString());
//                            if(field.getType().getClass().equals("class java.lang.Class")){
                                System.out.println("设置field 2222");
                                field.set(object, "hello world");
//                            }
                        }
                    }
                    System.out.println("field over"+((ArraySolution)object).getTestField());
                    //java 9 不推荐用了

                    beanMap.put(targetClass.getName(), object);
                    System.out.println(beanMap);
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static Object getBean(String name) {
        return beanMap.get(name);
    }
}
