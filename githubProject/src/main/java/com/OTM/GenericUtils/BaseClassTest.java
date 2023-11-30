package com.OTM.GenericUtils;


import org.testng.annotations.Test;

public class BaseClassTest {
	
	
	@Test(groups = "smoke")
	public void config_BC() {
		System.out.println("this is smoke test Method 1");
	}
	@Test(groups = "regression")
	public void config_BM() {
		System.out.println("this is before Method ");
	}
	@Test
	public void config_AM() {
		System.out.println("this is After MEthod ");
		
	}
	@Test(groups = "smoke")
	public void cofig_AC() {
		System.out.println("this is after class");
	}
}