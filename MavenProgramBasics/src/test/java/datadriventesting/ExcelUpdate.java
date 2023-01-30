package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUpdate {
	
    @Test
	public void updateSheetDetails() throws IOException {
    //create instance of FileInputStream class  and pass the required excel file location to its constructor
    FileInputStream fis = new FileInputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\src\\test\\resources\\MyExcel\\TestData2.XLSX");
    //create an instance of required workbook class and pass FileInputStream instance to its constructor
    Workbook workbook = new XSSFWorkbook(fis);
    //TODO: create new sheet
    //TODO: create multiple rows(3)
    //TODO: create 3 cell in each row
    //TODO: add different type of values
    
    //create new sheet 
     Sheet sheet = workbook.createSheet("Testing");
     System.out.println("Testing sheet created");
     
     for(int i=0 ; i<3 ; i++) {
      	 Row row = sheet.createRow(i);
      	 
      	 for(int j=0 ; j<3 ; j++) {
    	Cell cell =	row.createCell(j); 
    		 cell.setCellValue("1");
    		 cell.setCellValue("Custormer");
    		 cell.setCellValue("emailId");
    	 }
     }
     
     //to store the update data find the location to save the file
     FileOutputStream fos = new  FileOutputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\src\\test\\resources\\MyExcel\\TestData2.XLSX");
      //Write the content in to the required file
     workbook.write(fos);
     //close the connection
     fos.close();
     System.out.println("File updated...");
     	
    }
    
    @Test
   	public void updateCellDetails() throws IOException {
       //create instance of FileInputStream class  and pass the required excel file location to its constructor
       FileInputStream fis = new FileInputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\src\\test\\resources\\MyExcel\\TestData2.XLSX");
       //create an instance of required workbook class and pass FileInputStream instance to its constructor
       Workbook workbook = new XSSFWorkbook(fis);
       //get the required sheet from excel
       Sheet sheet = workbook.getSheet("Sheet1");
       //get specific row from the sheet
       Row row = sheet.getRow(1);
       //create cell to update data
        Cell cell = row.createCell(3);
        cell.setCellValue("failed");
        
        //to store the update data find the location to save the file
        FileOutputStream fos = new  FileOutputStream("F:\\Accleration\\PROGRAMS\\Eclipse\\MavenProgramBasics\\src\\test\\resources\\MyExcel\\TestData2.XLSX");
         //Write the content in to the required file
        workbook.write(fos);
        //close the connection
        fos.close();
        System.out.println("File updated...");
        

    }
}