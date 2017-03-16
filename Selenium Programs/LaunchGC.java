package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchGC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abdul minhaj");
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
