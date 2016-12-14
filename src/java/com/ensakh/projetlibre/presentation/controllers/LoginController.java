package com.ensakh.projetlibre.presentation.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ALBODOR
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        RequestDispatcher dispatcher = 
                            req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Getting POST Params
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        // Initializing an HTTP Session
        HttpSession session;
        RequestDispatcher dispatcher;
        
        if(username.equals("admin") && password.equals("admin")) {
            // Getting the HTTP Session
            session = req.getSession();
            session.setAttribute("username", "admin");
            // Redirecting
            dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/admin.jsp");
        } else {
            req.setAttribute("errno", 1);
            dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
        }
        
        dispatcher.forward(req, resp);
    }
    
    

    
    
}
