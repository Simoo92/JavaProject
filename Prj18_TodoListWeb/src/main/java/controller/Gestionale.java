package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Gestionale
 */
@WebServlet("/pippo")
public class Gestionale extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//prendi l'oggetto risposta e dalla risposta prendi il writer e aggiungi a questo flusso 
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append("<h1>sta funzionando, ho chiamato la mia servlet via get scrivendo pippo</h1>");
	
	}


}
