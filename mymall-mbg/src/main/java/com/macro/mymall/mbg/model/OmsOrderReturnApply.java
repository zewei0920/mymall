package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderReturnApply implements Serializable {
    private Long id;

    private Long orderId;

    private Long companyAddressId;

    private Long productId;

    private String orderSn;

    private Date createTime;

    private String memberUsername;

    private BigDecimal returnAmount;

    private String returnName;

    private String returnPhone;

    private Integer status;

    private Date handleTime;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productAttr;

    private Integer productCount;

    private BigDecimal productPrice;

    private BigDecimal productRealPrice;

    private String reason;

    private String description;

    private String proofPics;

    private String handleNote;

    private String handleMan;

    private String receiveMan;

    private Date receiveTime;

    private String receiveNote;

    private static final long serialVersionUID = 1L;

    public OmsOrderReturnApply(Long id, Long orderId, Long companyAddressId, Long productId, String orderSn, Date createTime, String memberUsername, BigDecimal returnAmount, String returnName, String returnPhone, Integer status, Date handleTime, String productPic, String productName, String productBrand, String productAttr, Integer productCount, BigDecimal productPrice, BigDecimal productRealPrice, String reason, String description, String proofPics, String handleNote, String handleMan, String receiveMan, Date receiveTime, String receiveNote) {
        this.id = id;
        this.orderId = orderId;
        this.companyAddressId = companyAddressId;
        this.productId = productId;
        this.orderSn = orderSn;
        this.createTime = createTime;
        this.memberUsername = memberUsername;
        this.returnAmount = returnAmount;
        this.returnName = returnName;
        this.returnPhone = returnPhone;
        this.status = status;
        this.handleTime = handleTime;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productAttr = productAttr;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.productRealPrice = productRealPrice;
        this.reason = reason;
        this.description = description;
        this.proofPics = proofPics;
        this.handleNote = handleNote;
        this.handleMan = handleMan;
        this.receiveMan = receiveMan;
        this.receiveTime = receiveTime;
        this.receiveNote = receiveNote;
    }

    public OmsOrderReturnApply() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName == null ? null : returnName.trim();
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone == null ? null : returnPhone.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics == null ? null : proofPics.trim();
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote == null ? null : handleNote.trim();
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan == null ? null : handleMan.trim();
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan == null ? null : receiveMan.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote == null ? null : receiveNote.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", companyAddressId=").append(companyAddressId);
        sb.append(", productId=").append(productId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", productCount=").append(productCount);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productRealPrice=").append(productRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description=").append(description);
        sb.append(", proofPics=").append(proofPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}