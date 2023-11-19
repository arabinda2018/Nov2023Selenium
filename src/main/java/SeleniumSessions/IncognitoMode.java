package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
	//	co.setHeadless(true);//https://www.selenium.dev/blog/2023/headless-is-going-away/
		co.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
	}

}
