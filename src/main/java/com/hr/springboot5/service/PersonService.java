package com.hr.springboot5.service;

import com.hr.springboot5.entity.Book;

import java.util.List;

public interface PersonService {
    public List<Book> findAll();
    public Integer updateById(Book book);
}
