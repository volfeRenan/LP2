<%@page import="br.edu.usj.ads.pessoa.Contato" %>
<%@page import="br.edu.usj.ads.pessoa.Repositorio" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title>Lista de Contatos</title>
    </head>
    <body>
        <h2 style="text-align: center">Lista de Contatos</h2>
        <div style="margin: 50px; margin-left: 450px; margin-right: 450px">
            <%Repositorio rep = new  Repositorio();
                for(Contato contato : rep.getContatos()){
                 %> 
                 Nome: <%out.println(contato.getNome());%>
                 <br>
                 Telefone: <%out.println(contato.getTelefone());%>
                 <hr/>
                <%
                }
                %>
        </div>
    </body>
</html>
