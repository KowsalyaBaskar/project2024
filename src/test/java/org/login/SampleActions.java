package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleActions extends BaseClass{

	public SampleActions()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[text()='Women']")
	private WebElement btnWomen;
	
	@FindBy(xpath="//a[@title='Topwear']")
	private WebElement btnTopWear;
	
	@FindBy(name="q")
	private WebElement txtSearch;
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnWomen() {
		return btnWomen;
	}

	public WebElement getBtnTopWear() {
		return btnTopWear;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	
}
