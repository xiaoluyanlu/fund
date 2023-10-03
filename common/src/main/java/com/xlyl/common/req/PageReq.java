package com.xlyl.common.req;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public class PageReq {

    //pageNum 页数 必填
    @NotNull(message = "[当前页数]不能为空")
    private Integer pageNum;

    //每页条数 必填
    @NotNull(message = "[每页条数]不能为空")
    @Max(value = 100,message = "[每页条数]不能超过100")
    private Integer pageSize;

    //排序字段 必填 默认按照单位净值顺序排序
    @NotBlank(message = "[排序字段]不能为空")
    private String sortField;

    //排序方向 升序还是降序 必填
    @NotBlank(message = "[排序方向]不能为空")
    private String sortDirection;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", sortField='" + sortField + '\'' +
                ", sortDirection='" + sortDirection + '\'' +
                '}';
    }
}
