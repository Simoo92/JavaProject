<%@page import="controller.TodoCtrl"%>
<% 

if (request.getParameter("cosa")!=null){
	TodoCtrl ctrl;
	//verifico se nella sessione(spazio di memoria sul server) c' ?  un oggetto che si chiama controller
	if (session.getAttribute("controller")!=null) {
		//se c'? il controller lo asseggno alla mia variabile ctrl
		 ctrl = (TodoCtrl) session.getAttribute("controller");
	} else {
		//se non c'? in sessione, lo creo e lo assegno alla mia variabile ctrl
		ctrl = new TodoCtrl();
	}
	// usando il ctrl aggiungo il todo
	int id = Integer.parseInt(request.getParameter("idTodo"));
	ctrl.completeTodobyId(id);
	
	//salvo in sessione il controller modificato
	session.setAttribute("controller", ctrl);
	
}

response.sendRedirect("index,jsp");



%>