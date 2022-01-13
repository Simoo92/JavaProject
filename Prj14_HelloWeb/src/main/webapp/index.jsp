<%@page import= "model.Studente" %>    
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String s = "Hello World";
	Studente st = new Studente ("Pippo");

	for (int i=1; i < 6; i++){

	out.print("<h" + i +">" + s + "</h" + i +">");
	out.print(st);}
%>

</body>
</html>