package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDeal {
    public static void main(String[] args) {
        try (Workbook workbook = new XSSFWorkbook(new FileInputStream("E:\\www\\product\\a\\product-import-template.xlsx"))) {
            // 获取工作簿
            Sheet sheet = workbook.getSheetAt(0);

            for(int i = 1 ; i <= sheet.getLastRowNum();i++) {
                Row row = sheet.getRow(i);

                // 按照下标获取当前行的单元格
                Cell cell0 = row.getCell(0); // UUID
                Cell cell1 = row.getCell(1); // Math
                Cell cell2 = row.getCell(2); // 日期

              //  System.out.println("UUID值：" + cell0.getStringCellValue());
              //  System.out.println("Math随机值：" + cell1.getNumericCellValue());
              //  System.out.println("当前时间：" + cell2.getNumericCellValue());
                System.out.println("Math随机值：" + cell1.getStringCellValue());
                System.out.println("当前时间：" + cell2.getStringCellValue());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
