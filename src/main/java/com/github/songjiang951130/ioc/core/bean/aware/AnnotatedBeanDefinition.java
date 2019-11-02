package com.github.songjiang951130.ioc.core.bean.aware;

import com.github.songjiang951130.ioc.core.bean.factory.BeanDefinition;

public interface AnnotatedBeanDefinition extends BeanDefinition {

	/**
	 * Obtain the annotation metadata (as well as basic class metadata) for this
	 * bean definition's bean class.
	 * 
	 * @return the annotation metadata object (never {@code null})
	 */
	// AnnotationMetadata getMetadata();

	/**
	 * Obtain metadata for this bean definition's factory method, if any.
	 * 
	 * @return the factory method metadata, or {@code null} if none
	 * @since 4.1.1
	 */
	// MethodMetadata getFactoryMethodMetadata();

}