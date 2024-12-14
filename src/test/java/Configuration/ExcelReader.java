package Configuration;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        read();
    }


    public static void read() throws IOException {

        String path = "./UserData.xlsx";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        String userName = sheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(userName);

        int totalRows = sheet.getLastRowNum();
        int totalColumn = sheet.getRow(0).getLastCellNum();
        System.out.println(totalRows);
        System.out.println(totalColumn);

    }

}
