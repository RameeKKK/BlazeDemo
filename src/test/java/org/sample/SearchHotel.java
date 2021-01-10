package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	{PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//select[@id=\"location\"]")
	private WebElement location;
	@FindBy (xpath="//select[@id=\"hotels\"]")
	private WebElement hotels;
	@FindBy (xpath="//select[@id=\"room_type\"]")
	private WebElement roomType;
	@FindBy (xpath="//select[@id=\"room_nos\"]")
	private WebElement noOfRooms;
	@FindBy (xpath="//input[@id=\"datepick_in\"]")
	private WebElement checkIn;
	@FindBy (xpath="//input[@id=\"datepick_out\"]")
	private WebElement checkOut;
	@FindBy (xpath="//select[@id=\"adult_room\"]")
	private WebElement adultPerRoom;
	@FindBy (xpath="//select[@id=\"child_room\"]")
	private WebElement childPerRoom;
	@FindBy (xpath="//input[@id=\"Submit\"]")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
