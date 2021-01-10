package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (id="username")
	private WebElement txtUserName;
	@FindBy (name="password")
	private WebElement txtPassword;
	@FindBy (xpath="//input[@id=\"login\"]")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
