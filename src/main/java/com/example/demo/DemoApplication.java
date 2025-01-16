package com.example.demo;

import com.example.demo.basic.BinarySearchImplQualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {



	}


	//basic approach
	static void  basicWork(String[] args) {
		//old approach
		/*SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl iSortAlgorithm = new BinarySearchImpl(new MergeSort());
		int[] result = iSortAlgorithm.binarySearch(new int[] {12, 19, 2, 1}, 12);
		System.out.println(Arrays.toString(result));*/


		//Only one component
		/*ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int[] num = new int[] {23, 12, 11, 7, 4};
		int result = binarySearch.binarySearch(num, 4);
		System.out.println("Result is: "+result +" sorting type is "+binarySearch.getSorter());*/

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImplQualifier binarySearch = applicationContext.getBean(BinarySearchImplQualifier.class);
		BinarySearchImplQualifier binarySearch1 = applicationContext.getBean(BinarySearchImplQualifier.class);

		System.out.println("Is same instance :: "+binarySearch1 +" vs "+binarySearch + "result ::>" + (binarySearch1 == binarySearch));


		int[] num = new int[] {23, 12, 11, 7, 4, 1};
		int result = binarySearch.binarySearch(num, 4);
		System.out.println("Result is: "+result);
	}
}
