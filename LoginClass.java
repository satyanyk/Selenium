package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	public WebDriver driver;
	By userName=By.id("username");
	By passWord=By.id("password");
	By clickLogin=By.id("login");
	
	public WebElement getelement(By locatername)
	{
		return driver.findElement(locatername);
	}
	
	public void enterUserName(By locatername, String locaterValue)
	{
		getelement(locatername).sendKeys(locaterValue);
	}
	
	public void enterPassword(By locatername, String locaterValue)
	{
		getelement(locatername).sendKeys(locaterValue);
	}
	
	public void clickOnLogin(By locatername)
	{
		getelement(locatername).click();
	}
	
	public void login()
	{
		enterUserName(userName, "Snayak");
		enterPassword(passWord, "5thPort!");
		clickOnLogin(clickLogin);
	}

}
