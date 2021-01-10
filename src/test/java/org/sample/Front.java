package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Front extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//input[@id=\"twotabsearchtextbox\"]")
	private WebElement btnSearchh;
	@FindBy (xpath="(//input[@type=\"submit\"])[1]")
	private WebElement btnSubmit;
	public WebElement getBtnSearchh() {
		return btnSearchh;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
}
