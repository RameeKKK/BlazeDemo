package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static void getDriver() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAMI\\\\eclipse-workspace\\\\Selenium\\\\src\\\\Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void getUrl(String Url) {
	driver.get(Url);
	driver.manage().window().maximize();
	}
	public void type(WebElement element,String data) {
	element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
	element.click();
	}
	public void select(WebElement sElement,int i) {
	Select select=new Select(sElement);
	select.selectByIndex(i);
	
	}
	public void selectByText(WebElement sElement,String value) {
	Select select=new Select(sElement);
	select.selectByVisibleText(value);
	}
	public String getValue(WebElement sElement) {
	String order=sElement.getAttribute("Value");
	return order;
	}
	public void alert() {
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	}
	public void getText(WebElement sElement) {
	String name=sElement.getText();
	System.out.println(name);
	}
	
	public void close() {
	driver.close();
	}
}
