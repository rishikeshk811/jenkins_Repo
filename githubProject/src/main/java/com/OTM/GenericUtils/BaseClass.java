package com.OTM.GenericUtils;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	@BeforeClass
	public void config_BC() {
		System.out.println("this is before class");
	}
	@BeforeMethod
	public void config_BM() {
		System.out.println("this is before Method ");
	}
	@AfterMethod
	public void config_AM() {
		System.out.println("this is After MEthod ");
		
	}
	@AfterClass
	public void cofig_AC() {
		System.out.println("this is after class");
	}
	
}
