package browsercommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Browsercommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();//opens firefox browser and maximize
		
		driver.get("https://www.google.com//");//goto the URL provided
		WebElement  element = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));//finds the webelement which xpath is provided
		element.click();//clicks the webelment and opens the window
		Set<String> allWindows = driver.getWindowHandles();
		String childWindow = (String)allWindows.toArray()[1];
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
