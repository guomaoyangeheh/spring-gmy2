package org.gmy.test.service.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 在Bean的实力话前后时机，还可在Bean实例化后，对属性进行后置处理
 * @Author guomaoyang
 * @Date 2021/9/17
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if(beanName.equals("userService")){
			System.out.println("bean实例化之前调用...");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userService")){
			System.out.println("bean实例化之后调用...");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if(beanName.equals("userService")){
			System.out.println("对userService属性进行后置处理...");
		}
		return null;
	}
}
