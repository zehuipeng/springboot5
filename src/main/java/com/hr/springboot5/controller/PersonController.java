package com.hr.springboot5.controller;

import com.hr.springboot5.entity.Book;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/book/list");
        System.out.println("彭泽辉测试");
        System.out.println(i+"====================");
        mv.addObject("personList",personService.findAll());
        return  mv;
    }
    @RequestMapping("/updateById")
    public ModelAndView updateById(Book book){
        int i = personService.updateById(book);
        System.out.println(i+"====================");
        return this.findAll();
    }

    public PersonController(){}
}
