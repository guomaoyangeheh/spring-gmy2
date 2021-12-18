package org.gmy.test.service;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guomaoyang
 * @Date 2021/9/23
 */
@Configuration
@ComponentScan("org.gmy.test.service.test.postprocessor")
public class AppConfig {

	/*@Bean(autowire = Autowire.BY_NAME)
	public UserService userService(){
		return new UserService();
	}*/

	/*@Bean(autowire = Autowire.BY_NAME)
	public ServiceC serviceC(){
		return new ServiceC();
	}*/
}
