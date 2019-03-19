package com.hr.springboot5.entity;

import java.util.Date;

public class DrugInfo {
    private Integer id;

    private String drugNo;

    private String name;

    private Integer type;

    private Double price;

    private Integer stock;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugNo() {
        return drugNo;
    }

    public void setDrugNo(String drugNo) {
        this.drugNo = drugNo == null ? null : drugNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}