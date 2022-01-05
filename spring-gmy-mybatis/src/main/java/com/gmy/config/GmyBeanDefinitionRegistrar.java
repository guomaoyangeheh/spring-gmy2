package com.gmy.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
public class GmyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AnnotationAttributes mapperScanAttrs = AnnotationAttributes
				.fromMap(importingClassMetadata.getAnnotationAttributes(GmyMapperScan.class.getName()));
		if(mapperScanAttrs != null){
			String value = mapperScanAttrs.getString("value");
			System.out.println("scan path:"+value);
			GmyClassPathMapperScan gmyClassPathMapperScan = new GmyClassPathMapperScan(registry);
			gmyClassPathMapperScan.scan(value);
		}
	}
}
