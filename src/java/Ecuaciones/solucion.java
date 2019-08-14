/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecuaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author metal_6zf9dui
 */
public class solucion extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            int x2 = Integer.parseInt(request.getParameter("x2"));
            int x = Integer.parseInt(request.getParameter("x"));
            int some = Integer.parseInt(request.getParameter("some"));
            double raiz = Math.pow(x,2)-(4*x2*some);
            String s1 = "";
            String s2 = "";
            if(raiz<0){
                if(x==0){
                     s1 = (Math.sqrt((-1)*raiz))/(2*x2)+"i";
                     s2 = "-"+(Math.sqrt((-1)*raiz))/(2*x2)+"i";
                }
                else{
                    s1 = ((Math.pow(x,2)*(-1))/(2*x))+"+"+(Math.sqrt((-1)*raiz))/(2*x2)+"i";
                    s2 = ((Math.pow(x,2)*(-1))/(2*x))+"-"+(Math.sqrt((-1)*raiz))/(2*x2)+"i";
                }
            }
            else{
                s1 =""+(((-1)*x)+(Math.sqrt(Math.pow(x,2)-(4*x2*some))))/(2*x2);
                s2 =""+(((-1)*x)-(Math.sqrt(Math.pow(x,2)-(4*x2*some))))/(2*x2);
            }
            String ok = "ok";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Las soluciones para la ecuacion "+x2+"x<sup>2</sup>+"+x+"x+"+some+" son:</h3>");
            out.println("X<sub>1</sub>= "+s1);
            out.println("<br><br>");
            out.println("X<sub>2</sub>= "+s2);
            out.println("</body>");
            out.println("</html>");
        }
}
   

