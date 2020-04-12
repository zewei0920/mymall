package com.macro.mymall.mbg.model;

import java.io.Serializable;

public class SmsCouponProductCategoryRelation implements Serializable {
    private Long id;

    private Long couponId;

    private Long productCategoryId;

    private String productCategoryName;

    private String parentCategoryName;

    private static final long serialVersionUID = 1L;

    public SmsCouponProductCategoryRelation(Long id, Long couponId, Long productCategoryId, String productCategoryName, String parentCategoryName) {
        this.id = id;
        this.couponId = couponId;
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.parentCategoryName = parentCategoryName;
    }

    public SmsCouponProductCategoryRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName == null ? null : parentCategoryName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", parentCategoryName=").append(parentCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}