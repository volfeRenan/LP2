package Exercicio2_Calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calculadora", urlPatterns = {"/Calculadora"})
public class Calculadora extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String operador = request.getParameter("operador");
        
        if(operador.equals("+")){
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int resultado = a + b;

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Somar</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>"+a+ " + "+b+  " = " +resultado+"</p>");
                out.print("<a id='idSomar' href='index.jsp'>Novo Calculo</a>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        else if(operador.equals("-")){
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int resultado = a - b;

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Subtração</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>"+a+ " - "+b+  " = " +resultado+"</p>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        else if(operador.equals("*")){
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int resultado = a * b;

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Multiplicação</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>"+a+ " * "+b+  " = " +resultado+"</p>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        else if(operador.equals("/")){
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            int resultado = a / b;

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Divisão</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>"+a+ " / "+b+  " = " +resultado+"</p>");
                out.println("</body>");
                out.println("</html>");
            }
        }
        
    }

}
