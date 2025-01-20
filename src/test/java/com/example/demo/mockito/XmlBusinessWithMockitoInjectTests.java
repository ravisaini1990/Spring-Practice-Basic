package com.example.demo.mockito;

import com.example.application_xml.XmlBusiness;
import com.example.application_xml.XmlDao;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/// Test cases
@ExtendWith(MockitoExtension.class)
class XmlBusinessWithMockitoInjectTests {

	@InjectMocks
	XmlBusiness business;

	@Mock
	XmlDao xmlDao;

	@BeforeAll
	static void beforeAllTest() {
		System.out.println("test beforeAllTest");
	}

	@BeforeEach
	void setUp() {
		when(xmlDao.getDaoName()).thenReturn(XmlDao.class.getSimpleName());
		System.out.println("test before each test case");
	}


	@Test
	void contextLoads() {
		assertEquals("XmlDao", business.getXmlDao());
		assertFalse(business.getName().isEmpty());
		System.out.println("test contextLoads");
	}

	@Test
	void isNameEmpty() {
		assertFalse(business.getName().isEmpty());
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
