package org.gmy.test;

import org.gmy.test.service.AppConfig;
import org.gmy.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author guomaoyang
 * @Date 2021/8/17
 */
public class ApplicationgStart {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		/*System.out.println(applicationContext.getBean("userService"));
		System.out.println(applicationContext.getBean("myFactoryBean"));*/
		/*UserService userService = applicationContext.getBean("userService", UserService.class);
		userService.test();*/

		//applicationContext.close();
		/*AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(applicationContext);
		annotatedBeanDefinitionReader.register(UserServiceImpl.class);

		UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		userService.sayHello();*/

		/*Object myFactoryBean = applicationContext.getBean("myFactoryBean");
		System.out.println(myFactoryBean);
		System.out.println(applicationContext.getBean("&myFactoryBean"));*/

		/*SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
		MetadataReader metadataReader = simpleMetadataReaderFactory.getMetadataReader("org.gmy.test.service.UserServiceImpl");
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println(classMetadata.getClassName());
		System.out.println(classMetadata.getSuperClassName());

		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		System.out.println(annotationMetadata.getAnnotationTypes());*/

	}
}
