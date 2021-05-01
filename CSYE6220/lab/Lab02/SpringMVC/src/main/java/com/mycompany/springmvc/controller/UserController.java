/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvc.controller;

import com.mycompany.springmvc.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author dedhi
 */
public class UserController extends AbstractController {
    
    public UserController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        User user  = new User();
        user.setFirst("John");
        user.setLast("Smith");
        request.setAttribute("msg", "Message in request scope");
        return new ModelAndView("user-view", "user", user);
    }
    
}
