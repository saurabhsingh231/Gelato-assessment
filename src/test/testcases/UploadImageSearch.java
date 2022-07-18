package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class UploadImageSearch extends TestBase{
	
	@Test
	public void uploadimage()
	{
		
        driver.findElement(By.cssSelector(OR.getProperty("Imagebutton"))).click();
		
		//Select camera icon
		driver.findElement(By.cssSelector(OR.getProperty("camera"))).click();
		
		//Select upload an Image
        driver.findElement(By.cssSelector(OR.getProperty("uploadanimage"))).click();
		
        //browse image from computer and observe image is searched on google.
		driver.findElement(By.cssSelector(OR.getProperty("choosefile"))).sendKeys("C:\\Users\\BENQ\\Desktop\\Gelato\\camera.PNG");;
	}

}
