package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLogin {

	WebDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
	}	
		
	@Test
	public void operation() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
		
	}
		
		

	
}
