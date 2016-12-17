package com.ensakh.projetlibre.presentation.controllers.prof;

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
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POST Params
        String cin = req.getParameter("cin");
        
        // Preparing Output
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title></title></head><body>");
        
        try{
            // Deleting selected Item ID
            manager.delete(cin);
            // Redirecting Back to List
            resp.sendRedirect("/GestionEmploisDuTempsJEE/prof/list");
        } catch(NullPointerException npe) {            
            out.println("<p>Invalid ID!</p>");
            out.println("</body></html>");    
            out.close();
        }
    }    
}
