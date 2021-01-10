package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoConfirmation extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//table[@class=\"table\"]")
	private WebElement tab;
	public WebElement getTab() {
		return tab;
	}
	
}
