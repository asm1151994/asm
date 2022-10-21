package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void ssCapture(WebDriver driver, String methodName) throws Exception {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\ST-Data\\Fw-Guru99\\Screenshots" + methodName + ".png");
		FileHandler.copy(source, dest);	
		}

}
