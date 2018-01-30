package com.slokam.common.utils.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.slokam.common.dto.ProductDTO;

public class ExcelManager {

	Workbook workbook = null;
	Sheet sheet = null;

	public ExcelManager() {
		init("productdata.xls", "Sheet1");
	}

	public ExcelManager(String filePath) {
		init(filePath, "Sheet1");
	}

	public ExcelManager(String filePath, String sheetName) {
		init(filePath, sheetName);
	}

	private void init(String filePath, String sheetName) {

		File file = new File(filePath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			if(filePath.contains(".xlsx")) {
				workbook = new XSSFWorkbook(fis);
			}else {
				workbook = new HSSFWorkbook(fis);
			}
			sheet = workbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int totalRows() {
		return sheet.getPhysicalNumberOfRows();
	}

	public void readData() {

		Row row = sheet.getRow(1);
		Cell cell = null;

		for (int i = 0; i < 5; i++) {
			cell = row.getCell(i);
			String value = getData(cell);
			System.out.println(value);
		}

	}

	public ProductDTO getProductDTO(int rowNumber) {
		ProductDTO dto = new ProductDTO();

		Row row = sheet.getRow(rowNumber);

		dto.setProductName(getData(row.getCell(1)));
		dto.setDescription(getData(row.getCell(2)));
		dto.setMetaTagTitle(getData(row.getCell(3)));
		dto.setModel(getData(row.getCell(4)));
		System.out.println(dto);
		return dto;
	}

	private String getData(Cell cell) {
		String value = "";
		CellType cellT = cell.getCellTypeEnum();
		switch (cellT) {
		case NUMERIC:
			int db = (int) cell.getNumericCellValue();
			value = String.valueOf(db);
			break;
		case STRING:
			value = cell.getStringCellValue();
			break;
		case BOOLEAN:
			boolean b = cell.getBooleanCellValue();
			value = String.valueOf(b);
			break;
		case BLANK:
			value = "";
			break;
		case FORMULA:
			value = cell.getCellFormula();
			break;
		default:
			value = "";
			break;
		}

		return value;
	}

	public static void main(String[] args) {
		ExcelManager ex = new ExcelManager();
		System.out.println(ex.getProductDTO(3));
	}

	
}
