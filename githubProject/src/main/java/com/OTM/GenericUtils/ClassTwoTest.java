package com.OTM.GenericUtils;

import org.testng.annotations.Test;

public class ClassTwoTest {

	@Test(groups = "smoke")
	public void classTwoMethod1() {
		System.out.println("this is classTwo smokeMethod 1");
	}
	
	
	
	
	
	
	
	@Test(groups = "regression")	
public void classTwoMethod2() {
		System.out.println("this is classTwo regressionMethod 1");	
	}
	
	
	@Test(groups = "regression")	
public void classTwoMethod3() {
		System.out.println("this is classTwo regressionMethod 2");	
}

@Test(groups = "smoke")
public void classTwoMethod4() {
	System.out.println("this is classTwo smokeMethod 4");
}

}
