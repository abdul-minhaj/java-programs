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
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("XXXXXXXX");
		driver.findElement(By.id("password")).sendKeys("XXXXXXXX");
		Thread.sleep(5000);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class = 'but reds1 fl skip']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@value='Send Free SMS']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='sendSMS']/child::*")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("frame");// "FRAME" is frame name (syntax: driver.switchTo().frame("FRAME NAME");)
		driver.findElement(By.id("mobile")).sendKeys("XXXXXXXXXX");
		driver.findElement(By.id("message")).sendKeys("no responce ????");
		driver.findElement(By.id("Send")).click();
		driver.findElement(By.xpath("//*[@class='mess']/descendant::*[5]"));
		String x = driver.findElement(By.xpath("//*[@class='mess']/descendant::*[5]")).getText();
		System.out.println(x);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
		driver.close();
		

	}

}
