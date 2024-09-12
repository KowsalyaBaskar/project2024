package org.sample;

import java.io.IOException;

import org.base.BaseClass;
import org.login.LoginPage;
import org.openqa.selenium.WebElement;


public class Test extends BaseClass {
public static void main(String[] args) throws IOException {
	
	browserLaunching("chrome");
	
	urlLaunch("https://www.facebook.com/");
	
	implicitait(20);
	
	LoginPage l = new LoginPage();
	
	/*WebElement txtUsername = l.getTxtUsername();
	sendKeys(txtUsername, readExcel("LoginData", "login", 2, 0) );
	
	WebElement txtPassword = l.getTxtPassword();
	sendKeys(txtPassword, readExcel("LoginData", "login", 2, 1));
	
	//WebElement btnLogin = l.getBtnLogin();
	//click(btnLogin);
*/	
	
	sendKeys(l.getTxtUsername(), readExcel("LoginData", "login", 2, 0));
	sendKeys(l.getTxtPassword(), readExcel("LoginData", "login", 2, 1));
}
}
