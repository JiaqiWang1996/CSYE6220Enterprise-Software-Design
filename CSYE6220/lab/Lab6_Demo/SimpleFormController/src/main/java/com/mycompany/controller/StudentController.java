/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.pojo.Student;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author dedhi
 */
public class StudentController extends SimpleFormController {
    
    public StudentController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Student.class);
        setCommandName("student");
        setSuccessView("student-success");
        setFormView("student-form");
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
       Student student = (Student) command;
    }
    
    
    
    

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        Student student = new Student();
        student.setFname("Test");
        student.setLname("Test");
        student.setId("2");
        return student;
    }
}
