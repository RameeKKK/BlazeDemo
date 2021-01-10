package org.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automate extends BaseClass{
@BeforeClass
public static void beforeClass() {
getDriver();
}
@Before
public void before() {
getUrl("https://www.amazon.in/");
}
@Test
public void main() {
Front f=new Front();
WebElement btnSearchh = f.getBtnSearchh();
f.btnClick(btnSearchh);
f.type(btnSearchh, "iphone mobile");
WebElement btnSubmit = f.getBtnSubmit();
f.btnClick(btnSubmit);
List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
List<WebElement> prize = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
List<String>li=new ArrayList<String>();
Set<String>si=new HashSet<String>();
for (int i = 0; i <elements.size(); i++) {
	WebElement element = elements.get(i);
	WebElement prizeElement=prize.get(i);
	String text = element.getText();
	String text2 = prizeElement.getText();
	String text3=text2.replace(",", "");
	int in=Integer.parseInt(text3);
	if (in>=50000) {
		System.out.println(text+"  "+text3);
	}
	li.add(text);
	si.add(text);
	

}
int i=li.size()-si.size();
if (i==0) {
	System.out.println("There is no duplicates");// print duplicate or present or not

}
else 
{	li.removeAll(si);
	System.out.println("there is no duplicate");
	System.out.println(li);
}
}
	
}





