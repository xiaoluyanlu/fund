package com.xlyl.companies.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Fund {
    private Long id;

    private String fundCode;

    private String fundShortName;

    private Date countDate;

    private Date endDate;

    private BigDecimal unitNetVal;

    private BigDecimal accumulateNetVal;

    private BigDecimal dailyGrowthRate;

    private BigDecimal oneWeek;

    private BigDecimal oneMonth;

    private BigDecimal threeMonth;

    private BigDecimal oneYear;

    private BigDecimal twoYear;

    private BigDecimal threeYear;

    private BigDecimal sinceThisYear;

    private BigDecimal sinceTheEstablishmentOf;

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

    public Date getCountDate() {
        return countDate;
    }

    public void setCountDate(Date countDate) {
        this.countDate = countDate;
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

    public BigDecimal getAccumulateNetVal() {
        return accumulateNetVal;
    }

    public void setAccumulateNetVal(BigDecimal accumulateNetVal) {
        this.accumulateNetVal = accumulateNetVal;
    }

    public BigDecimal getDailyGrowthRate() {
        return dailyGrowthRate;
    }

    public void setDailyGrowthRate(BigDecimal dailyGrowthRate) {
        this.dailyGrowthRate = dailyGrowthRate;
    }

    public BigDecimal getOneWeek() {
        return oneWeek;
    }

    public void setOneWeek(BigDecimal oneWeek) {
        this.oneWeek = oneWeek;
    }

    public BigDecimal getOneMonth() {
        return oneMonth;
    }

    public void setOneMonth(BigDecimal oneMonth) {
        this.oneMonth = oneMonth;
    }

    public BigDecimal getThreeMonth() {
        return threeMonth;
    }

    public void setThreeMonth(BigDecimal threeMonth) {
        this.threeMonth = threeMonth;
    }

    public BigDecimal getOneYear() {
        return oneYear;
    }

    public void setOneYear(BigDecimal oneYear) {
        this.oneYear = oneYear;
    }

    public BigDecimal getTwoYear() {
        return twoYear;
    }

    public void setTwoYear(BigDecimal twoYear) {
        this.twoYear = twoYear;
    }

    public BigDecimal getThreeYear() {
        return threeYear;
    }

    public void setThreeYear(BigDecimal threeYear) {
        this.threeYear = threeYear;
    }

    public BigDecimal getSinceThisYear() {
        return sinceThisYear;
    }

    public void setSinceThisYear(BigDecimal sinceThisYear) {
        this.sinceThisYear = sinceThisYear;
    }

    public BigDecimal getSinceTheEstablishmentOf() {
        return sinceTheEstablishmentOf;
    }

    public void setSinceTheEstablishmentOf(BigDecimal sinceTheEstablishmentOf) {
        this.sinceTheEstablishmentOf = sinceTheEstablishmentOf;
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
        sb.append(", countDate=").append(countDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", unitNetVal=").append(unitNetVal);
        sb.append(", accumulateNetVal=").append(accumulateNetVal);
        sb.append(", dailyGrowthRate=").append(dailyGrowthRate);
        sb.append(", oneWeek=").append(oneWeek);
        sb.append(", oneMonth=").append(oneMonth);
        sb.append(", threeMonth=").append(threeMonth);
        sb.append(", oneYear=").append(oneYear);
        sb.append(", twoYear=").append(twoYear);
        sb.append(", threeYear=").append(threeYear);
        sb.append(", sinceThisYear=").append(sinceThisYear);
        sb.append(", sinceTheEstablishmentOf=").append(sinceTheEstablishmentOf);
        sb.append("]");
        return sb.toString();
    }
}