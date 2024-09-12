package org.login;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.sample.ProjectSample;
public class ProjectClass extends BaseClass {
public static void main(String[] args) {
	browserLaunching("chrome");
	
	urlLaunch("https://www.flipkart.com/");
	
	implicitait(20);
	
	ProjectSample p = new ProjectSample();
	
	sendKeys(p.getTxtSearch(), "iphone 15");
	
	click(p.getBtnSearch());
	
	String text = getText(p.getResult());
	System.out.println(text);
	
	int extractedNumber = extractNumber(text);
	System.out.println("Total Results: "+extractedNumber);
	
	int extractNum = extractNumberAfterHyphen(text);
	System.out.println("Current page: "+extractNum);
	
	List<WebElement> productElements = p.getPhoneName();
	
	for (WebElement productElement : productElements) {
	        String productName = productElement.getText();
	        System.out.println("Product Name: " + productName);
	    }
	List<WebElement> phonePrice = p.getPhonePrice();
	
	for (WebElement productElement : phonePrice) {
        String productName = productElement.getText();
        System.out.println("Product Name: " + productName);
    }

}	
}
