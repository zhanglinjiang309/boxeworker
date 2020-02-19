package com.example.boxeworker.tool;

import com.example.boxeworker.pojo.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Component
public class ExcelUtil {

    @Async("asyncServiceExecutor")
    public void excelExport(String filePath,String[] title, List<Logger> cellList){
        // 创建表头
//        String[] title = {"id","name","sex"};
        //创建Excel工作薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        //创建一个工作表shheet
        Sheet sheet = workbook.createSheet();
        //创建第一行
        Row row = sheet.createRow(0);
        //单元格居中
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        Cell cell = null;
        // 插入第一行
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
        }
        // 追加数据

        for (int i = 0; i < cellList.size(); i++) {// 这里的int 起始是1 也就是第二行开始
            Row nexTrow = sheet.createRow(i+1);
            Cell cell2 = nexTrow.createCell(0);
            cell2.setCellValue(i+1);
            Logger loggerUtil = cellList.get(i);
                System.out.println(loggerUtil.toString() + "" + i);
                cell2 = nexTrow.createCell(1);
                cell2.setCellValue(loggerUtil.getUserid());
                cell2 = nexTrow.createCell(2);
                cell2.setCellValue(loggerUtil.getStartdate());
                cell2 = nexTrow.createCell(3);
                cell2.setCellValue(loggerUtil.getEnddate());
                cell2 = nexTrow.createCell(4);
                cell2.setCellValue(loggerUtil.getOperation());
//                cell2 = nexTrow.createCell(5);
//                cell2.setCellValue();

        }

        // 创建一个文件
//        File file = new File("e:/poi.xlsx");// 这里可以修改成高版本的
        File file = new File(filePath);// 这里可以修改成高版本的
        try {
            file.createNewFile();
            // 将内容存盘
            FileOutputStream stream = FileUtils.openOutputStream(file);
            workbook.write(stream);

            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
