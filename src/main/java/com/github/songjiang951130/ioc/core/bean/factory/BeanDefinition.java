package com.github.songjiang951130.ioc.core.bean.factory;

public interface BeanDefinition {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    ClassLoader getBeanClassLoader();
}
