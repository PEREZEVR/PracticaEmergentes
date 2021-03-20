package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida_2", urlPatterns = {"/Salida_2"})
public class Salida_2 extends HttpServlet {


  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num=request.getParameter("numero");
         int varnum=Integer.parseInt(num);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salida_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>FACTORIAL DE: "+varnum+"</h1>");
            int resultado = 1;
            for (int i = 1; i <= varnum; i++) {
                resultado *= i;
                out.print("<h1>"+resultado+"</h1>");
            }
            out.println("<a href='Main'>VOLVER MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    

}
