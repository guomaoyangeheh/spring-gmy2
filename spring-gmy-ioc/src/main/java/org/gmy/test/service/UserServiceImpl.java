package org.gmy.test.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author guomaoyang
 * @Date 2021/8/17
 */
//@Service("userService")
public class UserServiceImpl {
	public void sayHello(){
		System.out.println("Hello Spring5!");
	}
}
