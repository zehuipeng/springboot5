package com.hr.springboot5.dao;

import com.hr.springboot5.entity.StudentInfo;
import java.util.List;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    List<StudentInfo> selectAll();

    int updateByPrimaryKey(StudentInfo record);
}