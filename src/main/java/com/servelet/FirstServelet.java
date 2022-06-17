/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servelet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author abhishekverma
 */
public class FirstServelet implements Servlet{

    @Override
    public void init(ServletConfig config) throws ServletException {
         
    }

    @Override
    public ServletConfig getServletConfig() {
        
        return null;
        
    }

      


    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");
       
       PrintWriter out =res.getWriter();
       out.println("This is my first Servelet");
       out.println("Today's date is "+new Date().toString());
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
