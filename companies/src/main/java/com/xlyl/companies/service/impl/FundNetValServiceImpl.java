package com.xlyl.companies.service.impl;

import com.xlyl.companies.domain.FundNetVal;
import com.xlyl.companies.domain.FundNetValExample;
import com.xlyl.companies.mapper.FundNetValMapper;
import com.xlyl.companies.service.FundNetValService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
@Service
public class FundNetValServiceImpl implements FundNetValService {

    @Autowired
    FundNetValMapper fundNetValMapper;

    /**
     * 获取所有的xlsx的基金信息
     * @return
     */
    public List<FundNetVal> getAllFundNetVal(){
        FundNetValExample fundNetValExample = new FundNetValExample();
       return fundNetValMapper.selectByExample(fundNetValExample);
    }

}
