package com.mycompany.part3.controller;

import com.mycompany.part3.DAO.MovieDao;
import com.mycompany.part3.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Browse  extends AbstractController {
    @Autowired
    MovieDao movieDao;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Movie> list = null;
//        searchOption
        String search = request.getParameter("search");
//        searchText
        String param = request.getParameter("keyword");
        if (request.getAttribute("unsafe_request") == "true") {
            return new ModelAndView("part3/securityerror");
        }
        System.out.println(search);
        System.out.println(param);
        list = movieDao.searchMovie(param,search);
        ModelAndView modelAndView = null;
//        System.out.println(list.get(0));
        if (list == null || list.isEmpty()) {
            modelAndView = new ModelAndView("part3/error");
        } else {
            modelAndView = new ModelAndView("part3/browseSuccessfully", "list", list);

        }
        return modelAndView;
    }
}
