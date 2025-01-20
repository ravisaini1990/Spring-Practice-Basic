package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.scope.PersonDao;
import com.example.packageComponent.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {
	static Logger LOGGER =  LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		//Basic Practice
		basicWork(applicationContext);

		//Scope
		//scopePractice(applicationContext);

		//Component Scan diff package
		//componentPractice(applicationContext);
	}

	static void  componentPractice(ApplicationContext applicationContext) {
		ComponentDao personDao = applicationContext.getBean(ComponentDao.class);
		personDao.jdbcConnection();
	}

		static void  scopePractice(ApplicationContext applicationContext) {

		/// person is singleton but JDBC are scoped as prototype , so new instance will be created , by default its singleton if no scope given
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

        LOGGER.info("Person 1:: {} Person 2{}", personDao, personDao2);
		personDao.jdbcConnection();
		personDao.jdbcConnection();
		personDao2.jdbcConnection();
	}

		//basic approach
	static void  basicWork(ApplicationContext applicationContext) {
		//old approach
		/*SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl iSortAlgorithm = new BinarySearchImpl(new MergeSort());
		int[] result = iSortAlgorithm.binarySearch(new int[] {12, 19, 2, 1}, 12);
		System.out.println(Arrays.toString(result));*/


		//Only one component
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int[] num = new int[] {23, 12, 11, 7, 4};
		int result = binarySearch.binarySearch(num, 4);
		System.out.println("Result is: "+result);

		//ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		//BinarySearchImplQualifier binarySearch = applicationContext.getBean(BinarySearchImplQualifier.class);
		//BinarySearchImplQualifier binarySearch1 = applicationContext.getBean(BinarySearchImplQualifier.class);

		//System.out.println("Is same instance :: "+binarySearch1 +" vs "+binarySearch + "result ::>" + (binarySearch1 == binarySearch));


		int[] num1 = new int[] {23, 12, 11, 7, 4, 1};
		int result1 = binarySearch.binarySearch(num1, 4);
		System.out.println("Result is: "+result1);
	}
}
