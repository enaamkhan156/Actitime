package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddNewBtn;
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement NewCust;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
    private WebElement CustName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustDescp;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement CreateButn;
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement CancelBtn;
	//initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}
	public WebElement getNewCust() {
		return NewCust;
	}
	public WebElement getCustName() {
		return CustName;
	}
	public WebElement getCustDescp() {
		return CustDescp;
	}
	public WebElement getCreateButn() {
		return CreateButn;
	}
	public WebElement getCancelBtn() {
		return CancelBtn;
	}
	
    
}
