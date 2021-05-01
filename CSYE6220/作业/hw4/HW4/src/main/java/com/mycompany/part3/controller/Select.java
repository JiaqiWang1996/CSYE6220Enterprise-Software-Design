package com.mycompany.part3.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Select extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String option = request.getParameter("option");
        ModelAndView modelAndView = null;
        if(option.equals("Add")){
            modelAndView = new ModelAndView("part3/addMovie");
        }else{
            modelAndView = new ModelAndView("part3/browseMovie");
        }
        return modelAndView;
    }
}
