package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getRowCount();

    }

    public static void getRowCount() {

        try {
            workbook = new XSSFWorkbook(projectPath + "/TestData/Excel_automation.xlsx");
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            sheet.getPhysicalNumberOfRows();
            System.out.println("No. of Rows :" + sheet.getPhysicalNumberOfRows());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
