package com.gmy.aop.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author guomaoyang
 * @Date 2021/12/22
 */
@Component
public class UserService implements UserFacade {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test(){
		jdbcTemplate.execute("INSERT into test VALUES(10,'DD')");

		System.out.println("test");
	}

	public void a(){
		System.out.println("a");
	}
}
