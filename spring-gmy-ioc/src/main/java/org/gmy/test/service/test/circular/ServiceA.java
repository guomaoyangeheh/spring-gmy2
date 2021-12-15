package org.gmy.test.service.test.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/12/10
 */
@Component
public class ServiceA {
	@Autowired
	private ServiceB serviceB;
}
