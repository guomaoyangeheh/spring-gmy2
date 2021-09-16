package org.gmy.test;

import org.gmy.test.service.MyFactoryBean;
import org.gmy.test.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

/**
 * @Author guomaoyang
 * @Date 2021/8/17
 */
@Configuration
@ComponentScan("org.gmy.test.service")
public class ApplicationgStart {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationgStart.class);
		System.out.println(applicationContext.getBean("userService"));
		System.out.println(applicationContext.getBean("myFactoryBean"));
		/*UserServiceImpl userServiceImpl = applicationContext.getBean("userService", UserServiceImpl.class);
		userServiceImpl.sayHello();*/
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
