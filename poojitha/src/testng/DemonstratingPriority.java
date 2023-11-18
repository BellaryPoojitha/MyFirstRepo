package testng;

import org.testng.annotations.Test;

public class DemonstratingPriority {
	
		@Test(priority=1)
		public void login() {
			System.out.println("login");
		}
		
		@Test(priority=-4)
		public void home() {
			System.out.println("home");
		}
		
		@Test(priority=-10)
		public void logout() {
			System.out.println("logout");
		}
		
		@Test(priority=-10,enabled=false)
		public void log() {
			System.out.println("logout");
		}
}
