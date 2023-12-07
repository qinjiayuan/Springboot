package com.example.demo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class,
//		DataSourceTransactionManagerAutoConfiguration.class,
//		HibernateJpaAutoConfiguration.class},scanBasePackages = {"com.example.demo.test"})
@SpringBootApplication
//@ComponentScan("com.example.demo.test")
@MapperScan(basePackages ={"sql"} )
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);



	}

}
