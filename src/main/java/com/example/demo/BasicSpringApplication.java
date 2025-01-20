package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class BasicSpringApplication {
	static Logger LOGGER =  LoggerFactory.getLogger(BasicSpringApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(BasicSpringApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int[] num = new int[] {23, 12, 11, 7, 4};
		int result = binarySearch.binarySearch(num, 4);
		LOGGER.info("Result is {}", result);
	}
}
