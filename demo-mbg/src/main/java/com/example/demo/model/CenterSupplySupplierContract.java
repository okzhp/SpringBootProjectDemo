package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CenterSupplySupplierContract implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    @ApiModelProperty(value = "合同pdf")
    private String url;

    @ApiModelProperty(value = "合同类型 1合作合同 2补充协议")
    private Integer type;

    @ApiModelProperty(value = "合同编号")
    private String contractCode;

    @ApiModelProperty(value = "主体名称")
    private String mainBodyName;

    @ApiModelProperty(value = "起始日期")
    private Date startTime;

    @ApiModelProperty(value = "终止日期")
    private Date endTime;

    @ApiModelProperty(value = "续期方式 1人工 2自动")
    private Integer renewalType;

    @ApiModelProperty(value = "自动续期期限")
    private Integer renewalTime;

    @ApiModelProperty(value = "自动续期期限单位 1天 2周 3月 4年")
    private Integer renewalTimeUnit;

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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getMainBodyName() {
        return mainBodyName;
    }

    public void setMainBodyName(String mainBodyName) {
        this.mainBodyName = mainBodyName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getRenewalType() {
        return renewalType;
    }

    public void setRenewalType(Integer renewalType) {
        this.renewalType = renewalType;
    }

    public Integer getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(Integer renewalTime) {
        this.renewalTime = renewalTime;
    }

    public Integer getRenewalTimeUnit() {
        return renewalTimeUnit;
    }

    public void setRenewalTimeUnit(Integer renewalTimeUnit) {
        this.renewalTimeUnit = renewalTimeUnit;
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
        sb.append(", supplierId=").append(supplierId);
        sb.append(", url=").append(url);
        sb.append(", type=").append(type);
        sb.append(", contractCode=").append(contractCode);
        sb.append(", mainBodyName=").append(mainBodyName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", renewalType=").append(renewalType);
        sb.append(", renewalTime=").append(renewalTime);
        sb.append(", renewalTimeUnit=").append(renewalTimeUnit);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}