package com.nykaa.project.nykaa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	
	public static void Launch_Browser(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			ChromeOptions chrome = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chrome);
			driver.manage().window().maximize();
		}else if (value.equalsIgnoreCase("firefox")) {
			FirefoxOptions firefox = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefox);
			
		}
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
    public static void input_Values(WebElement element,String value) {
    element.sendKeys(value);
    }
    public static void quit() {
    	driver.quit();
    }
    public static void screenshot(String name) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File destination = new File("C:\\Users\\Joe\\eclipse-workspace\\selenium\\Screenshot\\"+name+".png");
    	FileUtils.copyFile(source, destination);
    	}
    public static void close() {
    	driver.close();
    	
    }
     public static void enable(WebElement yo){
    	 yo.isEnabled();
     }
     public static void click(WebElement click) {
    	 click.click();
     }
     public static void actions(WebElement action) {
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(action).perform();
    			 
     }
 public static void select(WebElement select,String sel) {
 Select sel1 = new Select(select);
 sel1.selectByVisibleText(sel);
 }
public static void frame(WebElement frame) {
driver.switchTo().frame(frame);
}
public static void windowhandle() {
	for (String allwindow : driver.getWindowHandles()) {
		driver.switchTo().window(allwindow);
	}
	
}
}
