package com.mycompany.part6.controller;

import com.mycompany.part6.pojo.Message;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/part6")
public class part6 {
      @RequestMapping(value = "/part6_controller.htm", method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response, Message message) throws Exception {
        request.setAttribute("msg", message.getMes());
        return new ModelAndView("part6");
    }
}
