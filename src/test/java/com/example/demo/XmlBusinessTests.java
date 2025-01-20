package com.example.demo;

import com.example.application_xml.XmlBusiness;
import com.example.application_xml.XmlDao;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/// Test cases
class XmlBusinessTests {

	XmlBusiness binarySearch;

	@BeforeAll
	static void beforeAllTest() {
		System.out.println("test beforeAllTest");
	}


	@BeforeEach
	void setUp() {
		binarySearch = new XmlBusiness(new XmlDao());
		System.out.println("test before each test case");
	}


	@Test
	void contextLoads() {
		assertEquals("com.example.application_xml.XmlBusiness", binarySearch.getXmlDao().toString());
		assertFalse(binarySearch.getName().isEmpty());
		System.out.println("test contextLoads");
	}

	@Test
	void isNameEmpty() {
		assertFalse(binarySearch.getName().isEmpty());
		System.out.println(" test isNameEmpty");
	}

	@AfterEach
	void afterEachTest() {
		System.out.println("afterEachTest");
	}

	@AfterAll
	static void afterAllTest() {
		System.out.println("test afterAllTest");
	}
}
