package com.jzhl.queue.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoorFaceDeviceRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DoorFaceDeviceRelationExample() {
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

        public Criteria andFaceIdIsNull() {
            addCriterion("face_id is null");
            return (Criteria) this;
        }

        public Criteria andFaceIdIsNotNull() {
            addCriterion("face_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaceIdEqualTo(Integer value) {
            addCriterion("face_id =", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotEqualTo(Integer value) {
            addCriterion("face_id <>", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThan(Integer value) {
            addCriterion("face_id >", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("face_id >=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThan(Integer value) {
            addCriterion("face_id <", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("face_id <=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdIn(List<Integer> values) {
            addCriterion("face_id in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotIn(List<Integer> values) {
            addCriterion("face_id not in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdBetween(Integer value1, Integer value2) {
            addCriterion("face_id between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("face_id not between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdIsNull() {
            addCriterion("door_sub_device_id is null");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdIsNotNull() {
            addCriterion("door_sub_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdEqualTo(Integer value) {
            addCriterion("door_sub_device_id =", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdNotEqualTo(Integer value) {
            addCriterion("door_sub_device_id <>", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdGreaterThan(Integer value) {
            addCriterion("door_sub_device_id >", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_sub_device_id >=", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdLessThan(Integer value) {
            addCriterion("door_sub_device_id <", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("door_sub_device_id <=", value, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdIn(List<Integer> values) {
            addCriterion("door_sub_device_id in", values, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdNotIn(List<Integer> values) {
            addCriterion("door_sub_device_id not in", values, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("door_sub_device_id between", value1, value2, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andDoorSubDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("door_sub_device_id not between", value1, value2, "doorSubDeviceId");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexIsNull() {
            addCriterion("julong_lib_index is null");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexIsNotNull() {
            addCriterion("julong_lib_index is not null");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexEqualTo(Integer value) {
            addCriterion("julong_lib_index =", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexNotEqualTo(Integer value) {
            addCriterion("julong_lib_index <>", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexGreaterThan(Integer value) {
            addCriterion("julong_lib_index >", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("julong_lib_index >=", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexLessThan(Integer value) {
            addCriterion("julong_lib_index <", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexLessThanOrEqualTo(Integer value) {
            addCriterion("julong_lib_index <=", value, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexIn(List<Integer> values) {
            addCriterion("julong_lib_index in", values, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexNotIn(List<Integer> values) {
            addCriterion("julong_lib_index not in", values, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexBetween(Integer value1, Integer value2) {
            addCriterion("julong_lib_index between", value1, value2, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongLibIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("julong_lib_index not between", value1, value2, "julongLibIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexIsNull() {
            addCriterion("julong_flie_index is null");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexIsNotNull() {
            addCriterion("julong_flie_index is not null");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexEqualTo(Integer value) {
            addCriterion("julong_flie_index =", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexNotEqualTo(Integer value) {
            addCriterion("julong_flie_index <>", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexGreaterThan(Integer value) {
            addCriterion("julong_flie_index >", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("julong_flie_index >=", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexLessThan(Integer value) {
            addCriterion("julong_flie_index <", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexLessThanOrEqualTo(Integer value) {
            addCriterion("julong_flie_index <=", value, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexIn(List<Integer> values) {
            addCriterion("julong_flie_index in", values, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexNotIn(List<Integer> values) {
            addCriterion("julong_flie_index not in", values, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexBetween(Integer value1, Integer value2) {
            addCriterion("julong_flie_index between", value1, value2, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongFlieIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("julong_flie_index not between", value1, value2, "julongFlieIndex");
            return (Criteria) this;
        }

        public Criteria andJulongModeIsNull() {
            addCriterion("julong_mode is null");
            return (Criteria) this;
        }

        public Criteria andJulongModeIsNotNull() {
            addCriterion("julong_mode is not null");
            return (Criteria) this;
        }

        public Criteria andJulongModeEqualTo(Integer value) {
            addCriterion("julong_mode =", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeNotEqualTo(Integer value) {
            addCriterion("julong_mode <>", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeGreaterThan(Integer value) {
            addCriterion("julong_mode >", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("julong_mode >=", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeLessThan(Integer value) {
            addCriterion("julong_mode <", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeLessThanOrEqualTo(Integer value) {
            addCriterion("julong_mode <=", value, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeIn(List<Integer> values) {
            addCriterion("julong_mode in", values, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeNotIn(List<Integer> values) {
            addCriterion("julong_mode not in", values, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeBetween(Integer value1, Integer value2) {
            addCriterion("julong_mode between", value1, value2, "julongMode");
            return (Criteria) this;
        }

        public Criteria andJulongModeNotBetween(Integer value1, Integer value2) {
            addCriterion("julong_mode not between", value1, value2, "julongMode");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("is_check like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("is_check not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
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