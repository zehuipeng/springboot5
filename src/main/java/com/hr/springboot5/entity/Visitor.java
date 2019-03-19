package com.hr.springboot5.entity;

import java.util.Date;

public class Visitor {
    private Integer id;

    private String name;

    private String cardNo;

    private Date visitorTime;

    private Integer direction;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Date getVisitorTime() {
        return visitorTime;
    }

    public void setVisitorTime(Date visitorTime) {
        this.visitorTime = visitorTime;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}