package com.xlyl.companies.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public class CompaniesResp {

    //防止精度丢失
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long orgUniCode;

    private String orgChiName;

    private String induSmaPar;

    private String orgDele;

    private BigDecimal regCap;

    //日期格式化,不加前置0
    @JsonFormat(pattern = "yyyy/M/dd",timezone = "GMT+8")
    private Date orgEstDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgUniCode() {
        return orgUniCode;
    }

    public void setOrgUniCode(Long orgUniCode) {
        this.orgUniCode = orgUniCode;
    }

    public String getOrgChiName() {
        return orgChiName;
    }

    public void setOrgChiName(String orgChiName) {
        this.orgChiName = orgChiName;
    }

    public String getInduSmaPar() {
        return induSmaPar;
    }

    public void setInduSmaPar(String induSmaPar) {
        this.induSmaPar = induSmaPar;
    }

    public String getOrgDele() {
        return orgDele;
    }

    public void setOrgDele(String orgDele) {
        this.orgDele = orgDele;
    }

    public BigDecimal getRegCap() {
        return regCap;
    }

    public void setRegCap(BigDecimal regCap) {
        this.regCap = regCap;
    }

    public Date getOrgEstDate() {
        return orgEstDate;
    }

    public void setOrgEstDate(Date orgEstDate) {
        this.orgEstDate = orgEstDate;
    }

    @Override
    public String toString() {
        return "CompaniesResp{" +
                "id=" + id +
                ", orgUniCode=" + orgUniCode +
                ", orgChiName='" + orgChiName + '\'' +
                ", induSmaPar='" + induSmaPar + '\'' +
                ", orgDele='" + orgDele + '\'' +
                ", regCap=" + regCap +
                ", orgEstDate=" + orgEstDate +
                '}';
    }
}
