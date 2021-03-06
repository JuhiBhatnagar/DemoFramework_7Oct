package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	
	public static String captureScreenShot(WebDriver ldriver, String screenshotname) throws Exception{
		
		// Take screenshot and store as a file format  
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		
			
		String destination = "C:\\Users\\lenovo\\Desktop\\Seleinium_Project\\com.learn.framewrokcreation.etlhive\\Screenshots"+screenshotname+System.currentTimeMillis()+".jpeg";
		
		// now copy the  screenshot to desired location using copyFile method
	
		FileUtils.copyFile(src, new File(destination));
	
		return destination;
		
	}
		 
}
