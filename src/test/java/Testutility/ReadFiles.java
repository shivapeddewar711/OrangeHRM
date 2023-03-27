package Testutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReadFiles {
static String data;
public static String fetchExcelsheetdata(int row,int cell) throws EncryptedDocumentException, IOException
{
	String path="src\\test\\resources\\Files\\Book1.xlsx";
	FileInputStream file=new FileInputStream(path);

	Cell c=WorkbookFactory.create(file).getSheet("Login").getRow(row).getCell(cell);
    CellType type=c.getCellType();
	if(type==CellType.STRING)
	{
	 data=c.getStringCellValue();
	}
	else if(type==CellType.NUMERIC)
	{
		Double d=c.getNumericCellValue();
		data=Double.toString(d);
		data=Integer.toString(cell);
	}
	else if(type==CellType.BLANK)
	{
		System.out.println("You are trying to fetch empty cell");
	}
	return data;
}

}

