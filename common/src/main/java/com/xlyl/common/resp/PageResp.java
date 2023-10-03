package com.xlyl.common.resp;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释 统一的分页
 */
public class PageResp<T> implements Serializable {
    //总条数
    private Long total;

    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}
