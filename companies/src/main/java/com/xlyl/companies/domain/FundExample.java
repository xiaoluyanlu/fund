package com.xlyl.companies.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("fund_code is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("fund_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("fund_code =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("fund_code <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("fund_code >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_code >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("fund_code <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_code <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("fund_code like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("fund_code not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("fund_code in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("fund_code not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("fund_code between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("fund_code not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIsNull() {
            addCriterion("fund_short_name is null");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIsNotNull() {
            addCriterion("fund_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundShortNameEqualTo(String value) {
            addCriterion("fund_short_name =", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotEqualTo(String value) {
            addCriterion("fund_short_name <>", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameGreaterThan(String value) {
            addCriterion("fund_short_name >", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_short_name >=", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLessThan(String value) {
            addCriterion("fund_short_name <", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLessThanOrEqualTo(String value) {
            addCriterion("fund_short_name <=", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLike(String value) {
            addCriterion("fund_short_name like", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotLike(String value) {
            addCriterion("fund_short_name not like", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIn(List<String> values) {
            addCriterion("fund_short_name in", values, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotIn(List<String> values) {
            addCriterion("fund_short_name not in", values, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameBetween(String value1, String value2) {
            addCriterion("fund_short_name between", value1, value2, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotBetween(String value1, String value2) {
            addCriterion("fund_short_name not between", value1, value2, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andCountDateIsNull() {
            addCriterion("count_date is null");
            return (Criteria) this;
        }

        public Criteria andCountDateIsNotNull() {
            addCriterion("count_date is not null");
            return (Criteria) this;
        }

        public Criteria andCountDateEqualTo(Date value) {
            addCriterion("count_date =", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotEqualTo(Date value) {
            addCriterion("count_date <>", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThan(Date value) {
            addCriterion("count_date >", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateGreaterThanOrEqualTo(Date value) {
            addCriterion("count_date >=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThan(Date value) {
            addCriterion("count_date <", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateLessThanOrEqualTo(Date value) {
            addCriterion("count_date <=", value, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateIn(List<Date> values) {
            addCriterion("count_date in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotIn(List<Date> values) {
            addCriterion("count_date not in", values, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateBetween(Date value1, Date value2) {
            addCriterion("count_date between", value1, value2, "countDate");
            return (Criteria) this;
        }

        public Criteria andCountDateNotBetween(Date value1, Date value2) {
            addCriterion("count_date not between", value1, value2, "countDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andUnitNetValIsNull() {
            addCriterion("unit_net_val is null");
            return (Criteria) this;
        }

        public Criteria andUnitNetValIsNotNull() {
            addCriterion("unit_net_val is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNetValEqualTo(BigDecimal value) {
            addCriterion("unit_net_val =", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValNotEqualTo(BigDecimal value) {
            addCriterion("unit_net_val <>", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValGreaterThan(BigDecimal value) {
            addCriterion("unit_net_val >", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_net_val >=", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValLessThan(BigDecimal value) {
            addCriterion("unit_net_val <", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_net_val <=", value, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValIn(List<BigDecimal> values) {
            addCriterion("unit_net_val in", values, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValNotIn(List<BigDecimal> values) {
            addCriterion("unit_net_val not in", values, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_net_val between", value1, value2, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andUnitNetValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_net_val not between", value1, value2, "unitNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValIsNull() {
            addCriterion("accumulate_net_val is null");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValIsNotNull() {
            addCriterion("accumulate_net_val is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValEqualTo(BigDecimal value) {
            addCriterion("accumulate_net_val =", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValNotEqualTo(BigDecimal value) {
            addCriterion("accumulate_net_val <>", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValGreaterThan(BigDecimal value) {
            addCriterion("accumulate_net_val >", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulate_net_val >=", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValLessThan(BigDecimal value) {
            addCriterion("accumulate_net_val <", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accumulate_net_val <=", value, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValIn(List<BigDecimal> values) {
            addCriterion("accumulate_net_val in", values, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValNotIn(List<BigDecimal> values) {
            addCriterion("accumulate_net_val not in", values, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulate_net_val between", value1, value2, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andAccumulateNetValNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accumulate_net_val not between", value1, value2, "accumulateNetVal");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateIsNull() {
            addCriterion("daily_growth_rate is null");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateIsNotNull() {
            addCriterion("daily_growth_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateEqualTo(BigDecimal value) {
            addCriterion("daily_growth_rate =", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateNotEqualTo(BigDecimal value) {
            addCriterion("daily_growth_rate <>", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateGreaterThan(BigDecimal value) {
            addCriterion("daily_growth_rate >", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_growth_rate >=", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateLessThan(BigDecimal value) {
            addCriterion("daily_growth_rate <", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("daily_growth_rate <=", value, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateIn(List<BigDecimal> values) {
            addCriterion("daily_growth_rate in", values, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateNotIn(List<BigDecimal> values) {
            addCriterion("daily_growth_rate not in", values, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_growth_rate between", value1, value2, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andDailyGrowthRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("daily_growth_rate not between", value1, value2, "dailyGrowthRate");
            return (Criteria) this;
        }

        public Criteria andOneWeekIsNull() {
            addCriterion("one_week is null");
            return (Criteria) this;
        }

        public Criteria andOneWeekIsNotNull() {
            addCriterion("one_week is not null");
            return (Criteria) this;
        }

        public Criteria andOneWeekEqualTo(BigDecimal value) {
            addCriterion("one_week =", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotEqualTo(BigDecimal value) {
            addCriterion("one_week <>", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekGreaterThan(BigDecimal value) {
            addCriterion("one_week >", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_week >=", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekLessThan(BigDecimal value) {
            addCriterion("one_week <", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_week <=", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekIn(List<BigDecimal> values) {
            addCriterion("one_week in", values, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotIn(List<BigDecimal> values) {
            addCriterion("one_week not in", values, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_week between", value1, value2, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_week not between", value1, value2, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNull() {
            addCriterion("one_month is null");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNotNull() {
            addCriterion("one_month is not null");
            return (Criteria) this;
        }

        public Criteria andOneMonthEqualTo(BigDecimal value) {
            addCriterion("one_month =", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotEqualTo(BigDecimal value) {
            addCriterion("one_month <>", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThan(BigDecimal value) {
            addCriterion("one_month >", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_month >=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThan(BigDecimal value) {
            addCriterion("one_month <", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_month <=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthIn(List<BigDecimal> values) {
            addCriterion("one_month in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotIn(List<BigDecimal> values) {
            addCriterion("one_month not in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_month between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_month not between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIsNull() {
            addCriterion("three_month is null");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIsNotNull() {
            addCriterion("three_month is not null");
            return (Criteria) this;
        }

        public Criteria andThreeMonthEqualTo(BigDecimal value) {
            addCriterion("three_month =", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotEqualTo(BigDecimal value) {
            addCriterion("three_month <>", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthGreaterThan(BigDecimal value) {
            addCriterion("three_month >", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("three_month >=", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthLessThan(BigDecimal value) {
            addCriterion("three_month <", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("three_month <=", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIn(List<BigDecimal> values) {
            addCriterion("three_month in", values, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotIn(List<BigDecimal> values) {
            addCriterion("three_month not in", values, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_month between", value1, value2, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_month not between", value1, value2, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNull() {
            addCriterion("one_year is null");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNotNull() {
            addCriterion("one_year is not null");
            return (Criteria) this;
        }

        public Criteria andOneYearEqualTo(BigDecimal value) {
            addCriterion("one_year =", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotEqualTo(BigDecimal value) {
            addCriterion("one_year <>", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThan(BigDecimal value) {
            addCriterion("one_year >", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_year >=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThan(BigDecimal value) {
            addCriterion("one_year <", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_year <=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearIn(List<BigDecimal> values) {
            addCriterion("one_year in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotIn(List<BigDecimal> values) {
            addCriterion("one_year not in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_year between", value1, value2, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_year not between", value1, value2, "oneYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearIsNull() {
            addCriterion("two_year is null");
            return (Criteria) this;
        }

        public Criteria andTwoYearIsNotNull() {
            addCriterion("two_year is not null");
            return (Criteria) this;
        }

        public Criteria andTwoYearEqualTo(BigDecimal value) {
            addCriterion("two_year =", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotEqualTo(BigDecimal value) {
            addCriterion("two_year <>", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearGreaterThan(BigDecimal value) {
            addCriterion("two_year >", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("two_year >=", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearLessThan(BigDecimal value) {
            addCriterion("two_year <", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("two_year <=", value, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearIn(List<BigDecimal> values) {
            addCriterion("two_year in", values, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotIn(List<BigDecimal> values) {
            addCriterion("two_year not in", values, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_year between", value1, value2, "twoYear");
            return (Criteria) this;
        }

        public Criteria andTwoYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_year not between", value1, value2, "twoYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearIsNull() {
            addCriterion("three_year is null");
            return (Criteria) this;
        }

        public Criteria andThreeYearIsNotNull() {
            addCriterion("three_year is not null");
            return (Criteria) this;
        }

        public Criteria andThreeYearEqualTo(BigDecimal value) {
            addCriterion("three_year =", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotEqualTo(BigDecimal value) {
            addCriterion("three_year <>", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearGreaterThan(BigDecimal value) {
            addCriterion("three_year >", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("three_year >=", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearLessThan(BigDecimal value) {
            addCriterion("three_year <", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("three_year <=", value, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearIn(List<BigDecimal> values) {
            addCriterion("three_year in", values, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotIn(List<BigDecimal> values) {
            addCriterion("three_year not in", values, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_year between", value1, value2, "threeYear");
            return (Criteria) this;
        }

        public Criteria andThreeYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_year not between", value1, value2, "threeYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIsNull() {
            addCriterion("since_this_year is null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIsNotNull() {
            addCriterion("since_this_year is not null");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearEqualTo(BigDecimal value) {
            addCriterion("since_this_year =", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotEqualTo(BigDecimal value) {
            addCriterion("since_this_year <>", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGreaterThan(BigDecimal value) {
            addCriterion("since_this_year >", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year >=", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearLessThan(BigDecimal value) {
            addCriterion("since_this_year <", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("since_this_year <=", value, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearIn(List<BigDecimal> values) {
            addCriterion("since_this_year in", values, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotIn(List<BigDecimal> values) {
            addCriterion("since_this_year not in", values, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year between", value1, value2, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceThisYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("since_this_year not between", value1, value2, "sinceThisYear");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfIsNull() {
            addCriterion("Since_the_establishment_of is null");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfIsNotNull() {
            addCriterion("Since_the_establishment_of is not null");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfEqualTo(BigDecimal value) {
            addCriterion("Since_the_establishment_of =", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfNotEqualTo(BigDecimal value) {
            addCriterion("Since_the_establishment_of <>", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfGreaterThan(BigDecimal value) {
            addCriterion("Since_the_establishment_of >", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Since_the_establishment_of >=", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfLessThan(BigDecimal value) {
            addCriterion("Since_the_establishment_of <", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Since_the_establishment_of <=", value, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfIn(List<BigDecimal> values) {
            addCriterion("Since_the_establishment_of in", values, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfNotIn(List<BigDecimal> values) {
            addCriterion("Since_the_establishment_of not in", values, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Since_the_establishment_of between", value1, value2, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }

        public Criteria andSinceTheEstablishmentOfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Since_the_establishment_of not between", value1, value2, "sinceTheEstablishmentOf");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}