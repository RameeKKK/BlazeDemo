package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserData extends BaseClass {
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id=\"inputName\"]")
	private WebElement firstName;
	@FindBy (id="address")
	private WebElement address;
	@FindBy (id="city")
	private WebElement city;
	@FindBy (id="state")
	private WebElement state;
	@FindBy (id="zipCode")
	private WebElement zipCode;
	@FindBy (id="cardType")
	private WebElement cardType;
	@FindBy (id="creditCardNumber")
	private WebElement creditCardNumber;
	@FindBy (id="creditCardMonth")
	private WebElement month;
	@FindBy (id="creditCardYear")
	private WebElement year;
	@FindBy (id="nameOnCard")
	private WebElement name;
	@FindBy (xpath="//input[@type=\"submit\"]")
	private WebElement submit;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipCode() {
		return zipCode;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
