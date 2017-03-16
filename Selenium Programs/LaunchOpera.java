package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;




public class LaunchOpera {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver","E:\\browser drivers\\operadriver_win64\\operadriver.exe" );
		WebDriver driver = new OperaDriver ();
		//unable to execute program after above line
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abdul minhaj");
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		driver.close();
	}
}

