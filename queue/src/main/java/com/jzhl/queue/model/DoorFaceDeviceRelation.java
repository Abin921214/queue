package com.jzhl.queue.model;

import java.io.Serializable;
import java.util.Date;

/**
 * door_face_device_relation
 * @author 
 */
public class DoorFaceDeviceRelation implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 人脸图片id
     */
    private Integer faceId;

    /**
     * 子设备id
     */
    private Integer doorSubDeviceId;

    /**
     * 巨龙人脸识别设备人脸库索引
     */
    private Integer julongLibIndex;

    /**
     * 巨龙人脸识别设备人脸图片索引
     */
    private Integer julongFlieIndex;

    /**
     * 巨龙名单类别： 1：黑名单 2：白名单 3：VIP名单
     */
    private Integer julongMode;

    /**
     * 是否审核通过 0 未通过， 1 通过 （暂不起用）
     */
    private String isCheck;

    /**
     * 状态（0 已提交  1 成功 2 失败）
     */
    private String status;

    /**
     * 是否删除（0存在 1删除）
     */
    private String delFlag;

    /**
     * 创建人id
     */
    private Integer buildUserid;

    /**
     * 创建时间
     */
    private Date buildTime;

    /**
     * 修改人id
     */
    private Integer updateUserid;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 公司id
     */
    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFaceId() {
        return faceId;
    }

    public void setFaceId(Integer faceId) {
        this.faceId = faceId;
    }

    public Integer getDoorSubDeviceId() {
        return doorSubDeviceId;
    }

    public void setDoorSubDeviceId(Integer doorSubDeviceId) {
        this.doorSubDeviceId = doorSubDeviceId;
    }

    public Integer getJulongLibIndex() {
        return julongLibIndex;
    }

    public void setJulongLibIndex(Integer julongLibIndex) {
        this.julongLibIndex = julongLibIndex;
    }

    public Integer getJulongFlieIndex() {
        return julongFlieIndex;
    }

    public void setJulongFlieIndex(Integer julongFlieIndex) {
        this.julongFlieIndex = julongFlieIndex;
    }

    public Integer getJulongMode() {
        return julongMode;
    }

    public void setJulongMode(Integer julongMode) {
        this.julongMode = julongMode;
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getBuildUserid() {
        return buildUserid;
    }

    public void setBuildUserid(Integer buildUserid) {
        this.buildUserid = buildUserid;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public Integer getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DoorFaceDeviceRelation other = (DoorFaceDeviceRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFaceId() == null ? other.getFaceId() == null : this.getFaceId().equals(other.getFaceId()))
            && (this.getDoorSubDeviceId() == null ? other.getDoorSubDeviceId() == null : this.getDoorSubDeviceId().equals(other.getDoorSubDeviceId()))
            && (this.getJulongLibIndex() == null ? other.getJulongLibIndex() == null : this.getJulongLibIndex().equals(other.getJulongLibIndex()))
            && (this.getJulongFlieIndex() == null ? other.getJulongFlieIndex() == null : this.getJulongFlieIndex().equals(other.getJulongFlieIndex()))
            && (this.getJulongMode() == null ? other.getJulongMode() == null : this.getJulongMode().equals(other.getJulongMode()))
            && (this.getIsCheck() == null ? other.getIsCheck() == null : this.getIsCheck().equals(other.getIsCheck()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getBuildUserid() == null ? other.getBuildUserid() == null : this.getBuildUserid().equals(other.getBuildUserid()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        result = prime * result + ((getDoorSubDeviceId() == null) ? 0 : getDoorSubDeviceId().hashCode());
        result = prime * result + ((getJulongLibIndex() == null) ? 0 : getJulongLibIndex().hashCode());
        result = prime * result + ((getJulongFlieIndex() == null) ? 0 : getJulongFlieIndex().hashCode());
        result = prime * result + ((getJulongMode() == null) ? 0 : getJulongMode().hashCode());
        result = prime * result + ((getIsCheck() == null) ? 0 : getIsCheck().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getBuildUserid() == null) ? 0 : getBuildUserid().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", faceId=").append(faceId);
        sb.append(", doorSubDeviceId=").append(doorSubDeviceId);
        sb.append(", julongLibIndex=").append(julongLibIndex);
        sb.append(", julongFlieIndex=").append(julongFlieIndex);
        sb.append(", julongMode=").append(julongMode);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", buildUserid=").append(buildUserid);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", companyId=").append(companyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}