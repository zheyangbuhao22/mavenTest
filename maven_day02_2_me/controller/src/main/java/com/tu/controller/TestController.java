package com.tu.controller;


import com.tu.domain.Items;
import com.tu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    /*@RequestMapping("/find")
    public String findAll(Model model){
        model.addAttribute("list", testService.findAll());
        return "success";
    }*/

    @RequestMapping("/find")
    public ModelAndView findAll(ModelAndView mv){
        System.out.println("findAll进来了……");
        List<Items> list = testService.findAll();
        System.out.println(list);
        mv.addObject("list",list);
        mv.setViewName("success");
        return mv;
    }
}
