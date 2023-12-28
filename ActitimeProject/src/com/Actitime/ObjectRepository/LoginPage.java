package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class LoginPage {
	//declaration
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwdbx;
    @FindBy(xpath="//div[.='Login ']")
	private WebElement lgnbtn;
    //initilization
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
   
    }
   //utilization
	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwdbx() {
		return pwdbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	   
}
