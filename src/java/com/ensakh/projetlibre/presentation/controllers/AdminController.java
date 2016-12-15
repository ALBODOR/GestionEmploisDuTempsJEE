package com.ensakh.projetlibre.presentation.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ALBODOR
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
                                                throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    
    private void processRequest(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        RequestDispatcher dispatcher = 
                                req.getRequestDispatcher("/WEB-INF/jsp/admin.jsp");
        dispatcher.forward(req, resp);
    }

    
    
}
