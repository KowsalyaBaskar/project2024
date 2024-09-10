package org.sample;

import org.base.BaseClass;
import org.login.SampleActions;


public class Actionsss extends BaseClass{
public static void main(String[] args) {

	browserLaunching("chrome");
	
	urlLaunch("https://www.flipkart.com/");
	
	implicitait(20);
	
	SampleActions s = new SampleActions();
	
	clickAction(s.getBtnLogin());
	
	movetoElement(s.getBtnWomen());
	
	click(s.getBtnTopWear());
	
	sendKeys(s.getTxtSearch(), "Iphone");
	
	doubleclick(s.getTxtSearch());
	
	contextClick(s.getTxtSearch());
}
}
