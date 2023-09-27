package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	public static void main(String[] args) {
    FileInputStream	fis	=FileInPutStream("./data/TestData.xlsx");
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sheet = wb.getSheet("IPL");
    Row row =sheet.getRow(8);
    Cell cell  =row.getCell(0);
    cell.setCellValue("kkk");
    
    FileOutputStream fos = FileOutputStream("./data/TestData.xlsx");
    wb.write(fos);
    
	}
}
	
          
        	
		   
	
		
	
	

