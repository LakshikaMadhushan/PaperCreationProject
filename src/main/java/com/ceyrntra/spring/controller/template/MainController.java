package com.ceyrntra.spring.controller.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/paper_create")
    public ModelAndView paperCreate(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("paper/paper_create");
        return modelAndView;
    }

    @RequestMapping(value = "/paper_view")
    public ModelAndView paperView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("paper/paper_view");
        return modelAndView;
    }

    @RequestMapping(value = "/paper_profile")

    public ModelAndView paperProfile(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("paper/paper_profile");
        return modelAndView;
    }

}
