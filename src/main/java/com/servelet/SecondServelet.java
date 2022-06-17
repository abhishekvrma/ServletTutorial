package com.servelet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.Date;
/**
 *
 * @author abhishekverma
 */
public class SecondServelet implements Servlet{

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
        
        PrintWriter out = res.getWriter();
        out.println("this is my second servelet");
        out.println("Todays date is "+new Date().toString());
    }
    

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        
    }
    
}
