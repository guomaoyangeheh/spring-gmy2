package com.gmy.aop.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
public class GmyBeforeAdvice implements  MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("MethodBeforeAdvice before...");
	}
}
