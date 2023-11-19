package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "firefox";		
		BrowserUtil brUtil = new BrowserUtil();//has a relationship
		
		brUtil.launchBrowser(browserName);//firefox
		
		brUtil.launchUrl("https://www.amazon.com");
		
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);	
		//validation point
		if(actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}		
	}
}
