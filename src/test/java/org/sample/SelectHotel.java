package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//input[@id=\"radiobutton_0\"]")
	private WebElement search;
	@FindBy (xpath="//input[@id=\"continue\"]")
	private WebElement next;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getNext() {
		return next;
	}
	
}
