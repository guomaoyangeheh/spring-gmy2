package com.gmy.config;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

import java.util.Set;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
public class GmyClassPathMapperScan extends ClassPathBeanDefinitionScanner {
	public GmyClassPathMapperScan(BeanDefinitionRegistry registry) {
		super(registry);
		// 增加一个包含过滤器，允许所有的类被识别为候选者
		addIncludeFilter((metadataReader,metadataReaderFactory)->true);
	}
	/**
	 * 修改判断是否候选者
	 * 如果是接口类型并且是独立的返回为true（与spring的恰恰相反）
	 * @param beanDefinition the bean definition to check
	 * @return
	 */
	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().isIndependent();
	}
	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
		if(!beanDefinitionHolders.isEmpty()){
			for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
				ScannedGenericBeanDefinition beanDefinition = (ScannedGenericBeanDefinition) beanDefinitionHolder.getBeanDefinition();
				beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
				beanDefinition.setBeanClassName(GmyMapperFactoryBean.class.getName());
			}
		}
		return beanDefinitionHolders;
	}
}
