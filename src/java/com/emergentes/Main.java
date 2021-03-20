package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PEREZ
 */
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

   
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>MENU</h3>");
            out.println("<ul>");
            out.println("<li><a href=\"Pregunta_1\">PREGUNTA 1</a></li>");
            out.println("<li><a href=\"Pregunta_2\">PREGUNTA 2</a></li>");
            out.println("<li><a href=\"Pregunta_3\">PREGUNTA 3</a></li>");
            out.println("<li><a href=\"Pregunta_4\">PREGUNTA 4</a></li>");
            out.println("<li><a href=\"Pregunta_5\">PREGUNTA 5</a></li>");
            out.println("<li><a href=\"Pregunta_6\">PREGUNTA 6</a></li>");
            out.println("<li><a href=\"Pregunta_7\">PREGUNTA 7</a></li>");
            out.println("<ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   

}
