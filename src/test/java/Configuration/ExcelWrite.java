package Configuration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWrite {

    public static void main(String[] args) throws IOException {
        writeExcel();
    }

    public static void writeExcel() throws IOException {

        String path = "./UserData.xlsx";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int totalRow = sheet.getLastRowNum();
        int rowNo = totalRow+1;
        XSSFRow row = sheet.createRow(rowNo);
        row.createCell(0).setCellValue(300);
        row.createCell(1).setCellValue("Vetri");
        row.createCell(2).setCellValue("vetri123");

        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
    }

}
