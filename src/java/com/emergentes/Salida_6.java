package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida_6", urlPatterns = {"/Salida_6"})
public class Salida_6 extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int dado_1 = (int)(Math.random()*6+1);
        int dado_2 = (int)(Math.random()*6+1);
        int suma = dado_1 + dado_2;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida_6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Los Dados</h1>");
            out.println("<form >");
            out.println("<p>Primer Dado: "+ dado_1 +"</p>");
            out.println("<p>Segundo Dado: "+ dado_2 +"</p>");
            out.println("<p>La sumatoria de los dados es: "+ suma +"</p>");
            if (suma == 7 || suma == 11) {
                out.println("<p>Lo siento</p>");
                out.println("<p>Has perdido . . . . . . .</p>");
            } else {
                out.println("<p>Felicidades Ganaste</p>");
            }
            out.println("</form>");
            out.println("<br><br>");
            out.println("<a href='Main'>VOLVER MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
