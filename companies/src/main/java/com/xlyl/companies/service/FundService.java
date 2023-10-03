package com.xlyl.companies.service;

import com.xlyl.common.req.PageReq;
import com.xlyl.common.resp.PageResp;
import com.xlyl.companies.resp.FundResp;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public interface FundService {
    /**
     * 生成基金信息
     */
    void genFund();

    /**
     * 分页查询基金列表
     * pageNum 页数 必填
     * pageSize  每页条数 必填
     * sortField 排序字段 必填 默认按照单位净值顺序排序
     * sortDirection 排序方向 升序还是降序 必填
     *
     * @return
     */
    PageResp<FundResp> selPageFund(PageReq req);
}
