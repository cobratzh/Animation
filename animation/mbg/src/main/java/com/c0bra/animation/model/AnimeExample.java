package com.c0bra.animation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProductionIdIsNull() {
            addCriterion("production_id is null");
            return (Criteria) this;
        }

        public Criteria andProductionIdIsNotNull() {
            addCriterion("production_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductionIdEqualTo(Integer value) {
            addCriterion("production_id =", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotEqualTo(Integer value) {
            addCriterion("production_id <>", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdGreaterThan(Integer value) {
            addCriterion("production_id >", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("production_id >=", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdLessThan(Integer value) {
            addCriterion("production_id <", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdLessThanOrEqualTo(Integer value) {
            addCriterion("production_id <=", value, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdIn(List<Integer> values) {
            addCriterion("production_id in", values, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotIn(List<Integer> values) {
            addCriterion("production_id not in", values, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdBetween(Integer value1, Integer value2) {
            addCriterion("production_id between", value1, value2, "productionId");
            return (Criteria) this;
        }

        public Criteria andProductionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("production_id not between", value1, value2, "productionId");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNull() {
            addCriterion("release is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIsNotNull() {
            addCriterion("release is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseEqualTo(Date value) {
            addCriterion("release =", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotEqualTo(Date value) {
            addCriterion("release <>", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThan(Date value) {
            addCriterion("release >", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseGreaterThanOrEqualTo(Date value) {
            addCriterion("release >=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThan(Date value) {
            addCriterion("release <", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseLessThanOrEqualTo(Date value) {
            addCriterion("release <=", value, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseIn(List<Date> values) {
            addCriterion("release in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotIn(List<Date> values) {
            addCriterion("release not in", values, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseBetween(Date value1, Date value2) {
            addCriterion("release between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andReleaseNotBetween(Date value1, Date value2) {
            addCriterion("release not between", value1, value2, "release");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalIsNull() {
            addCriterion("update_interval is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalIsNotNull() {
            addCriterion("update_interval is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalEqualTo(Integer value) {
            addCriterion("update_interval =", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotEqualTo(Integer value) {
            addCriterion("update_interval <>", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalGreaterThan(Integer value) {
            addCriterion("update_interval >", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_interval >=", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalLessThan(Integer value) {
            addCriterion("update_interval <", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("update_interval <=", value, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalIn(List<Integer> values) {
            addCriterion("update_interval in", values, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotIn(List<Integer> values) {
            addCriterion("update_interval not in", values, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalBetween(Integer value1, Integer value2) {
            addCriterion("update_interval between", value1, value2, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andUpdateIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("update_interval not between", value1, value2, "updateInterval");
            return (Criteria) this;
        }

        public Criteria andEpisodeIsNull() {
            addCriterion("episode is null");
            return (Criteria) this;
        }

        public Criteria andEpisodeIsNotNull() {
            addCriterion("episode is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodeEqualTo(Integer value) {
            addCriterion("episode =", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotEqualTo(Integer value) {
            addCriterion("episode <>", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeGreaterThan(Integer value) {
            addCriterion("episode >", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("episode >=", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeLessThan(Integer value) {
            addCriterion("episode <", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeLessThanOrEqualTo(Integer value) {
            addCriterion("episode <=", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeIn(List<Integer> values) {
            addCriterion("episode in", values, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotIn(List<Integer> values) {
            addCriterion("episode not in", values, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeBetween(Integer value1, Integer value2) {
            addCriterion("episode between", value1, value2, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotBetween(Integer value1, Integer value2) {
            addCriterion("episode not between", value1, value2, "episode");
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