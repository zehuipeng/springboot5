package com.hr.springboot5.entity;

public class MenuInfo {
    private Integer menuId;

    private String menuName;

    private Integer menuState;

    private String url;

    private Integer superMenuId;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuState() {
        return menuState;
    }

    public void setMenuState(Integer menuState) {
        this.menuState = menuState;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSuperMenuId() {
        return superMenuId;
    }

    public void setSuperMenuId(Integer superMenuId) {
        this.superMenuId = superMenuId;
    }
}