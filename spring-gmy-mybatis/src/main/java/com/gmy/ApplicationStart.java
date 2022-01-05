package com.gmy;


import com.gmy.config.AppConfig;
import com.gmy.mapper.UserMapper;
import com.gmy.service.BizService;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author guomaoyang
 * @Date 2021/8/17
 */
public class ApplicationStart {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();

		/*// 方案1：通过BeanDefinition的方式注册Mapper，直接pass因为接口不能被实例化
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserMapper.class);
		applicationContext.registerBeanDefinition("userMapper",beanDefinitionBuilder.getBeanDefinition());*/

		BizService bean = applicationContext.getBean(BizService.class);
		bean.test();
	}
}
