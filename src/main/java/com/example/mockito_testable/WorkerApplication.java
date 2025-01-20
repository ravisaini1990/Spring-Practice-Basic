package com.example.mockito_testable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkerApplication {
	static Logger LOGGER =  LoggerFactory.getLogger(WorkerApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("workerContext.xml")) {
			//XML Component Scan diff package
			WorkerBusiness business = applicationContext.getBean(WorkerBusiness.class);

			//LOGGER.info("Is Singleton Instance :{}", business == xmlBusiness);
			int result = business.fetchGreatestNumber();
			LOGGER.info("Max value :{}", result);

		}
	}
}
