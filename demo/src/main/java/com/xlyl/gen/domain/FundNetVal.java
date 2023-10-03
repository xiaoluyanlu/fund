package com.xlyl.gen.domain;

import java.math.BigDecimal;
import java.util.Date;

public class FundNetVal {
    private Long id;

    private String fundCode;

    private String fundShortName;

    private Date endDate;

    private BigDecimal unitNetVal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundShortName() {
        return fundShortName;
    }

    public void setFundShortName(String fundShortName) {
        this.fundShortName = fundShortName;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getUnitNetVal() {
        return unitNetVal;
    }

    public void setUnitNetVal(BigDecimal unitNetVal) {
        this.unitNetVal = unitNetVal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", fundShortName=").append(fundShortName);
        sb.append(", endDate=").append(endDate);
        sb.append(", unitNetVal=").append(unitNetVal);
        sb.append("]");
        return sb.toString();
    }
}