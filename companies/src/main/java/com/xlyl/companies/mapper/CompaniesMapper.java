package com.xlyl.companies.mapper;

import com.xlyl.companies.domain.Companies;
import com.xlyl.companies.domain.CompaniesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompaniesMapper {
    long countByExample(CompaniesExample example);

    int deleteByExample(CompaniesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Companies record);

    int insertSelective(Companies record);

    List<Companies> selectByExample(CompaniesExample example);

    Companies selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Companies record, @Param("example") CompaniesExample example);

    int updateByExample(@Param("record") Companies record, @Param("example") CompaniesExample example);

    int updateByPrimaryKeySelective(Companies record);

    int updateByPrimaryKey(Companies record);
}