package lib;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Poi3 {
    //header colspan 하는 방법
    public static String filePath = "C:\\poi_temp";
    public static String fileNm = "poi_making_file_test"+Math.random()+".xlsx";

    public static XSSFRow headerCellMerge(){

        return null;
    }

    public static void main(String[] args) {


        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFCellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        headerCellStyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        headerCellStyle.setBorderRight(XSSFCellStyle.BORDER_THIN);
        headerCellStyle.setBorderTop(XSSFCellStyle.BORDER_THIN);
        headerCellStyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);

        XSSFSheet sheet = workbook.createSheet("설문결과");
        String[] header={
                "EMPNO"
                ,"ENAME"
                ,"JOB"
                ,"MGR"
                ,"HIREDATE"
                ,"SAL"
                ,"COMM"
        };


        //header
        XSSFRow headerRow = null;
        int startMergeCellPoint = 3;
        String mergeCellTile = "회원정보";
        for(int c=0; c<header.length; c++){

            if(c == 0) headerRow = sheet.createRow(0);
            if(c < startMergeCellPoint ){

                int startRow = headerRow.getRowNum();
                Cell headerCell = headerRow.createCell(c);
                headerCell.setCellValue(header[c]);
                sheet.addMergedRegion(new CellRangeAddress(startRow,1,c,c));

            }else if(c == startMergeCellPoint){
                Cell mergeCell = headerRow.createCell(c);
                mergeCell.setCellValue(mergeCellTile);
                mergeCell.setCellStyle(headerCellStyle);
                headerRow = sheet.createRow(1);
                Cell newCell = headerRow.createCell(c);
                newCell.setCellValue(header[c]);

            }else{
                Cell newCell = headerRow.createCell(c);
                newCell.setCellValue(header[c]);
                sheet.addMergedRegion(new CellRangeAddress(0,0,startMergeCellPoint,header.length-1));

            }
        }



        try {
            FileOutputStream out = new FileOutputStream(new File(filePath, fileNm));
            workbook.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


