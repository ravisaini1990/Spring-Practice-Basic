package com.example.external_properties;

import com.example.application_xml.XmlBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.example.external_properties")
@PropertySource("classpath:externalProperties.properties")
public class ExternalPropertiesApplication {

	static Logger LOGGER = LoggerFactory.getLogger(ExternalPropertiesApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExternalPropertiesApplication.class)) {

			ExternalProperties externalProperties = applicationContext.getBean(ExternalProperties.class);
			LOGGER.info("External Base Url :{}", externalProperties.baseUrl);
			LOGGER.info("External is Production :{}", externalProperties.isProd);
			LOGGER.info("External Version :{}", externalProperties.buildVersion);
			LOGGER.info("ExternalProperties :{}", externalProperties);
		}

	}
}
