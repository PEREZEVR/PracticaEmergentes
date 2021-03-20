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


@WebServlet(name = "Pregunta_3", urlPatterns = {"/Pregunta_3"})
public class Pregunta_3 extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 >CALCULAR EDAD</h1>");
            out.println("<form action='Pregunta_3' method='post'>");
            out.println("<label>AÑO DE NACIMIENTO</label>");
            out.println("<br><br>");
            out.println("<input type='number' name='nacimiento'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            Calendar fechaActual = new GregorianCalendar();
            int fechaActual1 = fechaActual.get(Calendar.YEAR);
            
            String año=request.getParameter("nacimiento");
            int varaño = Integer.parseInt(año);
            int edad = 2021-varaño;
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tu Edad</h1>");
            out.println("<p >Tu edad es: " + edad + "</p>");
            out.println("<br><br>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }     
    }
}
