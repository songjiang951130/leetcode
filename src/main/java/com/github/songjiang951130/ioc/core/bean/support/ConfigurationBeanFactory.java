package com.github.songjiang951130.ioc.core.bean.support;

import com.github.songjiang951130.ioc.core.bean.exception.BeansException;
import com.github.songjiang951130.ioc.core.bean.factory.BeanFactory;

public class ConfigurationBeanFactory implements BeanFactory {
    @Override
    public Object getBean(String name) {

        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public boolean isSingleton(String name) throws BeansException {
        return false;
    }
}
