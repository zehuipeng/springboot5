package com.hr.springboot5.dao;

import com.hr.springboot5.entity.EmpInfo;
import java.util.List;

public interface EmpInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpInfo record);

    EmpInfo selectByPrimaryKey(Integer id);

    List<EmpInfo> selectAll();

    int updateByPrimaryKey(EmpInfo record);
}