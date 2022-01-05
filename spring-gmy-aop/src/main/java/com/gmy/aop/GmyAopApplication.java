package com.gmy.aop;

import com.gmy.aop.common.UserFacade;
import com.gmy.aop.common.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
public class GmyAopApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		UserFacade bean =(UserFacade) applicationContext.getBean("userService");
		bean.test();
		//bean.a();
	}
}
