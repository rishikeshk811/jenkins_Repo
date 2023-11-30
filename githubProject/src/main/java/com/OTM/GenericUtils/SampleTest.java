package com.OTM.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	WebDriver driver;
	
	@Test
	public void m1Test() {
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		System.out.println("browser is launching ");
	
	}
}
