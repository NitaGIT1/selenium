package excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsxFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\nita\\readfilenita2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalRows = sheet.getLastRowNum();
		
		System.out.println("Total Rows: " + totalRows);
		
		for (int i = 0; i <= totalRows; i++) {
			XSSFRow row = sheet.getRow(i);
			if (row != null) {
				int totalCells = row.getLastCellNum();
				for (int j = 0; j < totalCells; j++) {
					XSSFCell cell = row.getCell(j);
					if (cell != null) {
						System.out.print(cell.toString() + " ");

					}
				}
				System.out.println();
			}

		}
     } 
}
