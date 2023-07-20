package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CenterSupplySupplier implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @ApiModelProperty(value = "机构名称")
    private String name;

    @ApiModelProperty(value = "主体类型 字典值")
    private Integer mainBodyType;

    @ApiModelProperty(value = "供应商类别id")
    private Integer supplierType;

    @ApiModelProperty(value = "所在国家id")
    private Integer countryId;

    @ApiModelProperty(value = "通讯地址")
    private String address;

    @ApiModelProperty(value = "电话")
    private String telephone;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "官网")
    private String website;

    @ApiModelProperty(value = "邮编")
    private String postalCode;

    @ApiModelProperty(value = "机构简介")
    private String briefIntroduction;

    @ApiModelProperty(value = "提交人")
    private String submitBy;

    @ApiModelProperty(value = "提交时间")
    private Date submitTime;

    @ApiModelProperty(value = "初审状态 1通过 2不通过")
    private Integer firstCheckStatus;

    @ApiModelProperty(value = "终审状态 1通过 2不通过")
    private Integer finalCheckStatus;

    @ApiModelProperty(value = "初审审核时间")
    private Date firstCheckTime;

    @ApiModelProperty(value = "终审审核时间")
    private Date finalCheckTime;

    @ApiModelProperty(value = "状态 1草稿箱、2待初审、3待复审、4驳回、5通过")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "修改人")
    private String updateBy;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMainBodyType() {
        return mainBodyType;
    }

    public void setMainBodyType(Integer mainBodyType) {
        this.mainBodyType = mainBodyType;
    }

    public Integer getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public String getSubmitBy() {
        return submitBy;
    }

    public void setSubmitBy(String submitBy) {
        this.submitBy = submitBy;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getFirstCheckStatus() {
        return firstCheckStatus;
    }

    public void setFirstCheckStatus(Integer firstCheckStatus) {
        this.firstCheckStatus = firstCheckStatus;
    }

    public Integer getFinalCheckStatus() {
        return finalCheckStatus;
    }

    public void setFinalCheckStatus(Integer finalCheckStatus) {
        this.finalCheckStatus = finalCheckStatus;
    }

    public Date getFirstCheckTime() {
        return firstCheckTime;
    }

    public void setFirstCheckTime(Date firstCheckTime) {
        this.firstCheckTime = firstCheckTime;
    }

    public Date getFinalCheckTime() {
        return finalCheckTime;
    }

    public void setFinalCheckTime(Date finalCheckTime) {
        this.finalCheckTime = finalCheckTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", mainBodyType=").append(mainBodyType);
        sb.append(", supplierType=").append(supplierType);
        sb.append(", countryId=").append(countryId);
        sb.append(", address=").append(address);
        sb.append(", telephone=").append(telephone);
        sb.append(", fax=").append(fax);
        sb.append(", website=").append(website);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", briefIntroduction=").append(briefIntroduction);
        sb.append(", submitBy=").append(submitBy);
        sb.append(", submitTime=").append(submitTime);
        sb.append(", firstCheckStatus=").append(firstCheckStatus);
        sb.append(", finalCheckStatus=").append(finalCheckStatus);
        sb.append(", firstCheckTime=").append(firstCheckTime);
        sb.append(", finalCheckTime=").append(finalCheckTime);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}