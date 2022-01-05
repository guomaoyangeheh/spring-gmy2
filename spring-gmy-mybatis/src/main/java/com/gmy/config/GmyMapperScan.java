package com.gmy.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(GmyBeanDefinitionRegistrar.class)
public @interface GmyMapperScan {
	String value();
}
