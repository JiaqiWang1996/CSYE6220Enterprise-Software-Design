/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.part5.controller;

import com.company.part5.DAO.BookDao;
import com.company.part5.pojo.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Part5Servlet")
public class Part5Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        PrintWriter out = response.getWriter();

//        String option = request.getParameter("option");

//        if(option.equalsIgnoreCase("add")){

            Book bookData = new Book();
            String amount = request.getParameter("amount");
            int count = Integer.parseInt(amount);
            List<String> isbn = new ArrayList<>();
            List<String> title = new ArrayList<>();
            List<String> authors = new ArrayList<>();
            List<Float> price = new ArrayList<>();

            for(int i = 0; i < count; i++){
                isbn.add(request.getParameter("isbn"+i)); //String.valueOf
                title.add(request.getParameter("title" + i));
                authors.add(request.getParameter("authors" + i));
                price.add(Float.parseFloat(request.getParameter("price" + i)));
            }


            BookDao bookObj = new BookDao();
            int result = bookObj.addBook(isbn, title, authors, price);

            request.setAttribute("count", count);
            requestDispatcher = getServletContext().getRequestDispatcher("/part5/addBookSuccessfully.jsp");
            requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String optionValue = request.getParameter("option");
        HttpSession session = request.getSession();
    }
}
