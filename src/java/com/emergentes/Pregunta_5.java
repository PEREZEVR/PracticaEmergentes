package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Pregunta_5", urlPatterns = {"/Pregunta_5"})
public class Pregunta_5 extends HttpServlet {

   
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>INGRESAR 2 NUMEROS</h1>");
             out.println("<form action='Salida_5' method='post'>");
            out.println("<label>Primer Número: </label>");
            out.println("<input type='number' name='numero1'>");           
            out.println("<br>");
            out.println("<label>Segundo Número: </label>");
            out.println("<input type='number' name='numero2'>");           
            out.println("<br>");
            out.println("<label>Seleccione Tipo de Operación: ");
            out.println("<select name='operacion' id='op'>");
    	    out.println("<option value='suma'>Suma</option>");
    	    out.println("<option value='resta'>Resta</option>");
    	    out.println("<option value='producto'>Producto</option>");
    	    out.println("<option value='division'>División</option>");
    	    out.println("</select>");
            out.println("<br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
