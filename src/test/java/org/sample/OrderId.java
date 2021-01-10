package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderId extends BaseClass {
	{PageFactory.initElements(driver, this);
	
	}
    @FindBy (xpath="//input[@id=\"order_no\"]")
    private WebElement orderId;
	public WebElement getOrderId() {
		return orderId;
	}
    
	
	
	}
