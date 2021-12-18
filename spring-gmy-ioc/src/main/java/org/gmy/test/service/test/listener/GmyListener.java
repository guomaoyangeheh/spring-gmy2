package org.gmy.test.service.test.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2021/12/16
 */
@Component
public class GmyListener implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("GmyListener 接收到容器刷新事件...");
		System.out.println(event);
	}
}
