package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;

public class LaunguageSelect extends TestBase{
	
	@Test
	public void selectlanguage()
	{
		//Select any language from dropdown
		Select select = new Select(driver.findElement(By.cssSelector(OR.getProperty("selectlanguage"))));
		select.selectByValue("fr");
		driver.get(Config.getProperty("testsiteurl"));
		
        Reporter.log("Select any language from dropdrop");
        
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\Language.PNG"+ ">click to open screenshot</a>");

	}

}
