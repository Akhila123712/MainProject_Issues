package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/*******Screen Shot******/

public class Screenshot {
	
	static String projectPath = System.getProperty("user.dir");
	
	public void screenShot(WebDriver driver) throws InterruptedException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot, new File(projectPath + "\\screenshots\\" +Dateutil.getTimeStamp() + ".jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}