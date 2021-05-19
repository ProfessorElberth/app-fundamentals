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
<div class="container">
<div class="panel-group">
<div class="panel panel-default">
<div class="panel-heading">
  <h2>App:</h2>
  <h4>Menu</h4>
	<form action="login.jsp">
   		<button type="submit" class="btn btn-link">Sair</button>
	</form>
   </div>
   
   	<div class="panel-body">
	    <div class="btn-group">
			<form action="UsuarioController" method="get">
				<button type="submit" class="btn btn-default">Usuário</button>
			</form>
	    </div>
	  </div>
	</div>
</div>
</div>
</div>
</body>
</html>