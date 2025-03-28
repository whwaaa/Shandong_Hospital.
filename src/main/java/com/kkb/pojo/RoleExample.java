package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andR_idIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andR_idIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andR_idEqualTo(Integer value) {
            addCriterion("r_id =", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idGreaterThan(Integer value) {
            addCriterion("r_id >", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idLessThan(Integer value) {
            addCriterion("r_id <", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idIn(List<Integer> values) {
            addCriterion("r_id in", values, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_idNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "r_id");
            return (Criteria) this;
        }

        public Criteria andR_nameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andR_nameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andR_nameEqualTo(String value) {
            addCriterion("r_name =", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameGreaterThan(String value) {
            addCriterion("r_name >", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameLessThan(String value) {
            addCriterion("r_name <", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameLike(String value) {
            addCriterion("r_name like", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameNotLike(String value) {
            addCriterion("r_name not like", value, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameIn(List<String> values) {
            addCriterion("r_name in", values, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_nameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "r_name");
            return (Criteria) this;
        }

        public Criteria andR_stateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andR_stateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andR_stateEqualTo(Integer value) {
            addCriterion("r_state =", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateNotEqualTo(Integer value) {
            addCriterion("r_state <>", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateGreaterThan(Integer value) {
            addCriterion("r_state >", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_state >=", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateLessThan(Integer value) {
            addCriterion("r_state <", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateLessThanOrEqualTo(Integer value) {
            addCriterion("r_state <=", value, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateIn(List<Integer> values) {
            addCriterion("r_state in", values, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateNotIn(List<Integer> values) {
            addCriterion("r_state not in", values, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateBetween(Integer value1, Integer value2) {
            addCriterion("r_state between", value1, value2, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("r_state not between", value1, value2, "r_state");
            return (Criteria) this;
        }

        public Criteria andR_isDelIsNull() {
            addCriterion("r_isDel is null");
            return (Criteria) this;
        }

        public Criteria andR_isDelIsNotNull() {
            addCriterion("r_isDel is not null");
            return (Criteria) this;
        }

        public Criteria andR_isDelEqualTo(Integer value) {
            addCriterion("r_isDel =", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelNotEqualTo(Integer value) {
            addCriterion("r_isDel <>", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelGreaterThan(Integer value) {
            addCriterion("r_isDel >", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_isDel >=", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelLessThan(Integer value) {
            addCriterion("r_isDel <", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelLessThanOrEqualTo(Integer value) {
            addCriterion("r_isDel <=", value, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelIn(List<Integer> values) {
            addCriterion("r_isDel in", values, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelNotIn(List<Integer> values) {
            addCriterion("r_isDel not in", values, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelBetween(Integer value1, Integer value2) {
            addCriterion("r_isDel between", value1, value2, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_isDelNotBetween(Integer value1, Integer value2) {
            addCriterion("r_isDel not between", value1, value2, "r_isDel");
            return (Criteria) this;
        }

        public Criteria andR_create_timeIsNull() {
            addCriterion("r_create_time is null");
            return (Criteria) this;
        }

        public Criteria andR_create_timeIsNotNull() {
            addCriterion("r_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andR_create_timeEqualTo(Date value) {
            addCriterion("r_create_time =", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeNotEqualTo(Date value) {
            addCriterion("r_create_time <>", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeGreaterThan(Date value) {
            addCriterion("r_create_time >", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_create_time >=", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeLessThan(Date value) {
            addCriterion("r_create_time <", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeLessThanOrEqualTo(Date value) {
            addCriterion("r_create_time <=", value, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeIn(List<Date> values) {
            addCriterion("r_create_time in", values, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeNotIn(List<Date> values) {
            addCriterion("r_create_time not in", values, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeBetween(Date value1, Date value2) {
            addCriterion("r_create_time between", value1, value2, "r_create_time");
            return (Criteria) this;
        }

        public Criteria andR_create_timeNotBetween(Date value1, Date value2) {
            addCriterion("r_create_time not between", value1, value2, "r_create_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeIsNull() {
            addCriterion("_update_time is null");
            return (Criteria) this;
        }

        public Criteria and_update_timeIsNotNull() {
            addCriterion("_update_time is not null");
            return (Criteria) this;
        }

        public Criteria and_update_timeEqualTo(Date value) {
            addCriterion("_update_time =", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeNotEqualTo(Date value) {
            addCriterion("_update_time <>", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeGreaterThan(Date value) {
            addCriterion("_update_time >", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("_update_time >=", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeLessThan(Date value) {
            addCriterion("_update_time <", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeLessThanOrEqualTo(Date value) {
            addCriterion("_update_time <=", value, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeIn(List<Date> values) {
            addCriterion("_update_time in", values, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeNotIn(List<Date> values) {
            addCriterion("_update_time not in", values, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeBetween(Date value1, Date value2) {
            addCriterion("_update_time between", value1, value2, "_update_time");
            return (Criteria) this;
        }

        public Criteria and_update_timeNotBetween(Date value1, Date value2) {
            addCriterion("_update_time not between", value1, value2, "_update_time");
            return (Criteria) this;
        }

        public Criteria andU_idIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andU_idIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andU_idEqualTo(Integer value) {
            addCriterion("u_id =", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThan(Integer value) {
            addCriterion("u_id >", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThan(Integer value) {
            addCriterion("u_id <", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idIn(List<Integer> values) {
            addCriterion("u_id in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "u_id");
            return (Criteria) this;
        }

        public Criteria andU_idNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "u_id");
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