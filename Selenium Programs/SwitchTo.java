package selenium;


	import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class SwitchTo {

		public static void main(String[] args) throws InterruptedException {
			
			// SwitchTo() alert example
			
			/*System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver ();
			driver.get("http://way-2-sms.in/way2sms-login/");
			driver.findElement(By.className("alignnone")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("username")).sendKeys("");
			driver.findElement(By.id("password")).sendKeys("minhaj786");
			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();
			
			*/
			
			
			// SwitchTo() window: change focus of the driver from current page to other browser window tag page
			
			
			/*
		
			System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver ();
			driver.get("http://way-2-sms.in/way2sms-login/");
			driver.findElement(By.className("alignnone")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='android-button']/descendant::*[4]")).click();
			
			// creating array list to store windows variables (location)
			ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
			//getWindowHandles(): to get browser windows or tabs into array list.
			
			//switching from window 0 to window 1
			driver.switchTo().window(a.get(1));
	
			driver.findElement(By.name("q")).sendKeys("mahesh tutorials app");
			driver.findElement(By.id("gbqfb")).click();
			Thread.sleep(5000);
			driver.close();
			
			// returning back to main window
			driver.switchTo().window(a.get(0));
			driver.findElement(By.id("username")).sendKeys("");
			driver.findElement(By.id("password")).sendKeys("minhaj786");
			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();
			*/
			
			
			//switchTo activeElement: to work with active element or focused element on current web page
			
			
			
			
			System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver ();
			driver.get("http://way-2-sms.in/way2sms-login/");
			driver.findElement(By.className("alignnone")).click();
			Thread.sleep(5000);
		
			driver.switchTo().activeElement().sendKeys("minhaj786");
			driver.close();
			
			
	}

}
