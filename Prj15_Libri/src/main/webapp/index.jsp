<!DOCTYPE html>
<%@page import="model.Libro"%>
<%@page import="controller.LibriCtrl"%>
<html>
<head>
<meta charset="UTF-8">
<title>Libreria</title>

</head>

<style type="text/css">
h2 {
	color: red;
}
</style>

<body>

	<h1>Libreria</h1>

	<form action="">

		<input type="text" name="titolo" placeholder="titolo"> <input
			type="text" name="prezzo" placeholder="prezzo"> <input
			type="submit" value="aggiungi Libro">


	</form>



	<%
	LibriCtrl controller = new LibriCtrl();
	%>

	<%
	if (request.getParameter("titolo") != null) {
		String titolo = request.getParameter("titolo");
		// Libro libro = new Libro("titolo", 10);
		
		controller.addlibro(titolo, 10);
	}
	%>

	<%

	%>

	<%
	for (Libro l : controller.getLibri()) {
	%>

	<h2>
		<%= l.getTitolo()%></h2>

	<%}
	%>

</body>
</html>