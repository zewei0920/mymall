package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PmsComment implements Serializable {
    private Long id;

    private Long productId;

    private String memberNickName;

    private String productName;

    private Integer star;

    private String memberIp;

    private Date createTime;

    private Integer showStatus;

    private String productAttribute;

    private Integer collectCouont;

    private Integer readCount;

    private String pics;

    private String memberIcon;

    private Integer replayCount;

    private String content;

    private static final long serialVersionUID = 1L;

    public PmsComment(Long id, Long productId, String memberNickName, String productName, Integer star, String memberIp, Date createTime, Integer showStatus, String productAttribute, Integer collectCouont, Integer readCount, String pics, String memberIcon, Integer replayCount) {
        this.id = id;
        this.productId = productId;
        this.memberNickName = memberNickName;
        this.productName = productName;
        this.star = star;
        this.memberIp = memberIp;
        this.createTime = createTime;
        this.showStatus = showStatus;
        this.productAttribute = productAttribute;
        this.collectCouont = collectCouont;
        this.readCount = readCount;
        this.pics = pics;
        this.memberIcon = memberIcon;
        this.replayCount = replayCount;
    }

    public PmsComment(Long id, Long productId, String memberNickName, String productName, Integer star, String memberIp, Date createTime, Integer showStatus, String productAttribute, Integer collectCouont, Integer readCount, String pics, String memberIcon, Integer replayCount, String content) {
        this.id = id;
        this.productId = productId;
        this.memberNickName = memberNickName;
        this.productName = productName;
        this.star = star;
        this.memberIp = memberIp;
        this.createTime = createTime;
        this.showStatus = showStatus;
        this.productAttribute = productAttribute;
        this.collectCouont = collectCouont;
        this.readCount = readCount;
        this.pics = pics;
        this.memberIcon = memberIcon;
        this.replayCount = replayCount;
        this.content = content;
    }

    public PmsComment() {
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

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp == null ? null : memberIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", productAttribute=").append(productAttribute);
        sb.append(", collectCouont=").append(collectCouont);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}