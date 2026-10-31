package ddt_ext;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.common.collect.Table.Cell;

public class GetDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	//create the java rep object of the physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/testscriptdata.xlsx");
		 
    //get the access of workbook
		Workbook wb = WorkbookFactory.create(fis);
		
    // get the access of sheet
		wb.getSheet("org");
		
	// get the access of row
	    Row row = sh.getRow(1);
	    
	// get the access of cell
	    Cell cell row.getcell(0;)
	
	// get the value of cell
	    cell.getStringCellValue();
	    System.out.println(1);
	    
	// don't forget to close
	    wb.close();
	    
	    
	    
		
	}

}
