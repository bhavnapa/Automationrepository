package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.implementation.bytecode.Throw;

public class WriteExcelData {
	public static void main(String[] args) { Throw EncryptedDocumentException, IoException ;
	{
		  FileInputStream  fis  = FileInputStream("./data/TestData.xlsx");
		  Workbook wb  = WorkbookFactory.create(fis);
        Sheet	sheet  =wb.getSheet("IPL");
        Row	row =sheet.getRow(8);
        Cell      cell = row.getCell(0);
        cell.setCellValue("SRH");
        FileOutputStream fos  = new FileOutputStream("./data/TestData.xlsx");
        wb.write(fos);

   }
  }
 }