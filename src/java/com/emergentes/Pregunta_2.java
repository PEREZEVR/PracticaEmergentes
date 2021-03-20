package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Pregunta_2", urlPatterns = {"/Pregunta_2"})
public class Pregunta_2 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pregunta_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='Salida_2' method='POST'>");
            out.println("<label>INTRODUZCA NUMERO: </label>");
            out.println("<input type='number' name='numero'>");
            out.println("<br>");
            out.println("<input type=\"submit\" name=\"Enviar\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
