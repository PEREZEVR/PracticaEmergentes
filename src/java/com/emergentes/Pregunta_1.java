package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Pregunta_1", urlPatterns = {"/Pregunta_1"})
public class Pregunta_1 extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos Personales</h1>");
            out.println("<form action='Salida_1' method='post'>");
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<label>Año de nacimiento: </label>");
            out.println("<input type='number' name='nacimiento'>");        
            out.println("<br>");
            out.println("<input type='submit' value='ENVIAR'>");        
            out.println("</form>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER MENU</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
