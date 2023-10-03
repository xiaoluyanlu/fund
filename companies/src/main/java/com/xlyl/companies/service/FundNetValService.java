package com.xlyl.companies.service;

import com.xlyl.companies.domain.FundNetVal;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public interface FundNetValService {
    /**
     * 获取所有的xlsx的基金信息
     * @return
     */
    public List<FundNetVal> getAllFundNetVal();
}
