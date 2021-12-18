package org.gmy.test.service.test.postprocessor;

import org.gmy.test.service.test.circular.ServiceA;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/12/16
 */
@Component
public class GmyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 这个可以修改BeanDefinition 或者注册自定义BeanDefinition
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(UserService.class);
		rootBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		registry.registerBeanDefinition("userService",rootBeanDefinition);


	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
