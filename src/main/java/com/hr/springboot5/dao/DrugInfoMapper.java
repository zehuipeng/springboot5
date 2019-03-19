package com.hr.springboot5.dao;

import com.hr.springboot5.entity.DrugInfo;
import java.util.List;

public interface DrugInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugInfo record);

    DrugInfo selectByPrimaryKey(Integer id);

    List<DrugInfo> selectAll();

    int updateByPrimaryKey(DrugInfo record);
}