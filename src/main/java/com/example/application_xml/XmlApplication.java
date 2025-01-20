package com.example.application_xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//no config required as given in xml
public class XmlApplication {

	static Logger LOGGER =  LoggerFactory.getLogger(XmlApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			//get total beans objects , casting required otherwise only first bean instance printed we need all so cast to object
			LOGGER.info("Beans Loaded :{}", (Object) applicationContext.getBeanDefinitionNames());

			//XML Component Scan diff package
			XmlBusiness business = applicationContext.getBean(XmlBusiness.class);
			XmlBusiness xmlBusiness = applicationContext.getBean(XmlBusiness.class);

			LOGGER.info("Is Singleton Instance :{}", business == xmlBusiness);
			business.getXmlDao();
		}
	}

}
