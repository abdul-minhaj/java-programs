package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageTo {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver ();
		driver.get("http:www.google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//manage().window().getSize()>.getWidth(); : is used to get size of width of current web page
		
		int w = driver.manage().window().getSize().getWidth();
		int h = driver.manage().window().getSize().getHeight();
		System.out.println(w + " "+ h);
		
		// manage().window.setSize() : use to change size of web page or manipulation size of browser windows on desktop
		
		Dimension d = new Dimension (100,200);
		driver .manage().window().setSize(d);
		Thread.sleep(5000);
		
		
		//manage().window().getPostion(): is used to get position of browser window on desktop
		
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		System.out.println(x + " "+ y);
		
		
		//manage().window().setPosition(): is used to set position of browser window on desktop
		
		Point P = new Point (200,300);
		driver.manage().window().setPosition(P);
		
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
