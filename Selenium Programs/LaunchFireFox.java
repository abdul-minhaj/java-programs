package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFireFox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver" ,"E:\\browser drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abdul minhaj");
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();
		//unable to execute program after above line
		driver.close();


	}

}
