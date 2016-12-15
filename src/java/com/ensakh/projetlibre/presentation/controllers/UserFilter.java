package com.ensakh.projetlibre.presentation.controllers;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ALBODOR
 */
@WebFilter(
        filterName = "UserLoginFilter", 
        urlPatterns = {"/admin", "/prof/*", "/changePassword", "/recoverPassword"})
public class UserFilter implements Filter{

    private FilterConfig filterConfig = null;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                                            throws IOException, ServletException {
        System.out.println("Filtering...");
        HttpSession session = ((HttpServletRequest) request).getSession();
        String username = (String) session.getAttribute("username");
        if(username == null) {
            System.out.println("Redirecting...");
            ((HttpServletResponse) response).sendRedirect("../login");
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        // NOTHING TO DO
    }

}
