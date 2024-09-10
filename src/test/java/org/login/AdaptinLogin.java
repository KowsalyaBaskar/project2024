package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdaptinLogin extends BaseClass{

	public AdaptinLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(id="location")
	private WebElement locationSelect;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLasttName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement craditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement craditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectType;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocation() {
		return locationSelect;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLasttName() {
		return txtLasttName;
	}

	public WebElement getAddress() {
		return address;
	}


	public WebElement getCraditCardNo() {
		return craditCardNo;
	}

	public WebElement getCraditCardType() {
		return craditCardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}


	public WebElement getSelectType() {
		return selectType;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}


	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
}
