package com.journaldev.spring.aspect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Kuldeep
 * 
 * custom initialization of bean for all beans at once
 *
 */
public class PostBeanPro implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After bean initialize : "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before bean initialize : "+beanName);
		return bean;
	}

}
