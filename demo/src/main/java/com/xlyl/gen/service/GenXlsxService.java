package com.xlyl.gen.service;

import java.math.BigDecimal;

import cn.hutool.core.date.DateUtil;
import com.xlyl.common.util.SnowUtil;
import com.xlyl.gen.domain.FundNetVal;

import com.xlyl.gen.mapper.FundNetValMapper;
import jakarta.annotation.Resource;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@Service
public class GenXlsxService {


//        private static String path="E:\\workspace\\sl-express\\fund\\demo\\xlsx\\FUND_NET_VAL.xlsx";//绝对路径
    private static String path="demo/xlsx/FUND_NET_VAL.xlsx";//相对路径(同模块)


    @Resource
    FundNetValMapper fundNetValMapper;

    public Workbook getWorkbook(String path) throws IOException {
        FileInputStream inputStream = FileUtils.openInputStream(new File(path));
        return WorkbookFactory.create(inputStream);
    }

    public void getCell(Workbook workbook) throws Exception {
        Sheet sheet;
        Row row;
        Cell cell;
        // sheet页3页时则NumberOfSheets=3，下标索引取值0-2
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheet = workbook.getSheetAt(i);
            // 3行数据时,FirstRowNum=0,LastRowNum=2
            for (int j = sheet.getFirstRowNum() + 1; j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);

                //循环添加到数据库
                FundNetVal fund = new FundNetVal();

                // 2列时,FirstCellNum=0,LastCellNum=2
                for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                    cell = row.getCell(k);
//                    System.out.print(cell + "  ");
                    switch (k) {
                        case 0 -> fund.setFundCode(cell.getStringCellValue());
                        case 1 -> fund.setFundShortName(cell.getStringCellValue());
                        case 2 -> fund.setEndDate(DateUtil.parse(cell.getStringCellValue(), "yyyy-MM-dd"));
                        case 3 -> {
                            cell.setCellType(CellType.STRING);
                            fund.setUnitNetVal(new BigDecimal(cell.getStringCellValue()));
                        }
                    }
                }
                fund.setId(SnowUtil.getSnowflakeNextId());
                fundNetValMapper.insertSelective(fund);
            }
        }
        workbook.close();
    }

    /**
     * 生成基础数据
     */
    public void genFundNetVal() throws Exception {
        Workbook workbook = getWorkbook(path);
        getCell(workbook);
    }
}
