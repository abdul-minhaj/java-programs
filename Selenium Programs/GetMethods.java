package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.google.com");
		
		String t = driver.getTitle();
		System.out.println(t); //Google
		
		/*String p= driver.getPageSource();
		System.out.println(p); // page source displayed*/
		
		String U = driver.getCurrentUrl(); //https://www.google.co.in/?gfe_rd=cr&ei=Xc7KWOPCJ9KA2QSbq4agCw&gws_rd=ssl
		System.out.println(U);
		
		if (U.contains("https"))
		{
			System.out.println("It is Secured");
		}
		else
		{
			System.out.println("It is Un-Secured");
		}
			
		driver.quit();
		
		
	
	}

}

