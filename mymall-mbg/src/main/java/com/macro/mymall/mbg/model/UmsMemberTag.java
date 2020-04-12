package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UmsMemberTag implements Serializable {
    private Long id;

    private String name;

    private Integer finishOrderCount;

    private BigDecimal finishOrderAmount;

    private static final long serialVersionUID = 1L;

    public UmsMemberTag(Long id, String name, Integer finishOrderCount, BigDecimal finishOrderAmount) {
        this.id = id;
        this.name = name;
        this.finishOrderCount = finishOrderCount;
        this.finishOrderAmount = finishOrderAmount;
    }

    public UmsMemberTag() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", finishOrderCount=").append(finishOrderCount);
        sb.append(", finishOrderAmount=").append(finishOrderAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}