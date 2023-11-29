package com.OTM.GenericUtils;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClassTest {
	
	
	@Test
	public void config_BC() {
		System.out.println("this is before class");
	}
	@Test
	public void config_BM() {
		System.out.println("this is before Method ");
	}
	@Test
	public void config_AM() {
		System.out.println("this is After MEthod ");
		
	}
	@Test
	public void cofig_AC() {
		System.out.println("this is after class");
	}
	
}
