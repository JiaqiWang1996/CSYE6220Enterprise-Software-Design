package com.mycompany.part5.controller;

import com.mycompany.part5.Utility.Utility;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/part5")
public class part5 {
//    ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//    Utility utility = context.getBean("Utility",Utility.class);
//    @GetMapping("/home")
//    public String showMessage(Model theModel){
//        theModel.addAttribute("Utility",utility);
//        return "part5/home";
//    }
    @Autowired
    Utility message;
    @RequestMapping(value = "/part5_controller.htm", method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        request.setAttribute("msg", message.getMes());
        request.setAttribute("address", message.hashCode());
        return new ModelAndView("part5");
    }
}
