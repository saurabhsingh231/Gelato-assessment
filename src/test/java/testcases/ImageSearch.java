package testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;


public class ImageSearch extends TestBase {

	@Test
	public void imagesearch()
	{
		driver.get(Config.getProperty("testsiteurl"));

		//click on Image button at the top of the screen.
		driver.findElement(By.cssSelector(OR.getProperty("Imagebutton"))).click();
		
		//Select camera icon
		driver.findElement(By.cssSelector(OR.getProperty("camera"))).click();
		
		//Upload image link on the link field.
		driver.findElement(By.cssSelector(OR.getProperty("uploadimage"))).sendKeys("https://upload.wikimedia.org/wikipedia/en/thumb/e/e3/2022_FIFA_World_Cup.svg/1200px-2022_FIFA_World_Cup.svg.png");
		
		//Click on search by image button.
		driver.findElement(By.cssSelector(OR.getProperty("searchbyimage"))).click();
		driver.get(Config.getProperty("testsiteurl"));

		
		
        Reporter.log("Select by image link");
        
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\camera.PNG"+ ">click to open screenshot</a>");

	}
}
