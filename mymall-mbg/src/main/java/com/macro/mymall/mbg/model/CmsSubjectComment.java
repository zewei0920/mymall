package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CmsSubjectComment implements Serializable {
    private Long id;

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    private Integer showStatus;

    private static final long serialVersionUID = 1L;

    public CmsSubjectComment(Long id, Long subjectId, String memberNickName, String memberIcon, String content, Date createTime, Integer showStatus) {
        this.id = id;
        this.subjectId = subjectId;
        this.memberNickName = memberNickName;
        this.memberIcon = memberIcon;
        this.content = content;
        this.createTime = createTime;
        this.showStatus = showStatus;
    }

    public CmsSubjectComment() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName == null ? null : memberNickName.trim();
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon == null ? null : memberIcon.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}