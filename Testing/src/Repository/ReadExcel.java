package Repository;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	
	public static void methodReadExcelSheet(String fileSource, int excelSheetNum){
		try{
			String src=fileSource;
			int sheetnum=excelSheetNum;
			//String src= "D:\\educational\\Selenium Python software n tools\\Testdata.xlsx";
			FileInputStream fis= new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh1=wb.getSheetAt(sheetnum);
			int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum()+1;
			System.out.println("Row Count: "+rowCount);
			for (int i = 0; i < rowCount+1; i++) {
				Row row = sh1.getRow(i);
				for (int j = 0; j <row.getLastCellNum() ; j++) {
					System.out.print(row.getCell(j).getStringCellValue()+"||");
					
				}
				System.out.println();
			}
			wb.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
