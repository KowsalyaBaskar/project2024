package org.sample;
import java.util.List;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProjectSample extends BaseClass {
	public ProjectSample()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement txtSearch;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//span[@class='BUOuZu']")
	private WebElement result;
	
	@FindBy(xpath="//div[@class='KzDlHZ']")
	private List<WebElement> phoneName;
	
	@FindBy(xpath="//div[@class='Nx9bqj _4b5DiR']")
	private List<WebElement> phonePrice;
	
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getResult() {
		return result;
	}
	public List<WebElement> getPhoneName() {
		return phoneName;
	}
	public List<WebElement> getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrice(List<WebElement> phonePrice) {
		this.phonePrice = phonePrice;
	}
}

