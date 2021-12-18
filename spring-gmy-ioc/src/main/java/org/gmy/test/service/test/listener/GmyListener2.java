package org.gmy.test.service.test.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/12/16
 */
@Component
public class GmyListener2 implements ApplicationListener<PayloadApplicationEvent<String>> {

	@Override
	public void onApplicationEvent(PayloadApplicationEvent<String> event) {
		System.out.println("接收到消息："+event.getPayload());

	}
}
