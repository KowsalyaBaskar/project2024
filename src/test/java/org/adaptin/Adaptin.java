package org.adaptin;

import org.base.BaseClass;
import org.login.AdaptinLogin;

public class Adaptin extends BaseClass {
public static void main(String[] args) {
	browserLaunching("Chrome");
	
	urlLaunch("http://adactinhotelapp.com/");
	
	implicitait(20);
	
	AdaptinLogin a = new AdaptinLogin();
	
	sendKeys(a.getTxtUserName(), "KowsalyaBaskar");
	
	sendKeys(a.getTxtPassword(), "Kowsalya2611");
	
	click(a.getBtnLogin());
	
	dropDown(a.getLocation(), 8);
	
	dropDown(a.getHotel(), 2);
	
	dropDown(a.getRoomType(), 4);
	
	dropDown(a.getNoOfRooms(), 3);
	
	clear(a.getCheckInDate());
	
	clear(a.getCheckOutDate());
	
	sendKeys(a.getCheckInDate(), "10/09/2024");
	
	sendKeys(a.getCheckOutDate(), "15/10/2024");
	
	dropDown(a.getAdultRoom(), 2);
	
	dropDown(a.getChildRoom(), 3);
	
	click(a.getBtnSearch());
	
	click(a.getRadioButton());
	 
	click(a.getBtnContinue());
	
	sendKeys(a.getTxtFirstName(), "Kowsi");
	
	sendKeys(a.getTxtLasttName(), "priya");
	
	sendKeys(a.getAddress(), "Mukudu salai, Madukkur");
	
	sendKeys(a.getCraditCardNo(), "1234567891654123");
	
	dropDown(a.getCraditCardType(), 2);
	
	dropDown(a.getExpiryDate(), 8);
	
	dropDown(a.getSelectType(), 14);
	
	sendKeys(a.getCvvNumber(), "123");
	
	click(a.getBtnBookNow());
	
	String attribute = getAttribute(a.getOrderNo());
	System.out.println(attribute);
}
}
