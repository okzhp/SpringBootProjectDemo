package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CenterSupplyProduct implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    @ApiModelProperty(value = "产品类目id")
    private Integer productTypeId;

    @ApiModelProperty(value = "产品名称")
    private String name;

    @ApiModelProperty(value = "金额")
    private BigDecimal price;

    @ApiModelProperty(value = "金额单位 字典值")
    private Integer priceUnit;

    @ApiModelProperty(value = "数量")
    private Integer num;

    @ApiModelProperty(value = "数量单位 字典值")
    private Integer numUnit;

    @ApiModelProperty(value = "交付周期")
    private Integer cycle;

    @ApiModelProperty(value = "交付周期单位 字典值")
    private Integer cycleUnit;

    @ApiModelProperty(value = "1上架 2下架")
    private Integer upordown;

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

    @ApiModelProperty(value = "产品详情")
    private String detail;

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

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Integer priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNumUnit() {
        return numUnit;
    }

    public void setNumUnit(Integer numUnit) {
        this.numUnit = numUnit;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Integer getCycleUnit() {
        return cycleUnit;
    }

    public void setCycleUnit(Integer cycleUnit) {
        this.cycleUnit = cycleUnit;
    }

    public Integer getUpordown() {
        return upordown;
    }

    public void setUpordown(Integer upordown) {
        this.upordown = upordown;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", productTypeId=").append(productTypeId);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", priceUnit=").append(priceUnit);
        sb.append(", num=").append(num);
        sb.append(", numUnit=").append(numUnit);
        sb.append(", cycle=").append(cycle);
        sb.append(", cycleUnit=").append(cycleUnit);
        sb.append(", upordown=").append(upordown);
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
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}