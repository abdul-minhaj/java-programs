package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageToRecoveryTesting {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"E:\\browser drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver ();
		
	//deleting all cookies
		driver.manage().deleteAllCookies();
		
		driver.get("http://way-2-sms.in/way2sms-login/");
		
	//wait command of SWD
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		if(driver.manage().getCookies().size() != 0)
		{
			System.out.println("cookies are available, therefore web page can recover from abnormal state to normal state");
		}
		
		else
		{
			System.out.println("cookies are not available, therefore web page cannot recover from abnormal state to normal state");
		}
	}

}

/*OUTPUT:

cookies are available, therefore web page can recover from abnormal state to normal state

*/