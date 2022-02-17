package org.gmy.test.service.test;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @Author guomaoyang
 * @Date 2022/2/9
 */
@Component
public class MyLifeCycle implements SmartLifecycle {
	private boolean isRunning = false;
	@Override
	public void start() {
		isRunning = true;
		System.out.println("容器启动了...");
	}

	@Override
	public void stop() {
		System.out.println("容器关闭了...");
		isRunning = false;
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}
}
