package com.gmy.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
public class GmyAroundAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("aroundAdvice before...");
		Object proceed = invocation.proceed();
		System.out.println("aroundAdvice after...");
		return proceed;
	}
}
