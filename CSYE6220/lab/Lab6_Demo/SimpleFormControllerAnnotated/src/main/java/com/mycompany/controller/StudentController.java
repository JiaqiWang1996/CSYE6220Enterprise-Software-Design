/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dedhi
 */
@Controller
public class StudentController {
    @RequestMapping(value="/student.htm", method=RequestMethod.GET)
    public String showForm(ModelMap model, Student student){
        student.setFname("Test");
        student.setLname("Test");
        student.setId("2");
        return "student-form";
    }
    
    @RequestMapping(value="/student.htm", method=RequestMethod.POST)
    public ModelAndView showSuccess(@ModelAttribute("student") Student student, BindingResult result, SessionStatus status){
        //store object in database(Calling DAO class)
        //mark it complete and cleanup implicitly created session attibute
       status.setComplete();
       return new ModelAndView("student-success");
    }
}
