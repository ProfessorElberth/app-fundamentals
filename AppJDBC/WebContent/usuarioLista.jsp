<%@page import="br.com.jdbc.negocio.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>App</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	List<Usuario> lista = (List<Usuario>)request.getAttribute("lista");
	 %>

<div class="container">
<div class="panel-group">
<div class="panel panel-default">
<div class="panel-heading">
  <h2>App:</h2>
	<form action="main.jsp">
		<h4>Cadastramento de Usuários</h4>
     		<button type="submit" class="btn btn-link">Voltar</button>
	</form>
   </div>
   
   <div class="panel-body">
	<form action="usuarioDetalhe.html">
		<input type="hidden" name="tela" value="Usuario">
		<button type="submit" class="btn btn-default">Novo</button>
		<hr>
		
		<table class="table table-striped">
	    	<thead>
	      	<tr>
	        <th>Usuário</th>
	      	</tr>
	    	</thead>
	    	<tbody>
	    	<%for(Usuario item : lista){%>
	      	<tr>
	        	<td><%=item%></td>
	      	</tr>
	      	<%}%>
	    	</tbody>
		</table>
	</form>
</div>
</div>
</div>
</div>
</body>
</html>