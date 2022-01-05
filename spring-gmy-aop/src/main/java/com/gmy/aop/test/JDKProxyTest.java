package com.gmy.aop.test;

import com.gmy.aop.common.UserFacade;
import com.gmy.aop.common.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class JDKProxyTest {
	public static void main(String[] args) {
		UserService target = new UserService();

		Object proxy = Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserFacade.class}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("before...");
				Object result = method.invoke(target, args);
				System.out.println("after...");
				return result;
			}
		});

		UserFacade userService = (UserFacade) proxy;
		userService.test();
	}
}
