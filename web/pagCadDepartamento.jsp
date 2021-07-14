<%-- 
    Document   : pagCadDepartamentop
    Created on : 14/jul/2021, 16:51:28
    Author     : mfernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Departamento</h1>
        <form action="DepartamentoController">
            <input type="hidden" name="id" id="id" data-bind="" value="${obj.id}"/>
            <input type="text" name="departamento" id="departamento" data-bind="" value="${obj.dapartamento}"/>
            <input type="submit" value="Adicionar Departamento"/>
        </form>
    </body>
</html>
