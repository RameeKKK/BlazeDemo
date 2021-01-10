package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//select[@name=\"fromPort\"]")
	private WebElement from;
	@FindBy (xpath="//select[@name=\"toPort\"]")
	private WebElement to;
	@FindBy (xpath="//input[@type=\"submit\"]")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	
}
