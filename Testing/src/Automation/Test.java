package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Repository.ReadExcel;
import Repository.Screenshot;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("browser title"+ driver.getTitle());
		ReadExcel.methodReadExcelSheet("D:\\educational\\Selenium Python software n tools\\Testdata.xlsx", 0);
		Thread.sleep(5000);
		Screenshot.screenShot(driver);
		System.out.println("Waited 5 sec");
		driver.quit();



	}

}
