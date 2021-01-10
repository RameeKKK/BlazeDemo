package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prize extends	 BaseClass {
	{PageFactory.initElements(driver, this);
	
	}
	@FindBy (xpath="//input[@name=\"price\"]")
	private WebElement prize;
	public WebElement getPrize() {
		return prize;
	}
	
}
