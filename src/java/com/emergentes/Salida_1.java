package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida_1", urlPatterns = {"/Salida_1"})
public class Salida_1 extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("nombre");
        
        String varaño = request.getParameter("nacimiento");
        int años=Integer.parseInt(varaño);
  
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LA EDAD DE LA PERSONA</h1>");
            out.println("<p>Nombre: "+ nombre +"</p>");
            años=2021-años;
            out.println("<p>Edad: "+años+"</p>");
            out.println("<a href='E1'>Volver Pregunta 1</a>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}