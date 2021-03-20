package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Salida_4", urlPatterns = {"/Salida_4"})
public class Salida_4 extends HttpServlet {

   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String var = request.getParameter("num");
        int mone=Integer.parseInt(var);
        String mo=request.getParameter("tipo");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida_4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDA DE BOLIVIANO A DOLAR Y DOLAR A BOLIVIANO</h1>");
            double cambio;
            String cadena="Boliviano_a_Dolar";
            if(mo.equals(cadena)){
                cambio=mone*0.14;
                out.println("<p>El cambio de "+mone+" Bs es: "+cambio+" $</p>");
                
            }else{
               cambio=mone*6.90;
                out.println("<p>El cambio de "+mone+" $ es: "+cambio+" Bs</p>");
                 
            }

            out.println("<br>");
            out.println("<a href='E4'>Volver</a>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MENÚ</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
