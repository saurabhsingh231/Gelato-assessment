package testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;

public class GoogleSearch extends TestBase{
	
	@Test
	public void googlesearch()
	{
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		//search facebook on google  
		driver.findElement(By.cssSelector(OR.getProperty("googlesearch"))).sendKeys("facebook");
		
		//click on search button
		driver.findElement(By.cssSelector(OR.getProperty("searchbutton"))).click();
		
		//click on facebook link
		driver.findElement(By.cssSelector(OR.getProperty("facebookclick"))).click();
		driver.get(Config.getProperty("testsiteurl"));
		Reporter.log("Facebook search successfully executed");
		//Reporter.log("<a href=\"D:\\capture.PNG"> capture </a>");"
        
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\FB1.PNG"+ ">click to open screenshot</a>");
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\FB2.PNG"+ ">click to open screenshot</a>");

	}

}
