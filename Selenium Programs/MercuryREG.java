package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryREG {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("abdul");
		driver.findElement(By.name("phone")).sendKeys("1324567893");
		driver.findElement(By.name("address1")).sendKeys("skzr");
		driver.findElement(By.name("city")).sendKeys("hyd");
		driver.findElement(By.name("state")).sendKeys("Telengana");
		driver.findElement(By.name("postalCode")).sendKeys("504296");
		Select s = new Select (driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("abdul_minhaj");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
