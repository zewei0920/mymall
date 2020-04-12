package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PmsMemberPrice implements Serializable {
    private Long id;

    private Long productId;

    private Long memberLevelId;

    private BigDecimal memberPrice;

    private String memberLevelName;

    private static final long serialVersionUID = 1L;

    public PmsMemberPrice(Long id, Long productId, Long memberLevelId, BigDecimal memberPrice, String memberLevelName) {
        this.id = id;
        this.productId = productId;
        this.memberLevelId = memberLevelId;
        this.memberPrice = memberPrice;
        this.memberLevelName = memberLevelName;
    }

    public PmsMemberPrice() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}