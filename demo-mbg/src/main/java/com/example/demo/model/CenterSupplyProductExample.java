package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterSupplyProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterSupplyProductExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNull() {
            addCriterion("price_unit is null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNotNull() {
            addCriterion("price_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitEqualTo(Integer value) {
            addCriterion("price_unit =", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotEqualTo(Integer value) {
            addCriterion("price_unit <>", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThan(Integer value) {
            addCriterion("price_unit >", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_unit >=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThan(Integer value) {
            addCriterion("price_unit <", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThanOrEqualTo(Integer value) {
            addCriterion("price_unit <=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIn(List<Integer> values) {
            addCriterion("price_unit in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotIn(List<Integer> values) {
            addCriterion("price_unit not in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitBetween(Integer value1, Integer value2) {
            addCriterion("price_unit between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("price_unit not between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumUnitIsNull() {
            addCriterion("num_unit is null");
            return (Criteria) this;
        }

        public Criteria andNumUnitIsNotNull() {
            addCriterion("num_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNumUnitEqualTo(Integer value) {
            addCriterion("num_unit =", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitNotEqualTo(Integer value) {
            addCriterion("num_unit <>", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitGreaterThan(Integer value) {
            addCriterion("num_unit >", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_unit >=", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitLessThan(Integer value) {
            addCriterion("num_unit <", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitLessThanOrEqualTo(Integer value) {
            addCriterion("num_unit <=", value, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitIn(List<Integer> values) {
            addCriterion("num_unit in", values, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitNotIn(List<Integer> values) {
            addCriterion("num_unit not in", values, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitBetween(Integer value1, Integer value2) {
            addCriterion("num_unit between", value1, value2, "numUnit");
            return (Criteria) this;
        }

        public Criteria andNumUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("num_unit not between", value1, value2, "numUnit");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(Integer value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(Integer value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(Integer value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(Integer value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(Integer value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<Integer> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<Integer> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(Integer value1, Integer value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNull() {
            addCriterion("cycle_unit is null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIsNotNull() {
            addCriterion("cycle_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCycleUnitEqualTo(Integer value) {
            addCriterion("cycle_unit =", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotEqualTo(Integer value) {
            addCriterion("cycle_unit <>", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThan(Integer value) {
            addCriterion("cycle_unit >", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit >=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThan(Integer value) {
            addCriterion("cycle_unit <", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_unit <=", value, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitIn(List<Integer> values) {
            addCriterion("cycle_unit in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotIn(List<Integer> values) {
            addCriterion("cycle_unit not in", values, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andCycleUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_unit not between", value1, value2, "cycleUnit");
            return (Criteria) this;
        }

        public Criteria andUpordownIsNull() {
            addCriterion("upOrDown is null");
            return (Criteria) this;
        }

        public Criteria andUpordownIsNotNull() {
            addCriterion("upOrDown is not null");
            return (Criteria) this;
        }

        public Criteria andUpordownEqualTo(Integer value) {
            addCriterion("upOrDown =", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownNotEqualTo(Integer value) {
            addCriterion("upOrDown <>", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownGreaterThan(Integer value) {
            addCriterion("upOrDown >", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownGreaterThanOrEqualTo(Integer value) {
            addCriterion("upOrDown >=", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownLessThan(Integer value) {
            addCriterion("upOrDown <", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownLessThanOrEqualTo(Integer value) {
            addCriterion("upOrDown <=", value, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownIn(List<Integer> values) {
            addCriterion("upOrDown in", values, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownNotIn(List<Integer> values) {
            addCriterion("upOrDown not in", values, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownBetween(Integer value1, Integer value2) {
            addCriterion("upOrDown between", value1, value2, "upordown");
            return (Criteria) this;
        }

        public Criteria andUpordownNotBetween(Integer value1, Integer value2) {
            addCriterion("upOrDown not between", value1, value2, "upordown");
            return (Criteria) this;
        }

        public Criteria andSubmitByIsNull() {
            addCriterion("submit_by is null");
            return (Criteria) this;
        }

        public Criteria andSubmitByIsNotNull() {
            addCriterion("submit_by is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitByEqualTo(String value) {
            addCriterion("submit_by =", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotEqualTo(String value) {
            addCriterion("submit_by <>", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByGreaterThan(String value) {
            addCriterion("submit_by >", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByGreaterThanOrEqualTo(String value) {
            addCriterion("submit_by >=", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLessThan(String value) {
            addCriterion("submit_by <", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLessThanOrEqualTo(String value) {
            addCriterion("submit_by <=", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLike(String value) {
            addCriterion("submit_by like", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotLike(String value) {
            addCriterion("submit_by not like", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByIn(List<String> values) {
            addCriterion("submit_by in", values, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotIn(List<String> values) {
            addCriterion("submit_by not in", values, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByBetween(String value1, String value2) {
            addCriterion("submit_by between", value1, value2, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotBetween(String value1, String value2) {
            addCriterion("submit_by not between", value1, value2, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusIsNull() {
            addCriterion("first_check_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusIsNotNull() {
            addCriterion("first_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusEqualTo(Integer value) {
            addCriterion("first_check_status =", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusNotEqualTo(Integer value) {
            addCriterion("first_check_status <>", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusGreaterThan(Integer value) {
            addCriterion("first_check_status >", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_check_status >=", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusLessThan(Integer value) {
            addCriterion("first_check_status <", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("first_check_status <=", value, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusIn(List<Integer> values) {
            addCriterion("first_check_status in", values, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusNotIn(List<Integer> values) {
            addCriterion("first_check_status not in", values, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("first_check_status between", value1, value2, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("first_check_status not between", value1, value2, "firstCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusIsNull() {
            addCriterion("final_check_status is null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusIsNotNull() {
            addCriterion("final_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusEqualTo(Integer value) {
            addCriterion("final_check_status =", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusNotEqualTo(Integer value) {
            addCriterion("final_check_status <>", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusGreaterThan(Integer value) {
            addCriterion("final_check_status >", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_check_status >=", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusLessThan(Integer value) {
            addCriterion("final_check_status <", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("final_check_status <=", value, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusIn(List<Integer> values) {
            addCriterion("final_check_status in", values, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusNotIn(List<Integer> values) {
            addCriterion("final_check_status not in", values, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("final_check_status between", value1, value2, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinalCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("final_check_status not between", value1, value2, "finalCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeIsNull() {
            addCriterion("first_check_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeIsNotNull() {
            addCriterion("first_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeEqualTo(Date value) {
            addCriterion("first_check_time =", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeNotEqualTo(Date value) {
            addCriterion("first_check_time <>", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeGreaterThan(Date value) {
            addCriterion("first_check_time >", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_check_time >=", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeLessThan(Date value) {
            addCriterion("first_check_time <", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_check_time <=", value, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeIn(List<Date> values) {
            addCriterion("first_check_time in", values, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeNotIn(List<Date> values) {
            addCriterion("first_check_time not in", values, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeBetween(Date value1, Date value2) {
            addCriterion("first_check_time between", value1, value2, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFirstCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_check_time not between", value1, value2, "firstCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeIsNull() {
            addCriterion("final_check_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeIsNotNull() {
            addCriterion("final_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeEqualTo(Date value) {
            addCriterion("final_check_time =", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeNotEqualTo(Date value) {
            addCriterion("final_check_time <>", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeGreaterThan(Date value) {
            addCriterion("final_check_time >", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("final_check_time >=", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeLessThan(Date value) {
            addCriterion("final_check_time <", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("final_check_time <=", value, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeIn(List<Date> values) {
            addCriterion("final_check_time in", values, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeNotIn(List<Date> values) {
            addCriterion("final_check_time not in", values, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeBetween(Date value1, Date value2) {
            addCriterion("final_check_time between", value1, value2, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinalCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("final_check_time not between", value1, value2, "finalCheckTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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