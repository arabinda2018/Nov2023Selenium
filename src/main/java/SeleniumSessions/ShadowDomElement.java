package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {
	
	//Browser
		//page -- elements
			//iframe -- elements
				//shadow DOM (open) -- element -- tea - SK
	//shadow dome is close we cann't automate it.
	//console :where we execute java script on the browser.
						

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		//driver.findElement(By.id("tea")).sendKeys("masala tea");

		driver.switchTo().frame("pact");
		//document.querySelector("#snacktime").shadowRoot.querySelector('#tea')
		
		//converting driver to javascriptexecutor.
		//javascriptexecutior is an interface.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea = 
				(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
		
		tea.sendKeys("Masala Tea");
		
	}

}
