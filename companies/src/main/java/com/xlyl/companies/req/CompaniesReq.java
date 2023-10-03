package com.xlyl.companies.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public class CompaniesReq {

    private Long id;

    @NotNull(message = "[注册码]不能为空")
    private Long orgUniCode;

    @NotBlank(message = "[公司名称]不能为空")
    private String orgChiName;

    @NotBlank(message = "[公司类型]不能为空")
    private String induSmaPar;

    @NotBlank(message = "[法定代表人]不能为空")
    private String orgDele;

    @NotNull(message = "[注册资金]不能为空")
    private BigDecimal regCap;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @NotNull(message = "[成立日期]不能为空")
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
        return "CompaniesReq{" +
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
