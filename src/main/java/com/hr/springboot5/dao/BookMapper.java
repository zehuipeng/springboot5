package com.hr.springboot5.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot5.entity.Book;
import org.springframework.stereotype.Repository;


@Repository
public interface BookMapper extends BaseMapper<Book> {
}