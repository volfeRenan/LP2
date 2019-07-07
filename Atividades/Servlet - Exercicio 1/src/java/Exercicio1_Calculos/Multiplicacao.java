package Exercicio1_Calculos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Multiplicacao", urlPatterns = {"/Multiplicacao"})
public class Multiplicacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        response.setContentType("text/html;charset=UTF-8");
        
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int resultado = a * b;
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado da Multiplicação</title>");  
            out.println("<style type='text/css'>");
		out.println("body {background-color: gray;}");
		out.println("h2{");
			out.println("margin-top: 100px;");
			out.println("margin-left: 400px;");
			out.println("margin-right: 400px;");
			out.println("text-align: center;");
		out.println("}");
		out.println("#divCampos {");
			out.println("margin-left: 400px;");
			out.println("margin-right: 400px;");
			out.println("border-style: solid;");
			out.println("background-color: lightgray;");
		out.println("}");
		out.println("#numsDiv, #opcoes {");
			out.println("margin: 20px;");
		out.println("}");
		out.println("#pNum, #lblCalculo, #sNum, #lblResultado{");
			out.println("margin-right: 20px;");
		out.println("}");
		out.println("button{");
			out.println("margin: 5px;");
		out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
                out.print("<h2>Resultado</h2>");
                out.print("<div id='divCampos'>");
                    out.print("<div id='numsDiv'>");
                            out.print("<label id='pNum'>"+a+"</label>");
                            out.print("<label id='lblCalculo'>*</label>");
                            out.print("<label id='sNum'>"+b+"</label>");
                            out.print("<label id='lblResultado'>=</label>");
                            out.print("<label id='resultadoFinal'>"+resultado+"</label>");
                    out.print("</div>");
                    out.print("<div id='opcoes'>");
                        out.print("<a id='idSomar' href='index.jsp'>Novo Calculo</a>");
                    out.print("</div>");
                out.print("</div>");            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
