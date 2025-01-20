package com.example.packageComponent;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.packageComponent")
public class ScanComponentApplication {
	static Logger LOGGER =  LoggerFactory.getLogger(ScanComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ScanComponentApplication.class, args);

		//Component Scan diff package
		componentPractice(applicationContext);
	}

	/// Note - to find bean in diff package , since it throw error as files not in same package
	static void  componentPractice(ApplicationContext applicationContext) {
		ComponentDao personDao = applicationContext.getBean(ComponentDao.class);
		personDao.jdbcConnection();
	}
}
