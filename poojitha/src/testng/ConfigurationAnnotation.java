package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("from beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("from beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("from beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("from beforemethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("from afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("from afterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("from afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("from afterSuite");
	}
	
	@Test
	public void method1() {
		System.out.println("method1");
	}
	
	@Test
	public void method2() {
		System.out.println("method2");
	}
	
//	@Test
//	public void method3() {
//		System.out.println("method3");
//	}
//	
//	@Test
//	public void method4() {
//		System.out.println("method4");
//	}
}
