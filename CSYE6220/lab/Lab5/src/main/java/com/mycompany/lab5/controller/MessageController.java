/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.controller;

import com.mycompany.lab5.dao.MessageDAO;
import com.mycompany.lab5.pojo.Message;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author dedhi
 */
public class MessageController extends AbstractController {
    
    public MessageController() {
    }
    
    //Reads the option variable and calls respective methods of MessageDao class
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = null;
        String option = request.getParameter("option") == null? "" :request.getParameter("option");
        
        //calls the addMessage() method of MessageDao class
        if(option.equalsIgnoreCase("add")){
            //reads all user input values
            String fromUser = (String) request.getParameter("fromUser");
            String message = (String) request.getParameter("message");
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String date = formatter.format(new Date());
            //creates an object of MessageDao class
            MessageDAO messageDao = new MessageDAO();
            //calls the addMessage() method of MessageDao class
            int result = messageDao.addMessage(fromUser, message, date);
            if(result == 1){
                //display success.jsp
                mv = new ModelAndView("success", "successMsg","Message added successfully!");
                return mv;
            }else{
                //display error.jsp
               mv = new ModelAndView("error", "errorMsg", "Something went wrong while adding message!");
                return mv; 
            }
        }
        //calls the getMessage() method of MessageDao class
        else if(option.equalsIgnoreCase("getMessage")){
            //reads all user input values
            int messageId = Integer.parseInt(request.getParameter("messageId"));
            //creates an object of MessageDao class
            MessageDAO messageDao = new MessageDAO();
            //calls the getMessage() method of MessageDao class
            Message result = messageDao.getMessage(messageId);
            if(result != null){
                //display update-message.jsp page
                mv = new ModelAndView("update-message", "message", result);
                return mv;
            }else{
                //display error.jsp page
               mv = new ModelAndView("error", "errorMsg", "No message found!");
                return mv; 
            }  
        }
        //calls the updateMessage() method of MessageDao class
        else if(option.equalsIgnoreCase("update")){
            //reads all user input values
            int messageId = Integer.parseInt(request.getParameter("messageId"));
            String fromUser = (String) request.getParameter("fromUser");
            String message = (String) request.getParameter("message");
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String date = formatter.format(new Date());
            //creates an object of MessageDao class
            MessageDAO messageDao = new MessageDAO();
            //calls the updateMessage() method of MessageDao class
            int result = messageDao.updateMessage(fromUser, message, date, messageId);
            if(result == 1){
                //display success.jsp page
                mv = new ModelAndView("success", "successMsg","Message updated successfully!");
                return mv;
            }else{
                //display error.jsp page
               mv = new ModelAndView("error", "errorMsg", "Something went wrong while updating message!");
                return mv; 
            }  
        }
        //calls the deleteMessage() method of MessageDao class
        else if(option.equalsIgnoreCase("delete")){
            //reads all user input values
            int messageId = Integer.parseInt(request.getParameter("messageId"));
            //creates an object of MessageDao class
            MessageDAO messageDao = new MessageDAO();
            //calls the deleteMessage() method of MessageDao class
            int result = messageDao.deleteMessage(messageId);
            if(result == 1){
                //display success.jsp page
                mv = new ModelAndView("success", "successMsg","Message deleted successfully!");
                return mv;
            }else{
                //display error.jsp page
               mv = new ModelAndView("error", "errorMsg", "Something went wrong while deleting message!");
                return mv; 
            }
        }
        //calls the getMessages() method of MessageDao class
        else{
            //creates an object of MessageDao class
            MessageDAO messageDao = new MessageDAO();
            //calls the getMessages() method of MessageDao class
            List<Message> list = messageDao.getMessages();
            if(list.size() > 0){
                //display view-messages.jsp page
                mv = new ModelAndView("view-messages","list",list);
                return mv;
            }else{
                //display success.jsp page
                mv = new ModelAndView("success","successMsg","No messages to display");
                return mv;
            }
            
        }
//        return mv;
    }
}
