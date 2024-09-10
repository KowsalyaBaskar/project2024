package org.sample;

import org.base.BaseClass;
import org.login.Login;

public class Checking extends BaseClass {
public static void main(String[] args) {
	browserLaunching("chrome");
	
	urlLaunch("https://www.shopclues.com/wholesale.html");
	
	implicitait(20);
	
	Login l = new Login();
	
	click(l.getBtnSignIn());
	
	click(l.getBtnRegister());
	
	sendKeys(l.getTxtEmail(), "kowsi2611@gmail.com");
	
	sendKeys(l.getPhoneNumber(), "9003709990");
	
	click(l.getRegister());
}
}
