package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement btnSignIn;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	private WebElement btnRegister;
	
	@FindBy(name="email")
	private WebElement txtEmail;
	
	@FindBy(name="phone")
	private WebElement phoneNumber;
	
	@FindBy(name="register")
	private WebElement register;

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getRegister() {
		return register;
	}
	
}
