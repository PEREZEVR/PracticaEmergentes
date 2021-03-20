package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Pregunta_6", urlPatterns = {"/Pregunta_6"})
public class Pregunta_6 extends HttpServlet {

   

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 >JUEGO DE DADOS</h1>");
            out.println("<form>");
            out.println("<p>Si la Sumatoria de los Dados es 7 u 11 tu pierdes</p>");
            out.println("<a href='Salida_6' >jugar</a>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
