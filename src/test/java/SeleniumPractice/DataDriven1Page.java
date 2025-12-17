package SeleniumPractice;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven1Page {
    WebDriver driver;
    DataDriven1Page(WebDriver driver){
        this.driver=driver;
    }

    void Datadriven1() throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Amount");
        int total_row_count = sheet.getLastRowNum();
        int total_col_count = sheet.getRow(1).getLastCellNum();

        System.out.println("total number of rows" +total_row_count);
        System.out.println("total number of columns" +total_col_count);

        for(int r=0;r<=total_row_count;r++){
            XSSFRow currentRow = sheet.getRow(r);
            for(int c=0;c<total_col_count;c++){
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString() +"\t");
            }
            System.out.println();
        }
        file.close();
        workbook.close();







    }
}
