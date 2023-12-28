package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasklink;
    @FindBy(xpath="//div[.='Reports']")
    private WebElement reportlink;
    @FindBy(xpath="//div[.='Users']")
    private WebElement userslink;
    @FindBy(id="logoutLink")
    private WebElement logoutbtn;

    //initialization
  public HomePage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  
  }
  //utiization

public WebElement getTasklink() {
	return tasklink;
}

public WebElement getReportlink() {
	return reportlink;
}

public WebElement getUserslink() {
	return userslink;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}
}
	

