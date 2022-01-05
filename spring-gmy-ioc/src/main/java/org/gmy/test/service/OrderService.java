package org.gmy.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/9/23
 */
//@Component
public class OrderService {

	private Integer age;
	@Autowired
	private UserService userService;

	public void setAge(Integer age) {
		this.age = age;
	}
}
