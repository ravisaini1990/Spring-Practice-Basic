package com.example.demo;

import com.example.cdi_implementation.CdiBusiness;
import com.example.cdi_implementation.CdiDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.example.demo")
public class SpringFrameworkWithoutBootApplication {

	static Logger LOGGER =  LoggerFactory.getLogger(SpringFrameworkWithoutBootApplication.class);

	public static void main(String[] args) {

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkWithoutBootApplication.class);
		//applicationContext.close();

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringFrameworkWithoutBootApplication.class)) {


			//Component Scan diff package
			CdiBusiness personDao = applicationContext.getBean(CdiBusiness.class);
			CdiBusiness cdiBusiness2 = applicationContext.getBean(CdiBusiness.class);

			LOGGER.info("Is Singleton Instance :{}", personDao == cdiBusiness2);

			CdiDao cdiDao = personDao.getCdiDao();
			cdiDao.getDao();

			//applicationContext.close();
		}


	}

}
