package com.ensakh.projetlibre.presentation.controllers;

import com.ensakh.projetlibre.persistence.ProfesseursManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ALBODOR
 */
@WebServlet(name = "delProfServlet", urlPatterns = "/prof/del")
public class DelProfController extends HttpServlet{
    @Inject
    ProfesseursManager manager;

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // POST Params
        String id = req.getParameter("id");
        
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title></title></head><body>");
        try{
            // Deleting selected Item ID
            manager.delete(id);
            out.println("<p>Professeur deleted successfully!</p>");
         
        } catch(NullPointerException npe) {            
            out.println("<p>Invalid URL param ID !</p>");
        }
        out.println("</body></html>");    
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
}
