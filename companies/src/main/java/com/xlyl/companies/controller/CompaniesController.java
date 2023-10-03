package com.xlyl.companies.controller;

import com.xlyl.common.resp.CommonResp;
import com.xlyl.companies.req.CompaniesReq;
import com.xlyl.companies.resp.CompaniesResp;
import com.xlyl.companies.service.CompaniesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@RestController
public class CompaniesController {

    @Autowired
    private CompaniesService companiesService;

    /**
     * 查询出所有的热门企业 按照时间排序 最近创建的排在前面
     *
     * @return
     */
    @GetMapping("/")
    public CommonResp<List<CompaniesResp>> getAllHotCompanies() {
        List<CompaniesResp> companiesRespList = companiesService.getAllHotCompanies();
        return new CommonResp<>(companiesRespList);
    }

    /**
     * 新增企业
     *
     * @return
     */
    @PostMapping("/add")
    public CommonResp addCompanies(@Valid @RequestBody CompaniesReq req) {
        companiesService.addOrUpdCompanies(req);
        CommonResp<Object> commonResp = new CommonResp<>();
        commonResp.setMessage("添加公司成功");
        return commonResp;
    }

    /**
     * 根据公司id查询指定企业
     *
     * @return
     */
    @GetMapping("/{comId}")
    public CommonResp<CompaniesResp> getCompaniesById(@PathVariable Long comId) {
        return new CommonResp<>(companiesService.getCompaniesById(comId));
    }

    /**
     * 根据公司id更新指定企业
     *
     * @return
     */
    @PutMapping("/upd")
    public CommonResp updCompaniesById(@Valid @RequestBody CompaniesReq req) {
        companiesService.addOrUpdCompanies(req);
        CommonResp<Object> commonResp = new CommonResp<>();
        commonResp.setMessage("更新公司成功");
        return commonResp;
    }

    /**
     * 根据公司id删除指定企业
     *
     * @return
     */
    @DeleteMapping("/{comId}")
    public CommonResp delCompaniesById(@PathVariable Long comId) {
        companiesService.delCompaniesById(comId);
        CommonResp<Object> commonResp = new CommonResp<>();
        commonResp.setMessage("删除成功");
        return commonResp;
    }


}
