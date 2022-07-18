package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;

public class Feelinglucky extends TestBase {
	
	@Test
	public void feelinglucky()
	{
		//launches I'm feeling lucky
		ele =  driver.findElement(By.cssSelector(OR.getProperty("feelinglucky")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
				
		//search on doodles
		driver.findElement(By.cssSelector(OR.getProperty("doodletextfield"))).sendKeys("fifa");
		driver.findElement(By.cssSelector(OR.getProperty("doodlesearch"))).click();
		
		//open on fifa link
		driver.findElement(By.cssSelector(OR.getProperty("clickonlink"))).click();
		
		//Scroll down till the bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Reporter.log("Doodle search fifa on doodle and page is able to scroll down ");
        
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\doodle1.PNG"+ ">click to open screenshot</a>");
		Reporter.log("<a href=" +"C:\\Users\\BENQ\\eclipse-workspace\\TestProject\\src\\test\\resources\\Screenshots\\doodle2.PNG"+ ">click to open screenshot</a>");

			
		
		
	}

}
