package com.gmy.aop.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author guomaoyang
 * @Date 2021/12/23
 */
@Component
@Aspect
public class GmyAspect {

	@Around("execution(* com.gmy.aop.common.UserService.*(..))")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around before...");
		Object retVal = pjp.proceed();
		System.out.println("around after...");
		return retVal;
	}

	@Value("123")
	public Object doBasicProfiling2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around before...");
		Object retVal = pjp.proceed();
		System.out.println("around after...");
		return retVal;
	}
}
