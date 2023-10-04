package com.xlyl.gen.controller;

import com.xlyl.gen.service.GenXlsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@RestController
public class GenController {

    @Autowired
    private GenXlsxService genXlsxService;
    @GetMapping("/gen")
    public void genFundNetVal() throws Exception {
        genXlsxService.genFundNetVal();
    }

}
