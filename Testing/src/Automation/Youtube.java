package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Youtube {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=JFcgOboQZ08");
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		driver.findElement(By.xpath("//span[@title='Cheez Badi  Full Video | Machine | Mustafa & Kiara Advani | Udit Narayan & Neha Kakkar | T-Series']")).click();
		Thread.sleep(20);
		driver.quit();
		//span[@title='Cheez Badi  Full Video | Machine | Mustafa & Kiara Advani | Udit Narayan & Neha Kakkar | T-Series']
		//span[@title='Cheez Badi  Full Video | Machine | Mustafa & Kiara Advani | Udit Narayan & Neha Kakkar | T-Series']
		
	}
} 
		

