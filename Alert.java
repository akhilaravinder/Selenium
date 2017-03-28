package browsercommands;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;


public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://jsbin.com/usidix/1");
driver.findElement(By.xpath("html/body/input")).click();
org.openqa.selenium.Alert myAlert = driver.switchTo().alert();
Thread.sleep(3000);
myAlert.accept();
	}

	
	public String getPropValues() throws IOException {
		
				try {
					Properties prop = new Properties();
					String propFileName = "environment.properties";
		
	FileInputStream	inputStream = (FileInputStream) getClass().getClassLoader().getResourceAsStream(propFileName);
		
					if (inputStream != null) {
						prop.load(inputStream);
					} else {
						throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
					}
					
					
					String URL = prop.getProperty("RediffMailURL");

				}
	}
}
