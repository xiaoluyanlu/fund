package com.xlyl.gen.mapper;

import com.xlyl.gen.domain.FundNetVal;
import com.xlyl.gen.domain.FundNetValExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundNetValMapper {
    long countByExample(FundNetValExample example);

    int deleteByExample(FundNetValExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FundNetVal record);

    int insertSelective(FundNetVal record);

    List<FundNetVal> selectByExample(FundNetValExample example);

    FundNetVal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FundNetVal record, @Param("example") FundNetValExample example);

    int updateByExample(@Param("record") FundNetVal record, @Param("example") FundNetValExample example);

    int updateByPrimaryKeySelective(FundNetVal record);

    int updateByPrimaryKey(FundNetVal record);
}