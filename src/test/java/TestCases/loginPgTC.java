package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.GuruBase;
import Pages.loginPg;
import Utility.screenshot;

public class loginPgTC extends GuruBase {
	loginPg login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		link();
		//Thread.sleep(2000);
		login = new loginPg();
	}
	
	@Test (priority=1)
	public void verifyTitle()
	{
		String actual = login.title();
		login.title();
		assertEquals(actual, "Guru99 Bank Home Page");
	}
	
	@Test (priority=2)
	public void verifyLoggingIn() throws Exception
	{
		login.loggingIn();
		String actual= driver.getTitle();
		System.out.println(actual);
		assertEquals(actual , "Guru99 Bank Manager HomePagee");
	}
	
	
	
//	@AfterMethod
//	public void close(ITestResult r) throws Exception
//	{
//		if (ITestResult.FAILURE==r.getStatus())
//		{
//			screenshot.ssCapture(driver, r.getName());
//		}
//		driver.quit();
//	}
}
