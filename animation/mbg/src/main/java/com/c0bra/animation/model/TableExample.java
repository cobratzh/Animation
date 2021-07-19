package com.c0bra.animation.model;

import java.util.ArrayList;
import java.util.List;

public class TableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableExample() {
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

        public Criteria andAnimeIdIsNull() {
            addCriterion("anime_id is null");
            return (Criteria) this;
        }

        public Criteria andAnimeIdIsNotNull() {
            addCriterion("anime_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnimeIdEqualTo(Integer value) {
            addCriterion("anime_id =", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotEqualTo(Integer value) {
            addCriterion("anime_id <>", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdGreaterThan(Integer value) {
            addCriterion("anime_id >", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("anime_id >=", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdLessThan(Integer value) {
            addCriterion("anime_id <", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("anime_id <=", value, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdIn(List<Integer> values) {
            addCriterion("anime_id in", values, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotIn(List<Integer> values) {
            addCriterion("anime_id not in", values, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdBetween(Integer value1, Integer value2) {
            addCriterion("anime_id between", value1, value2, "animeId");
            return (Criteria) this;
        }

        public Criteria andAnimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("anime_id not between", value1, value2, "animeId");
            return (Criteria) this;
        }

        public Criteria andWatchedIsNull() {
            addCriterion("watched is null");
            return (Criteria) this;
        }

        public Criteria andWatchedIsNotNull() {
            addCriterion("watched is not null");
            return (Criteria) this;
        }

        public Criteria andWatchedEqualTo(Integer value) {
            addCriterion("watched =", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedNotEqualTo(Integer value) {
            addCriterion("watched <>", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedGreaterThan(Integer value) {
            addCriterion("watched >", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedGreaterThanOrEqualTo(Integer value) {
            addCriterion("watched >=", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedLessThan(Integer value) {
            addCriterion("watched <", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedLessThanOrEqualTo(Integer value) {
            addCriterion("watched <=", value, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedIn(List<Integer> values) {
            addCriterion("watched in", values, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedNotIn(List<Integer> values) {
            addCriterion("watched not in", values, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedBetween(Integer value1, Integer value2) {
            addCriterion("watched between", value1, value2, "watched");
            return (Criteria) this;
        }

        public Criteria andWatchedNotBetween(Integer value1, Integer value2) {
            addCriterion("watched not between", value1, value2, "watched");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("ps is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("ps is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("ps =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("ps <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("ps >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("ps >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("ps <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("ps <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("ps like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("ps not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("ps in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("ps not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("ps between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("ps not between", value1, value2, "ps");
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