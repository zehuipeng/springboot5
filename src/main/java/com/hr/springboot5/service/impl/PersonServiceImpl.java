package com.hr.springboot5.service.impl;

import com.hr.springboot5.dao.BookMapper;
import com.hr.springboot5.entity.Book;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private BookMapper bookMapper;
    /*public List<Book> findAll(){
        return bookMapper.selectAll();
    }*/

    public List<Book> findAll(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","达到");
        return bookMapper.selectByMap(map);
    }

    public Integer updateById(Book book){
        Book b = new Book();
        b.setName("安静的咖啡机");
        b.setId(5);
        return bookMapper.updateById(b);
    }
}
