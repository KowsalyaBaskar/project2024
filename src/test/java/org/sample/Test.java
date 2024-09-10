package org.sample;

import org.base.BaseClass;
import org.login.LoginPage;
import org.openqa.selenium.WebElement;


public class Test extends BaseClass {
public static void main(String[] args) {
	
	browserLaunching("chrome");
	
	urlLaunch("https://www.facebook.com/");
	
	implicitait(20);
	
	LoginPage l = new LoginPage();
	
	WebElement txtUsername = l.getTxtUsername();
	sendKeys(txtUsername, "Kowsi");
	
	WebElement txtPassword = l.getTxtPassword();
	sendKeys(txtPassword, "12345");
	
	WebElement btnLogin = l.getBtnLogin();
	click(btnLogin);
	
}
}
