package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//what exactily you review in your test script?
//lunch chrome browser.
		WebDriver driver = new ChromeDriver();
	//lunch orangehrm.
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		//use implicity wait
		//Delete unwanted code.
		//lunch browser logic should be written inside beforeClass annotation.
		//As per automaiton rule xpath should not be hard coded inside thescript instead
		//we should get it from object repo.
		//Test script developer should follow java coding standard.
		//Every test step should have proper test comment and report feature.
		
		
		//window handler api
		//Click on Linnkedin button
		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		LnkdEle.click();
		
		//child window opens
		//switch driver to child window
		
		//1st: capture the window IDs
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();	
		
		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);
				
		//2nd: switch work
		driver.switchTo().window(childWindowId);
		System.out.println("child window url:" + driver.getCurrentUrl());
		//close the child window:
		driver.close();
		
		//switch back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url:" + driver.getCurrentUrl());

		
		driver.quit();
		

		
		
		
	}

}
