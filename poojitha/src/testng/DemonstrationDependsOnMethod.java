package testng;

import org.testng.annotations.Test;

public class DemonstrationDependsOnMethod {
	@Test()
	public void login()
	{
		System.out.println("login page");
	}
	
	@Test(dependsOnMethods = "login")
	public void home()
	{
		System.out.println("home page");
	}
	
	@Test(dependsOnMethods="home")
	public void logout() {
		System.out.println("logout page");
	}
}
