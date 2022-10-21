package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GuruBase {

	public static WebDriver driver;
	
	public static void link() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(PropertyFile.readPropertyFile("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	


}
