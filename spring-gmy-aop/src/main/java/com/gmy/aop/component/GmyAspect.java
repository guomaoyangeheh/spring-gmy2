package com.gmy.aop.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

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
}
