package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dado;

import java.io.IOException;

/**
 * Servlet implementation class RouterController
 */
@WebServlet({ "", "/router" })
public class RouterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int punteggio = 0;
	Dado d1 = new Dado(), d2 = new Dado();
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pagina = "home.jsp";

		if (request.getParameter("p") != null) {
			String richiesta = request.getParameter("p");

			switch (richiesta) {
			case "uno": {
				pagina = "uno.jps";
				int res1 =  d1.lancia();
				int res2= d2.lancia();
				
				if (res1 == res2) {
					punteggio++;
				}
				
				request.
				break;

			}
			default:
				pagina = "test.jsp";
			}
			
			String titolo = "Le mille e una notte";
			request.setAttribute("titolo", titolo);
		}										
		request.getRequestDispatcher(pagina).forward(request, response);
		//response.sendRedirect(pagina);
	}

}
