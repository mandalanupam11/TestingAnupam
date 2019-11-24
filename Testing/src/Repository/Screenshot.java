package Repository;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void screenShot(WebDriver dr) throws IOException, InterruptedException {
		File src = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:/educational/Selenium Python software n tools/sele_test_scr_shots/screenshotNo_"+ timestamp() +".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		
	}
	public static String timestamp(){
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
