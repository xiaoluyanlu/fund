package com.xlyl.companies.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundNetValExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundNetValExample() {
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