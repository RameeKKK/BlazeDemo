package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	{PageFactory.initElements(driver, this);
	
	}
	@FindBy (xpath="//input[@id=\"first_name\"]")
	private WebElement firstName;
	@FindBy (xpath="//input[@id=\"last_name\"]")
	private WebElement lastName;
	@FindBy (xpath="//textarea[@id=\"address\"]")
	private WebElement address;
	@FindBy (xpath="//input[@id=\"cc_num\"]")
	private WebElement creditCardNo;
	@FindBy (xpath="//select[@id=\"cc_type\"]")
	private WebElement creditCardType;
	@FindBy (xpath="//select[@id=\"cc_exp_month\"]")
	private WebElement expiryDate;
	@FindBy (xpath="//select[@id=\"cc_exp_year\"]")
	private WebElement expiryYear;
	@FindBy (xpath="//input[@id=\"cc_cvv\"]")
	private WebElement cVV;
	@FindBy (xpath="//input[@id=\"book_now\"]")
	private WebElement bookNow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getcVV() {
		return cVV;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
}
