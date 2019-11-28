package com.jzhl.queue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoorFaceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DoorFaceInfoExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andHouseholdsIdIsNull() {
            addCriterion("households_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdIsNotNull() {
            addCriterion("households_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdEqualTo(Integer value) {
            addCriterion("households_id =", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdNotEqualTo(Integer value) {
            addCriterion("households_id <>", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdGreaterThan(Integer value) {
            addCriterion("households_id >", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("households_id >=", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdLessThan(Integer value) {
            addCriterion("households_id <", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdLessThanOrEqualTo(Integer value) {
            addCriterion("households_id <=", value, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdIn(List<Integer> values) {
            addCriterion("households_id in", values, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdNotIn(List<Integer> values) {
            addCriterion("households_id not in", values, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdBetween(Integer value1, Integer value2) {
            addCriterion("households_id between", value1, value2, "householdsId");
            return (Criteria) this;
        }

        public Criteria andHouseholdsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("households_id not between", value1, value2, "householdsId");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumIsNull() {
            addCriterion("face_img_num is null");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumIsNotNull() {
            addCriterion("face_img_num is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumEqualTo(String value) {
            addCriterion("face_img_num =", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumNotEqualTo(String value) {
            addCriterion("face_img_num <>", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumGreaterThan(String value) {
            addCriterion("face_img_num >", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumGreaterThanOrEqualTo(String value) {
            addCriterion("face_img_num >=", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumLessThan(String value) {
            addCriterion("face_img_num <", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumLessThanOrEqualTo(String value) {
            addCriterion("face_img_num <=", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumLike(String value) {
            addCriterion("face_img_num like", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumNotLike(String value) {
            addCriterion("face_img_num not like", value, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumIn(List<String> values) {
            addCriterion("face_img_num in", values, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumNotIn(List<String> values) {
            addCriterion("face_img_num not in", values, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumBetween(String value1, String value2) {
            addCriterion("face_img_num between", value1, value2, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgNumNotBetween(String value1, String value2) {
            addCriterion("face_img_num not between", value1, value2, "faceImgNum");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlIsNull() {
            addCriterion("face_img_url is null");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlIsNotNull() {
            addCriterion("face_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlEqualTo(String value) {
            addCriterion("face_img_url =", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlNotEqualTo(String value) {
            addCriterion("face_img_url <>", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlGreaterThan(String value) {
            addCriterion("face_img_url >", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("face_img_url >=", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlLessThan(String value) {
            addCriterion("face_img_url <", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlLessThanOrEqualTo(String value) {
            addCriterion("face_img_url <=", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlLike(String value) {
            addCriterion("face_img_url like", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlNotLike(String value) {
            addCriterion("face_img_url not like", value, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlIn(List<String> values) {
            addCriterion("face_img_url in", values, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlNotIn(List<String> values) {
            addCriterion("face_img_url not in", values, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlBetween(String value1, String value2) {
            addCriterion("face_img_url between", value1, value2, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceImgUrlNotBetween(String value1, String value2) {
            addCriterion("face_img_url not between", value1, value2, "faceImgUrl");
            return (Criteria) this;
        }

        public Criteria andFaceNameIsNull() {
            addCriterion("face_name is null");
            return (Criteria) this;
        }

        public Criteria andFaceNameIsNotNull() {
            addCriterion("face_name is not null");
            return (Criteria) this;
        }

        public Criteria andFaceNameEqualTo(String value) {
            addCriterion("face_name =", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotEqualTo(String value) {
            addCriterion("face_name <>", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameGreaterThan(String value) {
            addCriterion("face_name >", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("face_name >=", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLessThan(String value) {
            addCriterion("face_name <", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLessThanOrEqualTo(String value) {
            addCriterion("face_name <=", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameLike(String value) {
            addCriterion("face_name like", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotLike(String value) {
            addCriterion("face_name not like", value, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameIn(List<String> values) {
            addCriterion("face_name in", values, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotIn(List<String> values) {
            addCriterion("face_name not in", values, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameBetween(String value1, String value2) {
            addCriterion("face_name between", value1, value2, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceNameNotBetween(String value1, String value2) {
            addCriterion("face_name not between", value1, value2, "faceName");
            return (Criteria) this;
        }

        public Criteria andFaceTypeIsNull() {
            addCriterion("face_type is null");
            return (Criteria) this;
        }

        public Criteria andFaceTypeIsNotNull() {
            addCriterion("face_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTypeEqualTo(String value) {
            addCriterion("face_type =", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeNotEqualTo(String value) {
            addCriterion("face_type <>", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeGreaterThan(String value) {
            addCriterion("face_type >", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("face_type >=", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeLessThan(String value) {
            addCriterion("face_type <", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeLessThanOrEqualTo(String value) {
            addCriterion("face_type <=", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeLike(String value) {
            addCriterion("face_type like", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeNotLike(String value) {
            addCriterion("face_type not like", value, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeIn(List<String> values) {
            addCriterion("face_type in", values, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeNotIn(List<String> values) {
            addCriterion("face_type not in", values, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeBetween(String value1, String value2) {
            addCriterion("face_type between", value1, value2, "faceType");
            return (Criteria) this;
        }

        public Criteria andFaceTypeNotBetween(String value1, String value2) {
            addCriterion("face_type not between", value1, value2, "faceType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeIsNull() {
            addCriterion("sub_face_database_type is null");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeIsNotNull() {
            addCriterion("sub_face_database_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeEqualTo(String value) {
            addCriterion("sub_face_database_type =", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeNotEqualTo(String value) {
            addCriterion("sub_face_database_type <>", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeGreaterThan(String value) {
            addCriterion("sub_face_database_type >", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_face_database_type >=", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeLessThan(String value) {
            addCriterion("sub_face_database_type <", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeLessThanOrEqualTo(String value) {
            addCriterion("sub_face_database_type <=", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeLike(String value) {
            addCriterion("sub_face_database_type like", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeNotLike(String value) {
            addCriterion("sub_face_database_type not like", value, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeIn(List<String> values) {
            addCriterion("sub_face_database_type in", values, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeNotIn(List<String> values) {
            addCriterion("sub_face_database_type not in", values, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeBetween(String value1, String value2) {
            addCriterion("sub_face_database_type between", value1, value2, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTypeNotBetween(String value1, String value2) {
            addCriterion("sub_face_database_type not between", value1, value2, "subFaceDatabaseType");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeIsNull() {
            addCriterion("sub_face_database_time is null");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeIsNotNull() {
            addCriterion("sub_face_database_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeEqualTo(Date value) {
            addCriterion("sub_face_database_time =", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeNotEqualTo(Date value) {
            addCriterion("sub_face_database_time <>", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeGreaterThan(Date value) {
            addCriterion("sub_face_database_time >", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sub_face_database_time >=", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeLessThan(Date value) {
            addCriterion("sub_face_database_time <", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("sub_face_database_time <=", value, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeIn(List<Date> values) {
            addCriterion("sub_face_database_time in", values, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeNotIn(List<Date> values) {
            addCriterion("sub_face_database_time not in", values, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeBetween(Date value1, Date value2) {
            addCriterion("sub_face_database_time between", value1, value2, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andSubFaceDatabaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("sub_face_database_time not between", value1, value2, "subFaceDatabaseTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNull() {
            addCriterion("build_userid is null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNotNull() {
            addCriterion("build_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridEqualTo(Integer value) {
            addCriterion("build_userid =", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotEqualTo(Integer value) {
            addCriterion("build_userid <>", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThan(Integer value) {
            addCriterion("build_userid >", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_userid >=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThan(Integer value) {
            addCriterion("build_userid <", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThanOrEqualTo(Integer value) {
            addCriterion("build_userid <=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIn(List<Integer> values) {
            addCriterion("build_userid in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotIn(List<Integer> values) {
            addCriterion("build_userid not in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridBetween(Integer value1, Integer value2) {
            addCriterion("build_userid between", value1, value2, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("build_userid not between", value1, value2, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNull() {
            addCriterion("build_time is null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNotNull() {
            addCriterion("build_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeEqualTo(Date value) {
            addCriterion("build_time =", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotEqualTo(Date value) {
            addCriterion("build_time <>", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThan(Date value) {
            addCriterion("build_time >", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("build_time >=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThan(Date value) {
            addCriterion("build_time <", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThanOrEqualTo(Date value) {
            addCriterion("build_time <=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIn(List<Date> values) {
            addCriterion("build_time in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotIn(List<Date> values) {
            addCriterion("build_time not in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeBetween(Date value1, Date value2) {
            addCriterion("build_time between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotBetween(Date value1, Date value2) {
            addCriterion("build_time not between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNull() {
            addCriterion("update_userid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNotNull() {
            addCriterion("update_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridEqualTo(Integer value) {
            addCriterion("update_userid =", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotEqualTo(Integer value) {
            addCriterion("update_userid <>", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThan(Integer value) {
            addCriterion("update_userid >", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_userid >=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThan(Integer value) {
            addCriterion("update_userid <", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("update_userid <=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIn(List<Integer> values) {
            addCriterion("update_userid in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotIn(List<Integer> values) {
            addCriterion("update_userid not in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridBetween(Integer value1, Integer value2) {
            addCriterion("update_userid between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("update_userid not between", value1, value2, "updateUserid");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }
    }

    /**
     */
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