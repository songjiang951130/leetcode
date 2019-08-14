package com.github.songjiang951130.ioc.context.annotation;

import com.github.songjiang951130.ioc.core.bean.factory.BeanDefinition;
import com.github.songjiang951130.ioc.core.bean.factory.xml.ParserContext;
import com.github.songjiang951130.ioc.core.utils.StringUtils;
import org.w3c.dom.Element;

/**
 * Parser for the <context:component-scan/> element.
 */
public class ComponentScanBeanDefinitionParser {
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        String basePackage = element.getAttribute("base-package");
        String[] basePages = StringUtils.tokenizeToStringArray(basePackage, ",; \t\n");

//        basePackages
        return null;
    }
}
