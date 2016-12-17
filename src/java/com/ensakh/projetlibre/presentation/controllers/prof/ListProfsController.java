package com.ensakh.projetlibre.presentation.controllers.prof;

import com.ensakh.projetlibre.persistence.ProfesseursManager;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ALBODOR
 */
@WebServlet(name = "ListProfsServlet", urlPatterns = {"/prof/list"})
public class ListProfsController extends HttpServlet {

    @Inject
    ProfesseursManager manager;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        // Adding List of Professeurs
        req.setAttribute("professeurs", manager.findAll());
        System.out.println(manager.findAll().toString());
        
        // Dispatching 
        RequestDispatcher dispatcher = 
                req.getRequestDispatcher("/WEB-INF/jsp/prof/listProfs.jsp");
        dispatcher.forward(req, resp);
    }
    
}
