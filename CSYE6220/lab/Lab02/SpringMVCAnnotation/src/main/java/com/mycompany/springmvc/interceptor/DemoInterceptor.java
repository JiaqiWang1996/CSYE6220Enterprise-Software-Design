/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author dedhi
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("CONCURRENT HANDLING STARTED");
        super.afterConcurrentHandlingStarted(request, response, handler); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("AFTER COMPLETION");
        super.afterCompletion(request, response, handler, ex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("POST HANDLE");
        super.postHandle(request, response, handler, modelAndView); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("PRE HANDLE");
        return super.preHandle(request, response, handler); //To change body of generated methods, choose Tools | Templates.
    }
    
}
