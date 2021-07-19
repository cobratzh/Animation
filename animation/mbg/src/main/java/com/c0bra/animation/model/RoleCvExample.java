package com.c0bra.animation.model;

import java.util.ArrayList;
import java.util.List;

public class RoleCvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleCvExample() {
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

        public Criteria andCvIdIsNull() {
            addCriterion("cv_id is null");
            return (Criteria) this;
        }

        public Criteria andCvIdIsNotNull() {
            addCriterion("cv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCvIdEqualTo(Integer value) {
            addCriterion("cv_id =", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotEqualTo(Integer value) {
            addCriterion("cv_id <>", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThan(Integer value) {
            addCriterion("cv_id >", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cv_id >=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThan(Integer value) {
            addCriterion("cv_id <", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdLessThanOrEqualTo(Integer value) {
            addCriterion("cv_id <=", value, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdIn(List<Integer> values) {
            addCriterion("cv_id in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotIn(List<Integer> values) {
            addCriterion("cv_id not in", values, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdBetween(Integer value1, Integer value2) {
            addCriterion("cv_id between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andCvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cv_id not between", value1, value2, "cvId");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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