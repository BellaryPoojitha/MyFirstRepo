package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstrationOfAssertions {
	@Test
	public static void demo() {
//		String expectedtitle="https://demowebshop.tricentis.com/";
//		String actualtitle="https://www.amazon.in/";
		String expectedtitle="demo";
		String actualtitle="sample";
		
		//Hard Assert
		assertEquals(actualtitle, expectedtitle);
		
//		//Soft Assert
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(actualtitle,expectedtitle );
//		System.out.println("done");
//		soft.assertAll();
	}
}
