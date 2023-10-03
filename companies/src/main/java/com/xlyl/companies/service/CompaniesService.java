package com.xlyl.companies.service;

import com.xlyl.companies.req.CompaniesReq;
import com.xlyl.companies.resp.CompaniesResp;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public interface CompaniesService {

    /**
     * 查询出所有的热门企业 按照时间排序 最近创建的排在前面
     *
     * @return
     */
    List<CompaniesResp> getAllHotCompanies();

    /**
     * 新增或者修改企业
     */
    void addOrUpdCompanies(CompaniesReq req);

    /**
     * 查询指定企业
     *
     * @return
     */
    CompaniesResp getCompaniesById(Long comId);

    /**
     * 根据公司id删除指定企业
     *
     * @return
     */
    void delCompaniesById(Long comId);
}
