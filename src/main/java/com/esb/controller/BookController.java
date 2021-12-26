package com.esb.controller;

import com.esb.pojo.Books;
import com.esb.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 13:48
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Bookservice bookservice;

    //查询全部的书籍，并返回一个数据展示页面
    @RequestMapping("/allbook")
    public  String list(Model model){
        List<Books> books = bookservice.queryAllbook();
        model.addAttribute("list",books);
        return "allbook";
    }

    @RequestMapping("/querybook")
    public  String querybook(String  querybookname, Model model){
        if (!"".equals(querybookname)){
            Books books = bookservice.querybookByName(querybookname);
            if(books!=null){
                List<Books> list = new ArrayList<>();
                list.add(books);
                model.addAttribute("list",list);
                model.addAttribute("querybookname",querybookname);
                return "allbook";
            }else{
                List<Books> books2 = bookservice.queryAllbook();
                model.addAttribute("list",books2);
                model.addAttribute("error","未查询到！！！");
                return "allbook";
            }

        }else{
            List<Books> books = bookservice.queryAllbook();
            model.addAttribute("list",books);
            return "allbook";
        }


    }

    //查询全部的书籍，并返回一个数据展示页面
    @RequestMapping("/allbook2")
    public  String listone(Model model){
        List<Books> books = bookservice.queryAllbook();
        model.addAttribute("list",books);
        return "allbook";
    }

    //跳转到增加数据页面
    @RequestMapping("/toaddbook")
    public  String toaddbookPaper(Model model){
        return "addbook";
    }

    //添加书籍
    @RequestMapping("/addbook")
    public  String addbook(Books books){
        System.out.println("addBook=>"+books.toString());
        bookservice.addbook(books);
        return "redirect:/book/allbook";
    }
    //跳转到修改数据页面
    @RequestMapping("/toupdatebook")
    public  String toupdatebook(int id,Model model){
        Books books = bookservice.querybookByID(id);
        model.addAttribute("book",books);
        return "updatebook";
    }

    //修改书籍
    @RequestMapping("/updatebook")
    public  String updatebook(Books books){
        System.out.println("addBook=>"+books.toString());
        bookservice.updatebook(books);
        return "redirect:/book/allbook";
    }

    //修改书籍
    @RequestMapping("/deletebook")
    public  String deletebook(int id){
        bookservice.deletebook(id);
        return "redirect:/book/allbook";
    }
}
