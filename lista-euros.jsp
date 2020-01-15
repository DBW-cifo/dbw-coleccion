<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Monedas de Euro</title>
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
<script>
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"
</script>
</head>
<body>
<div class="container">
		<div class="jumbotron">
			<img src="${pageContext.request.contextPath}/resources/img/task.png"
				alt="EUROS" class="float-right" height="150" />
			<h1>Lista de Monedas de Euro</h1>
			<p>Mantenimiento: lista de monedas euro.</p>
		</div>
	<a href="addeuro" class="btn btn-primary mb-1">
		=>AÑADIR moneda euro?</a>            			
    <p>______________________________________________________________________________</p>
   <table class="table table-striped"> 
   <tr>
       <td>Id. Moneda</td>
       <td>Valor Nominal</td>
       <td>País</td>
       <td>Año</td>
       <td>Ceca</td>
       <td>Existe?</td>
       <td>Tengo?</td>
       <td>Valor Mercado</td>
	</tr>
	
	<c:forEach var="euro" items="${euros}">
	   <c:url var="linkEditar" value="/euro/updateeuro">
	   <c:param name="idmoneda" value="${euro.idmoneda }" />
	   </c:url>
	   <c:url var="linkBorrar" value="/euro/deleteeuro">
	   <c:param name="idmoneda" value="${euro.idmoneda }" />
	   </c:url>
	   <tr>
		<td><font color="orange">${euro.idmoneda}</font></td>
		<td><font color="green">${euro.valor_nominal}</font></td>
		<td><font color="green">${euro.pais}</font></td> 
		<td><font color="green">${euro.año}</font></td>
		<td><font color="green">${euro.ceca}</font></td>
		<td><font color="green">${euro.existe}</font></td>
		<td><font color="green">${euro.tengo}</font></td>
		<td><font color="green">${euro.valor_mercado}</font></td>
		<td>
			<a href="${linkEditar }"
			   class="btn btn-outline-success btn-sm">=>MODIFICAR?</a>
			<a href="${linkBlanco }"
			   class="btn btn-outline-success btn-sm">|||</a>
			<a href="${linkBorrar }"
			   onclick="if(!confirm('Está seguro?')) return false"
			   class="btn btn-outline-danger btn-sm">=>ELIMINAR?</a>
		</td>
	   </tr>
	</c:forEach>	
	</table>
</div>
</body>
</html>