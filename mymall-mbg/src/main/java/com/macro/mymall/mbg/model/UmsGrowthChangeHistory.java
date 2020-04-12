package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UmsGrowthChangeHistory implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    private Integer changeType;

    private Integer changeCount;

    private String operateMan;

    private String operateNote;

    private Integer sourceType;

    private static final long serialVersionUID = 1L;

    public UmsGrowthChangeHistory(Long id, Long memberId, Date createTime, Integer changeType, Integer changeCount, String operateMan, String operateNote, Integer sourceType) {
        this.id = id;
        this.memberId = memberId;
        this.createTime = createTime;
        this.changeType = changeType;
        this.changeCount = changeCount;
        this.operateMan = operateMan;
        this.operateNote = operateNote;
        this.sourceType = sourceType;
    }

    public UmsGrowthChangeHistory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", changeType=").append(changeType);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", operateNote=").append(operateNote);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}