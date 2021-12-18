package org.gmy.test.service.test.postprocessor;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author guomaoyang
 * @Date 2021/12/16
 */
public class UserService {
	private OrderService orderService;

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void test(){
		System.out.println(orderService);
	}
}
