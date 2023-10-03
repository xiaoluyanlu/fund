package com.xlyl.batch.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */

@FeignClient(name = "companies", url = "http://127.0.0.1:8001")
public interface FundFeign {

    @GetMapping("/companies/gen-fund")
    public void genFund();

}
