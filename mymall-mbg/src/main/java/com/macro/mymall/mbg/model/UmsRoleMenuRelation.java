package com.macro.mymall.mbg.model;

import java.io.Serializable;

public class UmsRoleMenuRelation implements Serializable {
    private Long id;

    private Long roleId;

    private Long menuId;

    private static final long serialVersionUID = 1L;

    public UmsRoleMenuRelation(Long id, Long roleId, Long menuId) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public UmsRoleMenuRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}