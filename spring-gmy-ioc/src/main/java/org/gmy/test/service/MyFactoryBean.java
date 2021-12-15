package org.gmy.test.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/9/14
 */
//@Component
public class MyFactoryBean implements FactoryBean<UserService> {

	@Override
	public UserService getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}
}
