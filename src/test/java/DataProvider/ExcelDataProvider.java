package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataProvider()
	{
		try {
			File src = new File("D:\\Workspace\\framework.7oct.etlhive\\ApplicationTestData\\AppData.xlsx");
			FileInputStream fi = new FileInputStream(src);
			wb = new XSSFWorkbook(fi);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	
		}
	
	public String getData(int sheetno, int row, int col)
	{
		sheet = wb.getSheetAt(sheetno);
		String dataexcl = sheet.getRow(row).getCell(col).getStringCellValue();
		return dataexcl;
	}

	public String getData(String sheetname, int row, int col)
	{
		sheet = wb.getSheet(sheetname);
		String dataexc2 = sheet.getRow(row).getCell(col).getStringCellValue();
		return dataexc2;
	}

	
}
