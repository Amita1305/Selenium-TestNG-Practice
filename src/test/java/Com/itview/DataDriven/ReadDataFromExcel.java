package Com.itview.DataDriven;

import java.io.FileInputStream;
import java.util.zip.DataFormatException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadDataFromExcel 
{

	public static void main(String[] args) throws Exception
	{
		//DataFormatException df=new DataFormatException();
		
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		String excelFilePath=projectPath+"\\src\\test\\java\\TestData\\FDCal.xlsx";
		FileInputStream fi=new FileInputStream(excelFilePath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sht=wb.getSheetAt(0);
		XSSFRow row=sht.getRow(1);
		XSSFCell cell=row.getCell(2);
		int rowCount=sht.getLastRowNum();
		System.out.println(rowCount);
		

	}

}
