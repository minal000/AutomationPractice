package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	/**
	   * 1. Excel file location with file name --> FileInputStream
	   *       1.1 Workbook --> Define the excel type Workbook --> XSSFWorkbook
	   * 2. Sheet name  -->                           Sheet    --> XSSFSheet
	   * 3. Row         -->                           Row      --> XSSFRow
	   * 4. Column      -->                           Cell     --> XSSFCell
	 * @throws IOException 
	   */
	
  @Test
  public void sheetOperation() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\AppData\\TestData.XLSX");
	  
	//  XSSFWorkbook wb = new XSSFWorkbook(fis);   //homogeneous
	  	                 //or
	  	  Workbook workbook = new XSSFWorkbook(fis);  //heterogeneous instance
	  //after getting workbook you can perform any operation on sheet
	  	 int sheetct =  workbook.getNumberOfSheets();
	  	  System.out.println("sheet count is : "+sheetct);
	  //print sheet names
	  	  for( int i=0 ; i<sheetct ; i++) {
	  		  
//	  		 Sheet sheet = workbook.getSheetAt(i);
//	  		 String sheetName = sheet.getSheetName();
//	  		 System.out.println("Sheet name : "+sheetName);
	  		            //or
	  		 System.out.println("Sheet names : "+workbook.getSheetAt(i).getSheetName());
	  		 
	  	  }
	  	  
	  	  //if you have to perform any operation on specific row then use sheet object for that
	  	 Sheet sheet = workbook.getSheet("Sheet1");
	  	
  }
  
  @Test
  public void rowOps() throws IOException {
	  
	  //excel file location
	  FileInputStream fis = new FileInputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\AppData\\TestData.XLSX");
	  
	  //create instance of required workbook class based on excel type
	  Workbook workbook = new XSSFWorkbook(fis);
	  
	  //using workbook object get the required sheet
	  Sheet sheet = workbook.getSheet("Sheet1");
	  
	  //get the row count using sheet class object
	  int rowCt = sheet.getLastRowNum();
	  System.out.println("Row count in sheet1 : "+rowCt);
	  
      //get specific row from the sheet
	  Row row = sheet.getRow(0);
	    //System.out.println("Row 0: "+row);
	  
	  //get column count from row 0
	  int cellCountInRow0 = row.getLastCellNum();
	  System.out.println("Cell count in row-0 is : "+cellCountInRow0);
	  
	  //print row0 data	 
	  for(int i= 0 ; i<cellCountInRow0; i++) {
		  //get one by one cell from row 0
		  Cell cell = row.getCell(i);
		  String cellValue = cell.getStringCellValue();
		  System.out.println("Row-0 cell value column number :"+i+" :"+cellValue);
	  }
  }
  
      @Test
     public void readDifferentTypeOfDataFromExcel() throws IOException {
	  
	  //excel file location
	  FileInputStream fis = new FileInputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\AppData\\TestData.XLSX");
	  
	  //create instance of required workbook class based on excel type
	  Workbook workbook = new XSSFWorkbook(fis);
	  
	  //using workbook object get the required sheet
	  Sheet sheet = workbook.getSheet("Sheet1");
	  
	  //get the row count using sheet class object
	  int rowCt = sheet.getLastRowNum();
	  System.out.println("Row count in sheet1 : "+rowCt);
	  
	  //get specific row from the sheet
	  Row row = sheet.getRow(3);
	    
	  
	  //get column count from row 3
	  int cellCountInRow0 = row.getLastCellNum();
	  System.out.println("Cell count in row-3 is : "+cellCountInRow0);
	  
	  //print row0 data
	  for(int i= 0 ; i<cellCountInRow0; i++) {
		  //get one by one cell from row 3
		  Cell cell = row.getCell(i);
		  
		  //check cell type before reading its value
		  switch(cell.getCellType()) {
		  case Cell.CELL_TYPE_STRING:
			  System.out.println("Row-3 cell value column number : "+i+" : "+cell.getStringCellValue());
			  break;
			  
		  case Cell.CELL_TYPE_NUMERIC:
			  System.out.println("Row-3 cell value column number : "+i+" : "+cell.getNumericCellValue());
			  break;
			  
		  case Cell.CELL_TYPE_BOOLEAN:
			  System.out.println("Row-3 cell value column number : "+i+" :"+cell.getBooleanCellValue());
			  break;
			  
		  case  Cell.CELL_TYPE_BLANK:
			  System.out.println("Row-3 cell value column number : "+i+" :"+"----Empty Cell------");
			  break;
			  
			  default:
				  System.out.println("-----------Invalid cell value--------");
		  }
		  
		  
	  }
	  
//	  public int getSheetCount(String fileLocation) {
//		  
//	  }
//	  public int getRowCount(String fileLocation, String sheetName) {
//		  
//		
//	  }
//	  public int getCellCount(String fileLocation, String sheetName, int row) {
//		  
//	  }
//	  public String getCellValue(String fileLocation, String sheetName, int rowIndex, int cellIndex) {
//		  
//	  }
  }
}
