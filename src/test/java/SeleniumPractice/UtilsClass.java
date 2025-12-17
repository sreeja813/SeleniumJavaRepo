package SeleniumPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilsClass {
    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    public static int GetRowCount(String xlfile,String xlsheet) throws IOException {
        fi= new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        int RowCount=ws.getLastRowNum();
        wb.close();
        fi.close();
        return RowCount;
    }

    public  static int GetCellCount(String xfile, String xlsheet, int RowCount) throws IOException {
        fi= new FileInputStream(xlsheet);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        row=ws.getRow(RowCount);
        int CellCount= row.getLastCellNum();
        wb.close();
        fi.close();
        return CellCount;
    }

    public static String getCellData(String xfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi= new FileInputStream(xlsheet);
        wb=new XSSFWorkbook(fi);
        ws=wb.getSheet(xlsheet);
        row=ws.getRow(rownum);
        cell = row.getCell(colnum);

        String data;
        try
        {
            data=cell.toString();
        } catch (Exception e)
        {
            data="";
        }
        wb.close();
        fi.close();
        return data;
    }

    public static void FillGreenColour(String xfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi=new FileInputStream(xlsheet);
        wb=new XSSFWorkbook(fi);
        ws= wb.getSheet(xlsheet);
        row= ws.getRow(rownum);
        cell= row.getCell(colnum);

        style=wb.createCellStyle();

        style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fo=new FileOutputStream(xfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }
    public static void FillRedColour(String xfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi=new FileInputStream(xlsheet);
        wb=new XSSFWorkbook(fi);
        ws= wb.getSheet(xlsheet);
        row= ws.getRow(rownum);
        cell= row.getCell(colnum);

        style=wb.createCellStyle();

        style.setFillBackgroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fo=new FileOutputStream(xfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }

}
