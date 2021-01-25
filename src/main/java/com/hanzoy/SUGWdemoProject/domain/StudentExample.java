package com.hanzoy.SUGWdemoProject.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andStuidIsNull() {
            addCriterion("stuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("stuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("stuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("stuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("stuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("stuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("stuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("stuId like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("stuId not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("stuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("stuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("stuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("stuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNull() {
            addCriterion("stdName is null");
            return (Criteria) this;
        }

        public Criteria andStdnameIsNotNull() {
            addCriterion("stdName is not null");
            return (Criteria) this;
        }

        public Criteria andStdnameEqualTo(String value) {
            addCriterion("stdName =", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotEqualTo(String value) {
            addCriterion("stdName <>", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThan(String value) {
            addCriterion("stdName >", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameGreaterThanOrEqualTo(String value) {
            addCriterion("stdName >=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThan(String value) {
            addCriterion("stdName <", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLessThanOrEqualTo(String value) {
            addCriterion("stdName <=", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameLike(String value) {
            addCriterion("stdName like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotLike(String value) {
            addCriterion("stdName not like", value, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameIn(List<String> values) {
            addCriterion("stdName in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotIn(List<String> values) {
            addCriterion("stdName not in", values, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameBetween(String value1, String value2) {
            addCriterion("stdName between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andStdnameNotBetween(String value1, String value2) {
            addCriterion("stdName not between", value1, value2, "stdname");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(Integer value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(Integer value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(Integer value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(Integer value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(Integer value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<Integer> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<Integer> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(Integer value1, Integer value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(Integer value1, Integer value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNull() {
            addCriterion("classNum is null");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNotNull() {
            addCriterion("classNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassnumEqualTo(String value) {
            addCriterion("classNum =", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotEqualTo(String value) {
            addCriterion("classNum <>", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThan(String value) {
            addCriterion("classNum >", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThanOrEqualTo(String value) {
            addCriterion("classNum >=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThan(String value) {
            addCriterion("classNum <", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThanOrEqualTo(String value) {
            addCriterion("classNum <=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLike(String value) {
            addCriterion("classNum like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotLike(String value) {
            addCriterion("classNum not like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIn(List<String> values) {
            addCriterion("classNum in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotIn(List<String> values) {
            addCriterion("classNum not in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumBetween(String value1, String value2) {
            addCriterion("classNum between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotBetween(String value1, String value2) {
            addCriterion("classNum not between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andStdqqIsNull() {
            addCriterion("stdQQ is null");
            return (Criteria) this;
        }

        public Criteria andStdqqIsNotNull() {
            addCriterion("stdQQ is not null");
            return (Criteria) this;
        }

        public Criteria andStdqqEqualTo(String value) {
            addCriterion("stdQQ =", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotEqualTo(String value) {
            addCriterion("stdQQ <>", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqGreaterThan(String value) {
            addCriterion("stdQQ >", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqGreaterThanOrEqualTo(String value) {
            addCriterion("stdQQ >=", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLessThan(String value) {
            addCriterion("stdQQ <", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLessThanOrEqualTo(String value) {
            addCriterion("stdQQ <=", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqLike(String value) {
            addCriterion("stdQQ like", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotLike(String value) {
            addCriterion("stdQQ not like", value, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqIn(List<String> values) {
            addCriterion("stdQQ in", values, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotIn(List<String> values) {
            addCriterion("stdQQ not in", values, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqBetween(String value1, String value2) {
            addCriterion("stdQQ between", value1, value2, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdqqNotBetween(String value1, String value2) {
            addCriterion("stdQQ not between", value1, value2, "stdqq");
            return (Criteria) this;
        }

        public Criteria andStdphoneIsNull() {
            addCriterion("stdPhone is null");
            return (Criteria) this;
        }

        public Criteria andStdphoneIsNotNull() {
            addCriterion("stdPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStdphoneEqualTo(String value) {
            addCriterion("stdPhone =", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotEqualTo(String value) {
            addCriterion("stdPhone <>", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneGreaterThan(String value) {
            addCriterion("stdPhone >", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stdPhone >=", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLessThan(String value) {
            addCriterion("stdPhone <", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLessThanOrEqualTo(String value) {
            addCriterion("stdPhone <=", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneLike(String value) {
            addCriterion("stdPhone like", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotLike(String value) {
            addCriterion("stdPhone not like", value, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneIn(List<String> values) {
            addCriterion("stdPhone in", values, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotIn(List<String> values) {
            addCriterion("stdPhone not in", values, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneBetween(String value1, String value2) {
            addCriterion("stdPhone between", value1, value2, "stdphone");
            return (Criteria) this;
        }

        public Criteria andStdphoneNotBetween(String value1, String value2) {
            addCriterion("stdPhone not between", value1, value2, "stdphone");
            return (Criteria) this;
        }

        public Criteria andFirstwillIsNull() {
            addCriterion("firstWill is null");
            return (Criteria) this;
        }

        public Criteria andFirstwillIsNotNull() {
            addCriterion("firstWill is not null");
            return (Criteria) this;
        }

        public Criteria andFirstwillEqualTo(Integer value) {
            addCriterion("firstWill =", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillNotEqualTo(Integer value) {
            addCriterion("firstWill <>", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillGreaterThan(Integer value) {
            addCriterion("firstWill >", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstWill >=", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillLessThan(Integer value) {
            addCriterion("firstWill <", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillLessThanOrEqualTo(Integer value) {
            addCriterion("firstWill <=", value, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillIn(List<Integer> values) {
            addCriterion("firstWill in", values, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillNotIn(List<Integer> values) {
            addCriterion("firstWill not in", values, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillBetween(Integer value1, Integer value2) {
            addCriterion("firstWill between", value1, value2, "firstwill");
            return (Criteria) this;
        }

        public Criteria andFirstwillNotBetween(Integer value1, Integer value2) {
            addCriterion("firstWill not between", value1, value2, "firstwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillIsNull() {
            addCriterion("secondWill is null");
            return (Criteria) this;
        }

        public Criteria andSecondwillIsNotNull() {
            addCriterion("secondWill is not null");
            return (Criteria) this;
        }

        public Criteria andSecondwillEqualTo(Integer value) {
            addCriterion("secondWill =", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillNotEqualTo(Integer value) {
            addCriterion("secondWill <>", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillGreaterThan(Integer value) {
            addCriterion("secondWill >", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondWill >=", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillLessThan(Integer value) {
            addCriterion("secondWill <", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillLessThanOrEqualTo(Integer value) {
            addCriterion("secondWill <=", value, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillIn(List<Integer> values) {
            addCriterion("secondWill in", values, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillNotIn(List<Integer> values) {
            addCriterion("secondWill not in", values, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillBetween(Integer value1, Integer value2) {
            addCriterion("secondWill between", value1, value2, "secondwill");
            return (Criteria) this;
        }

        public Criteria andSecondwillNotBetween(Integer value1, Integer value2) {
            addCriterion("secondWill not between", value1, value2, "secondwill");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIsNull() {
            addCriterion("isDispensing is null");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIsNotNull() {
            addCriterion("isDispensing is not null");
            return (Criteria) this;
        }

        public Criteria andIsdispensingEqualTo(Boolean value) {
            addCriterion("isDispensing =", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotEqualTo(Boolean value) {
            addCriterion("isDispensing <>", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingGreaterThan(Boolean value) {
            addCriterion("isDispensing >", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDispensing >=", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingLessThan(Boolean value) {
            addCriterion("isDispensing <", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingLessThanOrEqualTo(Boolean value) {
            addCriterion("isDispensing <=", value, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingIn(List<Boolean> values) {
            addCriterion("isDispensing in", values, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotIn(List<Boolean> values) {
            addCriterion("isDispensing not in", values, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingBetween(Boolean value1, Boolean value2) {
            addCriterion("isDispensing between", value1, value2, "isdispensing");
            return (Criteria) this;
        }

        public Criteria andIsdispensingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDispensing not between", value1, value2, "isdispensing");
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