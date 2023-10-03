package com.xlyl.gen.config;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.func.VoidFunc;
import com.xlyl.gen.service.GenXlsx;
import jakarta.annotation.Resource;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GenXlsxTest {
//    private static String path="E:\\workspace\\fund\\demo\\xlsx\\FUND_NET_VAL_008321.xlsx";
    private static String path="E:\\workspace\\fund\\demo\\xlsx\\FUND_NET_VAL.xlsx";
    @Resource
    GenXlsx genXlsx;
    @Test
    public void getWorkbook3_1() throws Exception {
        Workbook workbook2 = genXlsx.getWorkbook3(path);
        genXlsx.getCell(workbook2);
    }

    //测试时间
    @Test
    public void getTime(){
        System.out.println("new Date() = " + new Date());
//        System.out.println("DateUtil.offsetDay(new Date(),1) = " + DateUtil.offsetDay(new Date(), 365));
    }
}
