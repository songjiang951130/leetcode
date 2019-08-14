package com.github.songjiang951130.ioc.core.bean.factory;

import com.github.songjiang951130.ioc.core.bean.exception.BeansException;


/**
 * 定义 bean 的生命周期
 */
public interface BeanFactory {
    Object getBean(String name);

    boolean containsBean(String name);

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
    boolean isSingleton(String name) throws BeansException;

}
