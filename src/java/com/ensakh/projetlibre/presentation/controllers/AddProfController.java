package com.ensakh.projetlibre.presentation.controllers;

import com.ensakh.projetlibre.metier.Departement;
import com.ensakh.projetlibre.metier.Professeur;
import com.ensakh.projetlibre.persistence.ProfesseursManager;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddProfServlet", urlPatterns = {"/prof/add"})
public class AddProfController extends HttpServlet {
    @Inject
    ProfesseursManager manager;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        RequestDispatcher dispatcher 
                    = req.getRequestDispatcher("/WEB-INF/jsp/prof/addProf.jsp");
        dispatcher.forward(req, resp);
                
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
                                        throws ServletException, IOException {
        
        // POST Params
        String cin = req.getParameter("cin");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        String telephone = req.getParameter("telephone");
        String departement = req.getParameter("departement");
        Departement dept = Departement.valueOf(departement);
        
        // New Prof
        Professeur prof = new Professeur(cin, nom, prenom, email, telephone, dept);
        
        // Output
        try(PrintWriter out = resp.getWriter()) {                 
            out.println("<html><body>");
            // Persisting Prof
            if(manager.save(prof)) {
                out.println("<h1>Professeur était bien ajouté!</h1>");
            } else {
                out.println("<h1>Professeur était bien ajouté!</h1>");
            }
            out.println("<p>Nombre des profs: " + manager.cout() + "</p>");
            out.println("<a href='list'>Liste des professeurs</a>");
            out.println("</body></html>");
        }
    }
    
}
