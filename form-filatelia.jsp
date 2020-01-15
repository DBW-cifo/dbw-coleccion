<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
				
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous">
</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous">
</script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js">
</script>
<style>
.ok {
color: green; </style>
<style>
.error {
color: red; </style> 
</head>
<body>
<div class="container">
		<div class="jumbotron">
			<img src="${pageContext.request.contextPath}/resources/img/task.png"
				alt="FILATELIAS" class="float-right" height="150" />
			<h1>${filatelia.idfilatelia==0 ? "Nueva" : "Modificar"}  filatelia</h1>
			<p>Mantenimiento lista de filatelias.</p>
		</div>
        <form:form action="savefilatelia" modelAttribute="filatelia" method="post"> 
          <form:hidden path="idfilatelia" />
				Nombre:
				<form:input path="nombre" type="text" id="ceca" onKeyUp="document.getElementById(this.id).value=document.getElementById(this.id).value.toUpperCase()"/>
				<br />
				Dirección:
				<form:input path="direccion" type="text" id="ceca" onKeyUp="document.getElementById(this.id).value=document.getElementById(this.id).value.toUpperCase()"/>			
				<br />
				<br />    
							
			<input type="submit" value="Guardar" class="btn btn-success"/>
			<a href="${pageContext.request.contextPath}/filatelia/lista"
				class="btn btn-outline-primary float-right">Ir a lista de filatelias</a>    
        </form:form>
</div>
</body>
</html>