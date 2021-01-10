package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.management.StringValueExp;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hl {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\RAMI\\eclipse-workspace\\SampleMaven\\exc\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(f);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("data");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(3);
	java.util.Date date = cell.getDateCellValue();
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM");
	String format = dateformat.format(date);
	System.out.println(format);
}
}