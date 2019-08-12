package com.github.songjiang951130.ioc.core.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解作用的目标
@Target(ElementType.TYPE)
//注解生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {

}
