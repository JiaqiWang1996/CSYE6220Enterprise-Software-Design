/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvc.controller;

import com.mycompany.springmvc.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author dedhi
 */
@Controller
public class UserController{
    @RequestMapping(value="/user.htm", method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
//        if(session.getAttribute("login")){
//            //User is logged in
//        }else{
//            //User is not logged in
//        }
        System.out.println("USER CONTROLLER");
        User user  = new User();
        user.setFirst("John");
        user.setLast("Smith");
        request.setAttribute("msg","Value from request scope");
        return new ModelAndView("user-view", "user", user);
    }
    
}
