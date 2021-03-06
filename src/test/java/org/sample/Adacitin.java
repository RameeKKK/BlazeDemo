package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adacitin extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		getDriver();
		Login login=new Login();
		login.getUrl("https://adactinhotelapp.com/");
		File file=new File("C:\\Users\\RAMI\\eclipse-workspace\\SampleMaven\\exc\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("data");
		Row row = sheet.getRow(1);
		WebElement txtUserName=login.getTxtUserName();
		login.type(txtUserName, String.valueOf(row.getCell(0)));
		WebElement txtPassword=login.getTxtPassword();
		login.type(txtPassword, String.valueOf(row.getCell(1)));
		WebElement btnLogin=login.getBtnLogin();
		login.btnClick(btnLogin);
		SearchHotel search=new SearchHotel();
		WebElement dropLocations=search.getLocation();
		long l=(long) row.getCell(2).getNumericCellValue();
		search.select(dropLocations,(long) row.getCell(2).getNumericCellValue());
		WebElement dropHotels=search.getHotels();
		search.select(dropHotels, (long) row.getCell(3).getNumericCellValue());
		WebElement dropRoomType=search.getRoomType();
		search.select(dropRoomType, (long) row.getCell(4).getNumericCellValue());
		WebElement dropNoOfRoom=search.getNoOfRooms();
		search.select(dropNoOfRoom, (long) row.getCell(5).getNumericCellValue());
		WebElement txtCheckIn=search.getCheckIn();
		search.type(txtCheckIn, String.valueOf(row.getCell(6)));
		WebElement txtCheckOut=search.getCheckOut();
		search.type(txtCheckOut, String.valueOf(row.getCell(7)));
		WebElement dropAdultPerRoom=search.getAdultPerRoom();
		search.select(dropAdultPerRoom, (long) row.getCell(8).getNumericCellValue());
		WebElement dropChildperRoom=search.getChildPerRoom();
		search.select(dropChildperRoom,(long) row.getCell(9).getNumericCellValue());
		WebElement btnSearch=search.getSearch();
		search.btnClick(btnSearch);
		SelectHotel selectHotel=new SelectHotel();
		WebElement btnSeach=selectHotel.getSearch();
		selectHotel.btnClick(btnSeach);
		WebElement btnNext=selectHotel.getNext();
		selectHotel.btnClick(btnNext);
		BookHotel bookHotel=new BookHotel();
		WebElement txtFirstName=bookHotel.getFirstName();
		bookHotel.type(txtFirstName,String.valueOf(row.getCell(10)));
		WebElement txtLastName=bookHotel.getLastName();
		bookHotel.type(txtLastName,String.valueOf(row.getCell(11)));
		WebElement txtAddress=bookHotel.getAddress();
		bookHotel.type(txtAddress, String.valueOf(row.getCell(12)));
		WebElement txtCreditCardNo=bookHotel.getCreditCardNo();
		bookHotel.type(txtCreditCardNo,String.valueOf(row.getCell(13)));
		WebElement dropCreditCardType=bookHotel.getCreditCardType();
		bookHotel.select(dropCreditCardType, (long) row.getCell(14).getNumericCellValue());
		WebElement dropExpirymonth=bookHotel.getExpiryDate();
		bookHotel.selectByText(dropExpirymonth,String.valueOf(row.getCell(15)));
		WebElement dropExpiryYear=bookHotel.getExpiryYear();
		bookHotel.select(dropExpiryYear, (long) row.getCell(16).getNumericCellValue());
		WebElement txtCVV=bookHotel.getcVV();
		bookHotel.type(txtCVV,String.valueOf(row.getCell(17)));
		WebElement btnBookNow=bookHotel.getBookNow();
		bookHotel.btnClick(btnBookNow);
		Thread.sleep(5000);
		OrderId orderId=new OrderId();
		WebElement txtOrderId=orderId.getOrderId();
		String s=orderId.getValue(txtOrderId);
		Cell createCell = row.createCell(18);
		createCell.setCellValue(s);
		System.out.println(s);
		FileOutputStream output=new FileOutputStream(file);
		workbook.write(output);
		System.out.println("done");
		orderId.close();
		
	}
}
