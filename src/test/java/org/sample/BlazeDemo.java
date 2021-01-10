package org.sample;

import java.io.IOException;
import java.util.List;

import org.apache.hc.client5.http.classic.ExecChain;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlazeDemo extends BaseClass {
@BeforeClass
public static void before() {
getDriver();
}
@Before
public void befor() {
getUrl("https://blazedemo.com/");
}
@Test
public void maint() throws IOException, InterruptedException {
Choose c=new Choose();
WebElement from = c.getFrom();
c.select(from, 2);
WebElement to=c.getTo();
c.select(to, 2);
WebElement submit = c.getSubmit();
c.btnClick(submit);
Prize p=new Prize();
List<WebElement> elements = driver.findElements(By.xpath("//input[@name=\"price\"]"));
WebElement element = elements.get(0);
String string = element.getAttribute("value");
double a=Double.parseDouble(string);
for (int i = 0; i < elements.size(); i++) {
	WebElement webElement = elements.get(i);
	String text = webElement.getAttribute("value");
	double b=Double.parseDouble(text);
	if (b<a) {
		a=b;
	}
	
}
double d=a;
for (int i = 0; i < elements.size(); i++) {
	WebElement webElement = elements.get(i);
	String text = webElement.getAttribute("value");
	double t=Double.parseDouble(text);
	int i2=i+1;
	if (d==t) {
		WebElement findElement = driver.findElement(By.xpath("(//input[@value=\"Choose This Flight\"])["+i2+"]"));
		p.btnClick(findElement);
		UserData ud=new UserData();
		ExcelBase excel=new ExcelBase();
		WebElement firstName=ud.getFirstName();
		ud.type(firstName,"ramee");
		WebElement address=ud.getAddress();
		ud.type(address, excel.excelRead(1, 1));
		WebElement city = ud.getCity();
		ud.type(city, excel.excelRead(1, 2));
		WebElement state=ud.getState();
		ud.type(state, excel.excelRead(1, 3));
		WebElement zipCode = ud.getZipCode();
		ud.type(zipCode, excel.excelRead(1, 4));
		WebElement cardType = ud.getCardType();
		ud.select(cardType, 1);
		WebElement creditCardNumber = ud.getCreditCardNumber();
		ud.type(creditCardNumber, excel.excelRead(1,6));
		WebElement month = ud.getMonth();
		ud.type(month, excel.excelRead(1, 7));
		WebElement year = ud.getYear();
		ud.type(year, excel.excelRead(1, 8));
		WebElement name = ud.getName();
		ud.type(name, excel.excelRead(1, 9));
		WebElement submit2 = ud.getSubmit();
		ud.btnClick(submit2);
		BlazeDemoConfirmation confirm=new BlazeDemoConfirmation();
		WebElement tab = confirm.getTab();
		confirm.getText(tab);
	}
}
}
@AfterClass
public static void after() {
//	driver.close();
}
}
