package browsercommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxesandradiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://ironspider.ca/forms/checkradio.htm");
		List<WebElement> checkboxes = driver.findElements(By.xpath(".//*[@id='Content']/div[1]/blockquote[1]/form/input"));
for(int i=0;i<checkboxes.size();i++){
			
			String colour = checkboxes.get(i).getAttribute("value");
			if(colour.equalsIgnoreCase("red")||colour.equalsIgnoreCase("yellow")||colour.equalsIgnoreCase("green")){
				if(!(checkboxes.get(i).isSelected())){
					checkboxes.get(i).click();	
					
				}
			}
}

		List<WebElement> radio = driver.findElements(By.xpath(".//*[@id='Content']/div[1]/blockquote[2]/form"));
		for(int i=0;i<radio.size();i++){
			WebElement local_radio=radio.get(i);
			String value=local_radio.getAttribute("value");
		}
			
		
		
				
			}
			
			
		
}
