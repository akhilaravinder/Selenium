package browsercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import frameworks.Loginobjects;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver  driver=new FirefoxDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.manage().window().maximize();
WebElement userNameTb = driver.findElement(Loginobjects.userNameTextbox);
userNameTb.sendKeys("Akhila Nampally");
WebElement rediffMailRm=driver.findElement(Loginobjects.rediffMailId);
rediffMailRm.sendKeys("akhila_nampally11");
if(driver.getPageSource().contains("Yippie! The ID you've chosen is available"))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[2]")).click();
WebElement passWordPd= driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input"));
passWordPd.sendKeys("Arundhathi@3");
WebElement retypePasswordRp=driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input"));
retypePasswordRp.sendKeys("Arundhathi@3");
WebElement alternateEmailAe=driver.findElement(By.xpath(".//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input"));
alternateEmailAe.sendKeys("akhila.nampally11@gmail.com");
 if(!driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[14]/td[2]/table/tbody/tr/td[1]/input")).isSelected())
 {
	 driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[14]/td[2]/table/tbody/tr/td[1]/input")).click();
 }
 WebElement securityQuestionSq=driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select"));
 Select securityQuestion=new Select(securityQuestionSq);
 securityQuestion.selectByIndex(1);
 WebElement enterAnswerEa=driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input"));
 enterAnswerEa.sendKeys("DPS");
 WebElement maidenNameMn=driver.findElement(By.xpath(".//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input"));
 maidenNameMn.sendKeys("xxx");
 WebElement mobileNoMn=driver.findElement(By.xpath(".//*[@id='mobno']"));
 mobileNoMn.sendKeys("0000000000");
 driver.findElement(By.xpath(".//*[@id='inpSendVeryCode']")).click();
 List<WebElement> genderG=driver.findElements(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[25]/td[3]"));
 
 
 WebElement dayD=driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[1]"));
 Select day=new Select(dayD);
 day.selectByIndex(10);
WebElement monthDd = driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[2]"))	;
Select month = new Select(monthDd);
//month.selectByIndex(7);
month.selectByValue("04");
WebElement yearY=driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[3]"));
Select year=new Select(yearY);
year.selectByIndex(3);
List<WebElement> options = month.getOptions();
for(int i=0;i<options.size();i++){
	System.out.println(options.get(i).getText());
	
}
WebElement countryC=driver.findElement(By.xpath(".//*[@id='country']"));
Select country=new Select(countryC);
country.selectByVisibleText("India");
WebElement cityCi=driver.findElement(By.xpath(".//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
Select city=new Select(cityCi);
city.selectByVisibleText("Hyderabad");
WebElement enterText=driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[33]/td[3]/input"));
enterText.sendKeys("YYY");
driver.findElement(By.xpath(".//*[@id='Register']")).click();
org.openqa.selenium.Alert myAlert=driver.switchTo().alert();
Thread.sleep(3000);
myAlert.accept();

	}
	

}
