package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class ExcelBase extends BaseClass {
public String excelRead(int ro,int ce) throws IOException {
File f=new File("C:\\Users\\RAMI\\eclipse-workspace\\SampleMaven\\exc\\Book1.xlsx");
FileInputStream fileInput=new FileInputStream(f);
Workbook workbook=new XSSFWorkbook(fileInput);
Sheet sheet = workbook.getSheet("data");
Row row = sheet.getRow(ro);
Cell cell = row.getCell(ce);
String value="";
int cellType = cell.getCellType();
if (cellType==1) {
	value = cell.getStringCellValue();
}
else {
if (DateUtil.isCellDateFormatted(cell)) {
	java.util.Date date = cell.getDateCellValue();
	SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	value = format.format(date);
}
else {
	double numeric = cell.getNumericCellValue();
	long l=(long) numeric;
	value=String.valueOf(l);
}
}
return value;
}
}
