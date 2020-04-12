package com.macro.mymall.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UmsResourceCategory implements Serializable {
    private Long id;

    private Date createTime;

    private String name;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public UmsResourceCategory(Long id, Date createTime, String name, Integer sort) {
        this.id = id;
        this.createTime = createTime;
        this.name = name;
        this.sort = sort;
    }

    public UmsResourceCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}