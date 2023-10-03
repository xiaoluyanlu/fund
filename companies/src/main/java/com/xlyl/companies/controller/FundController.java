package com.xlyl.companies.controller;

import com.xlyl.common.req.PageReq;
import com.xlyl.common.resp.CommonResp;
import com.xlyl.common.resp.PageResp;
import com.xlyl.companies.resp.FundResp;
import com.xlyl.companies.service.FundService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@RestController
public class FundController {

    @Autowired
    private FundService fundService;

    /**
     * 分页查询基金列表
     * pageNum 页数 必填
     * pageSize  每页条数 必填
     * sortField 排序字段 必填 默认按照单位净值顺序排序
     * sortDirection 排序方向 升序还是降序 必填
     *
     * @return
     */
    @GetMapping("/fund")
    public CommonResp<PageResp<FundResp>> getFund(@Valid PageReq req) {
        return new CommonResp<>((PageResp<FundResp>) fundService.selPageFund(req));
    }

    /**
     * 定时生成基金信息
     */
    @GetMapping("/gen-fund")
    public void genFund() {
        fundService.genFund();
    }


}
