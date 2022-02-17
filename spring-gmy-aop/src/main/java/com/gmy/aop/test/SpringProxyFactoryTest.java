package com.gmy.aop.test;

import com.gmy.aop.advice.GmyAfterReturningAdvice;
import com.gmy.aop.advice.GmyAroundAdvice;
import com.gmy.aop.advice.GmyBeforeAdvice;
import com.gmy.aop.common.UserFacade;
import com.gmy.aop.common.UserService;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 *
 * @Author guomaoyang
 * @Date 2021/12/22
 */
public class SpringProxyFactoryTest {
	public static void main(String[] args) {
		UserService userService = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory();
		// 默认false，设置为true积极走CGLIB代理
		//proxyFactory.setOptimize(true);
		// 默认false，设置为true积极走CGLIB代理
		//proxyFactory.setProxyTargetClass(true);
		// 设置接口就会默认走JDK的动态代理，下面就必须通过接口强转
		//proxyFactory.setInterfaces(UserFacade.class);
		proxyFactory.setTarget(userService);
		/*proxyFactory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation invocation) throws Throwable {
				System.out.println("proxyFactory before...");
				Object proceed = invocation.proceed();
				System.out.println("proxyFactory after...");
				return proceed;
			}
		});*/
		/*proxyFactory.addAdvice(new GmyBeforeAdvice());
		proxyFactory.addAdvice(new GmyAfterReturningAdvice());
		proxyFactory.addAdvice(new GmyAroundAdvice());*/
		// Advisor 可以理解为 PointCut + Advice
		proxyFactory.addAdvisor(new PointcutAdvisor() {
			@Override
			public Pointcut getPointcut() {
				return new StaticMethodMatcherPointcut() {
					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().contains("test");
					}
				};
			}

			@Override
			public Advice getAdvice() {
				return new GmyAroundAdvice();
			}

			@Override
			public boolean isPerInstance() {
				return false;
			}
		});
		UserFacade proxy = (UserFacade) proxyFactory.getProxy();
		// proxy.test();
		proxy.a();
	}
}
