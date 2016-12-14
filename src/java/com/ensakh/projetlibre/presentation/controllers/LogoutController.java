package com.ensakh.projetlibre.presentation.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ALBODOR
 */
@WebServlet(name = "LogoutController", urlPatterns = {"/logout"})
public class LogoutController extends HttpServlet{

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) {
        // Destroying the session
        HttpSession session = req.getSession();
        session.invalidate();
        
        // Output
        try (PrintWriter out = resp.getWriter()){
            out.println("<html><head><title>Se déconnecter</title></head><body>");
            out.println("<h1>Vous avez déconnecté avec succès!</h1>");
            out.println("<a href='login' >Login Page</a>");
            out.println("</body></html>");
        } catch (IOException ex) {
            System.err.println(ex);
        } 
    }
    
}
