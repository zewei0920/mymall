package com.macro.mymall.mbg.model;

import java.io.Serializable;

public class CmsPrefrenceArea implements Serializable {
    private Long id;

    private String name;

    private String subTitle;

    private Integer sort;

    private Integer showStatus;

    private byte[] pic;

    private static final long serialVersionUID = 1L;

    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
    }

    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus, byte[] pic) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
        this.pic = pic;
    }

    public CmsPrefrenceArea() {
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", sort=").append(sort);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}