
<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>
<% 
	
	if (session.getAttribute("controller")!=null) {
		
		TodoCtrl ctrl = (TodoCtrl) session.getAttribute("controller");
		
		for (Todo df : ctrl.getTodos()) {
			out.print("<tr>");
			
			out.print("<td>");
			out.print("<a href='doComplete.jsp?idTodo="+ df.getId() + " >");
			out.print (df.isDone());
			out.print("<a>");
			
			out.print("</td>");
			
			out.print("<td>");
			out.print (df.getId());
			out.print("</td>");
			
			out.print("<td>");
			out.print (df.getDescription());
			out.print("</td>");
			
			
			out.print("</tr>");
			
			
			
			
			
		}
		
		
		
		
	}










%>