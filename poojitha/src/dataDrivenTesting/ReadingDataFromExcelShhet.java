package dataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelShhet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file = new File("./testdata/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
//		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(1);
//		Row row = sheet.getRow(3);
//		Cell cell = row.getCell(1);
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String data = cell.toString();
		String data= workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
		System.out.println(data);
	}
}
