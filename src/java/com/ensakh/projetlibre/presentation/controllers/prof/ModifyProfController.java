package com.ensakh.projetlibre.presentation.controllers.prof;

import com.ensakh.projetlibre.metier.Departement;
import com.ensakh.projetlibre.metier.Professeur;
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
@WebServlet(name = "ModifyProfServlet", urlPatterns = {"/prof/modify"})
public class ModifyProfController extends HttpServlet{

    ProfesseursManager manager;

    @Inject
    public ModifyProfController(ProfesseursManager manager) {
        this.manager = manager;
    }
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
                                            throws ServletException, IOException {
        System.out.println(getClass().getSimpleName()+" : launched");        
        // GET Params
        String cin = req.getParameter("cin");
        
        // Get Requested Professeur
        Professeur p = manager.find(cin);
        
        if(p == null) {
            System.err.println("Professeur not found!");
            // Redirecting
            resp.sendRedirect("/GestionEmploisDuTempsJEE/prof/list");
        } else {
            // Passing a Professeur in the Request
            req.setAttribute("prof", p);
            // Forwarding
            req.getRequestDispatcher("/WEB-INF/jsp/prof/modifyProf.jsp").forward(req, resp);
        }
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
        /* DEBUG
        System.out.println("[POST] cin = "+cin);
        System.out.println("[POST] nom = "+nom);
        System.out.println("[POST] prenom = "+prenom);
        System.out.println("[POST] email = "+email);
        System.out.println("[POST] tel = "+telephone);
        System.out.println("[POST] dept = "+departement);
        */
        // Modified Prof
        Professeur prof = new Professeur(cin, nom, prenom, email, telephone, dept);
        
        // Output
        try(PrintWriter out = resp.getWriter()) {                 
            out.println("<html><body>");
            // Persisting Prof
            if(manager.modify(prof)) {
                resp.sendRedirect("/GestionEmploisDuTempsJEE/prof/list");
                //System.out.println(getClass().getSimpleName()+" : GOOD");
            } else {
                out.println("<h1>Erreur!</h1>");
                System.out.println(getClass().getSimpleName()+" : ERROR");
            }
            out.println("<a href='list'>Liste des professeurs</a>");
            out.println("</body></html>");
        }
    }
    
    

    
    
}
