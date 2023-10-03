package com.xlyl.companies.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompaniesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompaniesExample() {
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

        public Criteria andOrgUniCodeIsNull() {
            addCriterion("org_uni_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeIsNotNull() {
            addCriterion("org_uni_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeEqualTo(Long value) {
            addCriterion("org_uni_code =", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeNotEqualTo(Long value) {
            addCriterion("org_uni_code <>", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeGreaterThan(Long value) {
            addCriterion("org_uni_code >", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("org_uni_code >=", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeLessThan(Long value) {
            addCriterion("org_uni_code <", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeLessThanOrEqualTo(Long value) {
            addCriterion("org_uni_code <=", value, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeIn(List<Long> values) {
            addCriterion("org_uni_code in", values, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeNotIn(List<Long> values) {
            addCriterion("org_uni_code not in", values, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeBetween(Long value1, Long value2) {
            addCriterion("org_uni_code between", value1, value2, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgUniCodeNotBetween(Long value1, Long value2) {
            addCriterion("org_uni_code not between", value1, value2, "orgUniCode");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameIsNull() {
            addCriterion("org_chi_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameIsNotNull() {
            addCriterion("org_chi_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameEqualTo(String value) {
            addCriterion("org_chi_name =", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameNotEqualTo(String value) {
            addCriterion("org_chi_name <>", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameGreaterThan(String value) {
            addCriterion("org_chi_name >", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_chi_name >=", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameLessThan(String value) {
            addCriterion("org_chi_name <", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameLessThanOrEqualTo(String value) {
            addCriterion("org_chi_name <=", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameLike(String value) {
            addCriterion("org_chi_name like", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameNotLike(String value) {
            addCriterion("org_chi_name not like", value, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameIn(List<String> values) {
            addCriterion("org_chi_name in", values, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameNotIn(List<String> values) {
            addCriterion("org_chi_name not in", values, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameBetween(String value1, String value2) {
            addCriterion("org_chi_name between", value1, value2, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andOrgChiNameNotBetween(String value1, String value2) {
            addCriterion("org_chi_name not between", value1, value2, "orgChiName");
            return (Criteria) this;
        }

        public Criteria andInduSmaParIsNull() {
            addCriterion("indu_sma_par is null");
            return (Criteria) this;
        }

        public Criteria andInduSmaParIsNotNull() {
            addCriterion("indu_sma_par is not null");
            return (Criteria) this;
        }

        public Criteria andInduSmaParEqualTo(String value) {
            addCriterion("indu_sma_par =", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParNotEqualTo(String value) {
            addCriterion("indu_sma_par <>", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParGreaterThan(String value) {
            addCriterion("indu_sma_par >", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParGreaterThanOrEqualTo(String value) {
            addCriterion("indu_sma_par >=", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParLessThan(String value) {
            addCriterion("indu_sma_par <", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParLessThanOrEqualTo(String value) {
            addCriterion("indu_sma_par <=", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParLike(String value) {
            addCriterion("indu_sma_par like", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParNotLike(String value) {
            addCriterion("indu_sma_par not like", value, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParIn(List<String> values) {
            addCriterion("indu_sma_par in", values, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParNotIn(List<String> values) {
            addCriterion("indu_sma_par not in", values, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParBetween(String value1, String value2) {
            addCriterion("indu_sma_par between", value1, value2, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andInduSmaParNotBetween(String value1, String value2) {
            addCriterion("indu_sma_par not between", value1, value2, "induSmaPar");
            return (Criteria) this;
        }

        public Criteria andOrgDeleIsNull() {
            addCriterion("org_dele is null");
            return (Criteria) this;
        }

        public Criteria andOrgDeleIsNotNull() {
            addCriterion("org_dele is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDeleEqualTo(String value) {
            addCriterion("org_dele =", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleNotEqualTo(String value) {
            addCriterion("org_dele <>", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleGreaterThan(String value) {
            addCriterion("org_dele >", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleGreaterThanOrEqualTo(String value) {
            addCriterion("org_dele >=", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleLessThan(String value) {
            addCriterion("org_dele <", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleLessThanOrEqualTo(String value) {
            addCriterion("org_dele <=", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleLike(String value) {
            addCriterion("org_dele like", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleNotLike(String value) {
            addCriterion("org_dele not like", value, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleIn(List<String> values) {
            addCriterion("org_dele in", values, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleNotIn(List<String> values) {
            addCriterion("org_dele not in", values, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleBetween(String value1, String value2) {
            addCriterion("org_dele between", value1, value2, "orgDele");
            return (Criteria) this;
        }

        public Criteria andOrgDeleNotBetween(String value1, String value2) {
            addCriterion("org_dele not between", value1, value2, "orgDele");
            return (Criteria) this;
        }

        public Criteria andRegCapIsNull() {
            addCriterion("reg_cap is null");
            return (Criteria) this;
        }

        public Criteria andRegCapIsNotNull() {
            addCriterion("reg_cap is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapEqualTo(BigDecimal value) {
            addCriterion("reg_cap =", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotEqualTo(BigDecimal value) {
            addCriterion("reg_cap <>", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapGreaterThan(BigDecimal value) {
            addCriterion("reg_cap >", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_cap >=", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapLessThan(BigDecimal value) {
            addCriterion("reg_cap <", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_cap <=", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapIn(List<BigDecimal> values) {
            addCriterion("reg_cap in", values, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotIn(List<BigDecimal> values) {
            addCriterion("reg_cap not in", values, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_cap between", value1, value2, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_cap not between", value1, value2, "regCap");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateIsNull() {
            addCriterion("org_est_date is null");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateIsNotNull() {
            addCriterion("org_est_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateEqualTo(Date value) {
            addCriterion("org_est_date =", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateNotEqualTo(Date value) {
            addCriterion("org_est_date <>", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateGreaterThan(Date value) {
            addCriterion("org_est_date >", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateGreaterThanOrEqualTo(Date value) {
            addCriterion("org_est_date >=", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateLessThan(Date value) {
            addCriterion("org_est_date <", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateLessThanOrEqualTo(Date value) {
            addCriterion("org_est_date <=", value, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateIn(List<Date> values) {
            addCriterion("org_est_date in", values, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateNotIn(List<Date> values) {
            addCriterion("org_est_date not in", values, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateBetween(Date value1, Date value2) {
            addCriterion("org_est_date between", value1, value2, "orgEstDate");
            return (Criteria) this;
        }

        public Criteria andOrgEstDateNotBetween(Date value1, Date value2) {
            addCriterion("org_est_date not between", value1, value2, "orgEstDate");
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