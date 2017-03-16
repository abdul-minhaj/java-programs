package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("abdul");
		
		driver.findElement(By.name("phone")).sendKeys("9610275514", Keys.TAB, "abdul_minhaj@ymail.com", 
		Keys.TAB, "QRT-D 456,", Keys.TAB, "SPM new colony", Keys.TAB, "SKZR", Keys.TAB, "telengana", Keys.TAB, 
		"504296", Keys.TAB, "INDIA", Keys.TAB, "Minnu", Keys.TAB, "12345", Keys.TAB, "12345", Keys.TAB );
		
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
		driver.close();
}
}

//by using Automated sendKeys we can even operate drop down list 