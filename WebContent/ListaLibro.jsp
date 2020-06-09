<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var = "libro" value = "${requestScope['libros']}" />
	<form action="RecuperacionExamen/BuscarLibro">
	
		<h1>Libros</h1>
		<table>
			<thead>
				<tr>
					<th>Libro</th>
					<th>ISBN</th>
					<th># Paginas</th>
					<th>Capitulo</th>
					<th>Titulo</th>
					<th>Autor</th>
					<th>Nacionalidad</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="i" value = "${0}"/>
                            <c:forEach var="libros" items="${libros}">
                                <c:set var="i" value = "${i+1}"/>
				<tr>
					<td>${libros.libro.nombre}</td>
					<td>${libros.libro.ISBN}</td>
					<td>${libros.libro.numPaginas}</td>
					<td>${capitulo.numero}</td>
					<td>${libros.capitulo.titulo}</td>
					<td>${autor.nombre}</td>
					<td>${autor.nacionalidad}</td>
					</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>