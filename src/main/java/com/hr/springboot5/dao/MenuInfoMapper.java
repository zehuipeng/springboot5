package com.hr.springboot5.dao;

import com.hr.springboot5.entity.MenuInfo;
import java.util.List;

public interface MenuInfoMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(MenuInfo record);

    MenuInfo selectByPrimaryKey(Integer menuId);

    List<MenuInfo> selectAll();

    int updateByPrimaryKey(MenuInfo record);
}