
<%@page import="model.Libro"%>
<%@page import="controller.LibreriaCtrl"%>
<h2>Elenco libri</h2>


<table>
<tr>
	<th>Titolo</th>
	<th>Prezzo</th>
</tr>
<% for(Libro l: LibreriaCtrl.getLibri()) { %>
<tr>
	<th><%= l.getTitolo() %></th>
	<th><%= l.getPrezzo() %></th>
</tr>


<%} %>
</table>