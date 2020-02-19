package SampleScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.google.common.collect.Table.Cell;

public class DataDriven_ReadSingleCell 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\praveenn\\Desktop\\LeavePlan.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("plan");
		Row r=sh.getRow(13);
		Cell c=r.getCell(1);
	}
}
