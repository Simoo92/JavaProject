package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ContoCorrente;

import java.io.IOException;
import java.util.List;

import dal.ClienteDAO;
import dal.ContoCorrenteDAO;

@WebServlet("")
public class RouterSvt extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("logged")==null) {
			request.getRequestDispatcher("form_login.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("areariservata.jsp").forward(request, response);
		}

	}

	
	}

	

