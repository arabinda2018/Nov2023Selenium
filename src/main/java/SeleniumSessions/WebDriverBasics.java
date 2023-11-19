package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//win:
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\naveen\\downloads\\chromedriver.exe");
		
		//mac:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//1. open browser

		//2. launch url:
		driver.get("https://www.google.com");
		
		//3. get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		
		
		//validation point/checkpoint/act vs exp:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//automation steps + validation ==> Automation Testing
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pgSrce = driver.getPageSource();
		System.out.println(pgSrce);
		
		if(pgSrce.contains("Copyright The Closure Library Authors")) {
			System.out.println("this info is present");
		}
		
		
		driver.quit();//close browser
		
		
		
	}

}
