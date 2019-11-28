package com.jzhl.queue.model;

import java.io.Serializable;
import java.util.Date;

/**
 * door_face_info
 * @author 
 */
public class DoorFaceInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 联系人id
     */
    private Integer householdsId;

    /**
     * 人脸图片编号或者名称 12位数字
     */
    private String faceImgNum;

    /**
     * 人脸url
     */
    private String faceImgUrl;

    /**
     * 人脸数据名称
     */
    private String faceName;

    /**
     * 人脸类型
     */
    private String faceType;

    /**
     * 添加至服务器人脸库(0未添加 1已添加)
     */
    private String subFaceDatabaseType;

    /**
     * 添加人脸至服务器人脸库时间
     */
    private Date subFaceDatabaseTime;

    /**
     * 状态（0正常 1停用）
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

    /**
     * 人脸特征值
     */
    private String faceData;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseholdsId() {
        return householdsId;
    }

    public void setHouseholdsId(Integer householdsId) {
        this.householdsId = householdsId;
    }

    public String getFaceImgNum() {
        return faceImgNum;
    }

    public void setFaceImgNum(String faceImgNum) {
        this.faceImgNum = faceImgNum;
    }

    public String getFaceImgUrl() {
        return faceImgUrl;
    }

    public void setFaceImgUrl(String faceImgUrl) {
        this.faceImgUrl = faceImgUrl;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getFaceType() {
        return faceType;
    }

    public void setFaceType(String faceType) {
        this.faceType = faceType;
    }

    public String getSubFaceDatabaseType() {
        return subFaceDatabaseType;
    }

    public void setSubFaceDatabaseType(String subFaceDatabaseType) {
        this.subFaceDatabaseType = subFaceDatabaseType;
    }

    public Date getSubFaceDatabaseTime() {
        return subFaceDatabaseTime;
    }

    public void setSubFaceDatabaseTime(Date subFaceDatabaseTime) {
        this.subFaceDatabaseTime = subFaceDatabaseTime;
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

    public String getFaceData() {
        return faceData;
    }

    public void setFaceData(String faceData) {
        this.faceData = faceData;
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
        DoorFaceInfo other = (DoorFaceInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHouseholdsId() == null ? other.getHouseholdsId() == null : this.getHouseholdsId().equals(other.getHouseholdsId()))
            && (this.getFaceImgNum() == null ? other.getFaceImgNum() == null : this.getFaceImgNum().equals(other.getFaceImgNum()))
            && (this.getFaceImgUrl() == null ? other.getFaceImgUrl() == null : this.getFaceImgUrl().equals(other.getFaceImgUrl()))
            && (this.getFaceName() == null ? other.getFaceName() == null : this.getFaceName().equals(other.getFaceName()))
            && (this.getFaceType() == null ? other.getFaceType() == null : this.getFaceType().equals(other.getFaceType()))
            && (this.getSubFaceDatabaseType() == null ? other.getSubFaceDatabaseType() == null : this.getSubFaceDatabaseType().equals(other.getSubFaceDatabaseType()))
            && (this.getSubFaceDatabaseTime() == null ? other.getSubFaceDatabaseTime() == null : this.getSubFaceDatabaseTime().equals(other.getSubFaceDatabaseTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getBuildUserid() == null ? other.getBuildUserid() == null : this.getBuildUserid().equals(other.getBuildUserid()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getFaceData() == null ? other.getFaceData() == null : this.getFaceData().equals(other.getFaceData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHouseholdsId() == null) ? 0 : getHouseholdsId().hashCode());
        result = prime * result + ((getFaceImgNum() == null) ? 0 : getFaceImgNum().hashCode());
        result = prime * result + ((getFaceImgUrl() == null) ? 0 : getFaceImgUrl().hashCode());
        result = prime * result + ((getFaceName() == null) ? 0 : getFaceName().hashCode());
        result = prime * result + ((getFaceType() == null) ? 0 : getFaceType().hashCode());
        result = prime * result + ((getSubFaceDatabaseType() == null) ? 0 : getSubFaceDatabaseType().hashCode());
        result = prime * result + ((getSubFaceDatabaseTime() == null) ? 0 : getSubFaceDatabaseTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getBuildUserid() == null) ? 0 : getBuildUserid().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getFaceData() == null) ? 0 : getFaceData().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", householdsId=").append(householdsId);
        sb.append(", faceImgNum=").append(faceImgNum);
        sb.append(", faceImgUrl=").append(faceImgUrl);
        sb.append(", faceName=").append(faceName);
        sb.append(", faceType=").append(faceType);
        sb.append(", subFaceDatabaseType=").append(subFaceDatabaseType);
        sb.append(", subFaceDatabaseTime=").append(subFaceDatabaseTime);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", buildUserid=").append(buildUserid);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", companyId=").append(companyId);
        sb.append(", faceData=").append(faceData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}