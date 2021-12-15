package org.gmy.test.service.ext;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 在bean实例化后可以修改BeanDefinition
 * @Author guomaoyang
 * @Date 2021/9/17
 */
@Component
public class MyMergedBeanPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if(beanName.equals("orderService")){
			MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
			propertyValues.addPropertyValue("age",18);
			System.out.println("设置BeanDefinition属性...");
			// beanDefinition.setDestroyMethodName("destroy");
		}

	}
}
