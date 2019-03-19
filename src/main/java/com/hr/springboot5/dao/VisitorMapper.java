package com.hr.springboot5.dao;

import com.hr.springboot5.entity.Visitor;
import java.util.List;

public interface VisitorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Visitor record);

    Visitor selectByPrimaryKey(Integer id);

    List<Visitor> selectAll();

    int updateByPrimaryKey(Visitor record);
}