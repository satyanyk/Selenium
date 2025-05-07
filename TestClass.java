package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;



import pageClass.LoginClass;

public class TestClass extends LoginClass{
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adminqa.5p.dev.corp.decisivedge.com/login");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	}
	
	@Test
	public void loginWithValidCredential()
	{
		LoginClass obj= new LoginClass();
		obj.login();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement actual= driver.findElement(By.id("HomePage"));
		Assert.assertEquals(actual, "Home page");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
