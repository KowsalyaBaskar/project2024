package org.sample;



import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	//browserLaunch();
	
	browserLaunching("chrome");
	
	urlLaunch("https://www.facebook.com/");
	
	implicitait(20);
	
	String currentUrl = getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = getTitle();
	System.out.println(title);
	
	WebElement txtUserName = driver.findElement(By.id("email"));
	sendKeys(txtUserName, "Kowsi");
	
	String attribute = getAttribute(txtUserName);
	System.out.println(attribute);
	
	WebElement txtPassword= driver.findElement(By.id("pass"));
	sendKeys(txtPassword, "12345");
	
	String attribute2 = getAttribute(txtPassword);
	System.out.println(attribute2);
	
	WebElement btnLogin= driver.findElement(By.name("login"));
	click(btnLogin);
	
	//quit();
	//close();
}
}
