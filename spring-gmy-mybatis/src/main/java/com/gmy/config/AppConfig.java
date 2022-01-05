package com.gmy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guomaoyang
 * @Date 2021/12/20
 */
@Configuration
@ComponentScan("com.gmy")
@GmyMapperScan("com.gmy.mapper")
@MapperScan
public class AppConfig {

}
