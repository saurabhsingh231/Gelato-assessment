package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	
	
	/*   Parent class for all the tests
	 * web driver
	 * properties
	 * logs
	 * extentreports
	 * db
	 * excel
	 * mail
	 */
	 
	
	public static WebDriver driver;
	public static WebElement ele;
	public static Select select;
	public static Properties Config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static FileInputStream fis1;
    public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	
	@BeforeSuite
	public void setUp() {
		
		if(driver == null)
		{
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\Config.properties");
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				
				Config.load(fis);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis1 = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\Or.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Config.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.config("Chrome opened");
				
			}
			else
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\executables\\geako.exe");
			}
			
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(Config.getProperty("implicitwait"))));
			
			
		}
		
	}
	
	
	
	
	
	@AfterSuite
	public void tearDown()
	{
		/*if(driver!= null)
		{
			driver.quit();
		}*/
	}
	
}
