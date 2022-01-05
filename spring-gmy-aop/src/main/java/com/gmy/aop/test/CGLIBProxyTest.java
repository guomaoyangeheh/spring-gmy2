package com.gmy.aop.test;

import com.gmy.aop.common.UserService;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
public class CGLIBProxyTest {
	public static void main(String[] args) {
		UserService userService = new UserService();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserService.class);
		enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("cglib before...");
				Object invoke = method.invoke(userService, objects);
				System.out.println("cglib after...");
				return invoke;
			}
		}});
		UserService cglibProxy = (UserService) enhancer.create();
		cglibProxy.test();
	}
}
