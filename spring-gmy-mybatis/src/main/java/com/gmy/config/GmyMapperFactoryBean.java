package com.gmy.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class GmyMapperFactoryBean implements FactoryBean {

	private Class mapper;
	public GmyMapperFactoryBean(Class mapper){
		this.mapper = mapper;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{mapper}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName());
				return null;
			}
		});
	}

	@Override
	public Class<?> getObjectType() {
		return mapper;
	}
}
