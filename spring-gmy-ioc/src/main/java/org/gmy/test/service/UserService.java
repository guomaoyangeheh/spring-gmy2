package org.gmy.test.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

/**
 * @Author guomaoyang
 * @Date 2021/8/17
 */
// @Service("userService")
public class UserService {

	private Integer age;

	private OrderService orderService;

	public void test(){
		System.out.println("orderService:"+orderService);
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	/*public UserServiceImpl() {
		System.out.println("UserServiceImpl construct...");
	}

	private Integer age;
	public void sayHello(){
		System.out.println("Hello Spring5! age:"+age);
	}

	public Integer getAge() {
		return age;
	}



	@PreDestroy
	public void destroy(){
		System.out.println("UserServiceImpl destroy...");
	}*/
}
