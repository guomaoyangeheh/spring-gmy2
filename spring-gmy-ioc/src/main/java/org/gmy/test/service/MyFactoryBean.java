package org.gmy.test.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/9/14
 */
//@Component
public class MyFactoryBean implements FactoryBean<UserServiceImpl> {

	@Override
	public UserServiceImpl getObject() throws Exception {
		return new UserServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return UserServiceImpl.class;
	}
}
