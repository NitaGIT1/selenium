package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteXlsFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\nita\\readfilenita1.xls");
	    FileInputStream inputStream = new FileInputStream(file);
	    HSSFWorkbook wb = new HSSFWorkbook(inputStream);
	    HSSFSheet sheet = wb.getSheet("sheet1");
	    HSSFRow row2 = sheet.createRow(7);
	    row2.createCell(0).setCellValue("Krishna");
	    row2.createCell(1).setCellValue("Dev");
	    row2.createCell(2).setCellValue("kd@gmail.com");
	    row2.createCell(3).setCellValue("Male");
	    row2.createCell(4).setCellValue("8899556677");
	    row2.createCell(5).setCellValue("Heaven");
	    FileOutputStream outputStream = new FileOutputStream("C:\\nita\\write.xls");
	    wb.write(outputStream);
	    wb.close();
	    
	    
	    
	    
	}

}
