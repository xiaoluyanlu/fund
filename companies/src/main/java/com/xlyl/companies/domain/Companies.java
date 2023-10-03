package com.xlyl.companies.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Companies {
    private Long id;

    private Long orgUniCode;

    private String orgChiName;

    private String induSmaPar;

    private String orgDele;

    private BigDecimal regCap;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgUniCode=").append(orgUniCode);
        sb.append(", orgChiName=").append(orgChiName);
        sb.append(", induSmaPar=").append(induSmaPar);
        sb.append(", orgDele=").append(orgDele);
        sb.append(", regCap=").append(regCap);
        sb.append(", orgEstDate=").append(orgEstDate);
        sb.append("]");
        return sb.toString();
    }
}