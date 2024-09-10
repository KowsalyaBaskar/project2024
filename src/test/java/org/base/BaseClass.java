package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLaunching(String bname) {
		if(bname.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}
		return driver;
	}
	
	public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	public static void implicitait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	
	public static void doubleclick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}
	
	public static void movetoElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}
	
	public static void clickAction(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).perform();
	}
	
	public static String getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	
	public static String getTitle() {
	String title = driver.getTitle();
	return title;
	}
	
	public static void dropDown(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	
	public static void clear(WebElement e) {
		 e.clear();
	}
	
	public static WebDriver get(String a) {
		driver.get(a);
		return driver;
	}
	
	
	
	
	}

	

