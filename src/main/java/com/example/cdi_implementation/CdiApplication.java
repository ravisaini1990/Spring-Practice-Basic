package com.example.cdi_implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.cdi_implementation")
public class CdiApplication {
	static Logger LOGGER =  LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args);

		//Component Scan diff package
		CdiBusiness personDao = applicationContext.getBean(CdiBusiness.class);
		CdiBusiness cdiBusiness2 = applicationContext.getBean(CdiBusiness.class);

		LOGGER.info("Is Singleton Instance :{}", personDao == cdiBusiness2);

		CdiDao cdiDao = personDao.getCdiDao();
		cdiDao.getDao();
	}

}
