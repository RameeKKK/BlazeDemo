package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlight extends BaseClass {
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//input[@value=\"Choose This Flight\"]")
	private WebElement flight;
	public WebElement getFlight() {
		return flight;
	}
	
}
