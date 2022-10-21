package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.GuruBase;
import Utility.PropertyFile;

public class loginPg extends GuruBase {
	@FindBy(xpath = "//input[@name=\"uid\"]")private WebElement userId;
	@FindBy(xpath = "//input[@name=\"password\"]")private WebElement password;
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")	private WebElement loginButton;
	
	public loginPg()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String title()
	{
		return driver.getTitle();
	}
	
	public void loggingIn() throws Exception
	{
		userId.sendKeys(PropertyFile.readPropertyFile("username"));
		password.sendKeys(PropertyFile.readPropertyFile("password"));
		loginButton.click();
	}
	
	
}
