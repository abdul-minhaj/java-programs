package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Way2SMS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver ();
		driver.get("http://way-2-sms.in/way2sms-login/");
		driver.findElement(By.className("alignnone")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("9610275514");
		driver.findElement(By.id("password")).sendKeys("minhaj786");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[@class = 'but reds1 fl skip']")).click();
		driver.findElement(By.xpath("//*[@value='Send Free SMS']")).click();
		driver.findElement(By.linkText("Send SMS")).click();
		driver.findElement(By.id("mobile")).sendKeys("9610275514");
		driver.findElement(By.id("message")).sendKeys("good night");
		driver.findElement(By.id("send")).sendKeys("good night");
		driver.findElement(By.className("lout")).click();
		
		
		
		/* INPUT[@type='button'])[2]
		
		Thread.sleep(5000);
		driver.close();*/
		

	}

}
