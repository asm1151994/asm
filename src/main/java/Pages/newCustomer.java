package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.GuruBase;

public class newCustomer extends GuruBase {
	@FindBy(xpath = "//input[@name=\"uid\"]")private WebElement userId;
	
	public newCustomer() {
		PageFactory.initElements(driver, this);
	}
}
