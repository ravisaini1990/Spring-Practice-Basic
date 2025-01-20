package com.example.demo.mockito;

import com.example.application_xml.XmlBusiness;
import com.example.application_xml.XmlDao;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/// Test cases
class XmlBusinessWithMockitoTests {

	//@Mock(XmlBusiness.class)
	XmlBusiness binarySearch;

	@BeforeAll
	static void beforeAllTest() {
		System.out.println("test beforeAllTest");
	}


	@BeforeEach
	void setUp() {
		binarySearch = mock(XmlBusiness.class);

		when(binarySearch.getXmlDao()).thenReturn(XmlDao.class.getSimpleName());
		when(binarySearch.getName()).thenReturn(XmlBusiness.class.getSimpleName());
		//binarySearch = new XmlBusiness();
		System.out.println("test before each test case");
	}


	@Test
	void contextLoads() {
		//binarySearch.setXmlDao(new XmlDao());
		assertEquals("XmlBusiness", binarySearch.getName());
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
