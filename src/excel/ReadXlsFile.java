package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXlsFile {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\nita\\readfilenita1.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		System.out.println("Total Rows: " + totalRows);
		for (int i = 0; i <= totalRows; i++) {
			HSSFRow row = sheet.getRow(i);
			if (row != null) {
				int totalCells = row.getLastCellNum();
				for (int j = 0; j < totalCells; j++) {
					HSSFCell cell = row.getCell(j);
					if (cell != null) {
						System.out.print(cell.toString() + " ");

					}
				}
				System.out.println();
			}

		}

	}
}
