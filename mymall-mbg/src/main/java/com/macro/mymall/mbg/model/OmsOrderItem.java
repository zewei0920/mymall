package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OmsOrderItem implements Serializable {
    private Long id;

    private Long orderId;

    private String orderSn;

    private Long productId;

    private String productPic;

    private String productName;

    private String productBrand;

    private String productSn;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private Long productSkuId;

    private String productSkuCode;

    private Long productCategoryId;

    private String promotionName;

    private BigDecimal promotionAmount;

    private BigDecimal couponAmount;

    private BigDecimal integrationAmount;

    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;

    private String productAttr;

    private static final long serialVersionUID = 1L;

    public OmsOrderItem(Long id, Long orderId, String orderSn, Long productId, String productPic, String productName, String productBrand, String productSn, BigDecimal productPrice, Integer productQuantity, Long productSkuId, String productSkuCode, Long productCategoryId, String promotionName, BigDecimal promotionAmount, BigDecimal couponAmount, BigDecimal integrationAmount, BigDecimal realAmount, Integer giftIntegration, Integer giftGrowth, String productAttr) {
        this.id = id;
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.productId = productId;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productSn = productSn;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productSkuId = productSkuId;
        this.productSkuCode = productSkuCode;
        this.productCategoryId = productCategoryId;
        this.promotionName = promotionName;
        this.promotionAmount = promotionAmount;
        this.couponAmount = couponAmount;
        this.integrationAmount = integrationAmount;
        this.realAmount = realAmount;
        this.giftIntegration = giftIntegration;
        this.giftGrowth = giftGrowth;
        this.productAttr = productAttr;
    }

    public OmsOrderItem() {
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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode == null ? null : productSkuCode.trim();
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", productId=").append(productId);
        sb.append(", productPic=").append(productPic);
        sb.append(", productName=").append(productName);
        sb.append(", productBrand=").append(productBrand);
        sb.append(", productSn=").append(productSn);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append(", productSkuId=").append(productSkuId);
        sb.append(", productSkuCode=").append(productSkuCode);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", promotionName=").append(promotionName);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", productAttr=").append(productAttr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}