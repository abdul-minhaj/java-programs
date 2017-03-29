package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShot {


		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver ();
			driver.get("http://www.google.com");
			Thread.sleep(5000);
			File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File("F:\\java programs\\Selenium Programs\\image.png");
			FileUtils.copyFile(Src,Dest);
			driver.close();
			
			
			
			
	}

		
}
