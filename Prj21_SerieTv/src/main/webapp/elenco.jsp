
<%@page import="model.Serie"%>
<%@page import="java.util.List"%>
<h1>Le nostre Serie Tv</h1>

<table>

	<tr> 
		<th>Titolo</th>
	</tr>

<%  List<Serie> elenco = (List<Serie>) request.getAttribute("elenco");   %>

<% for (Serie s : elenco) { %>
	
	<tr>
	
		<td><%= s.getTitolo()  %></td>
		<td><a href = "?genere=<%= s.getGenere() %>"><%= s.getGenere()  %> </td>
		
	</tr>
	
	
<%} %>


</table>