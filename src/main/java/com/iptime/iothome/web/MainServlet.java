package com.iptime.iothome.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		ServletContext servletContext = getServletContext();

		request.setAttribute("requestAttribute", "requestValue");
		session.setAttribute("sessionAttribute", "sessionValue");
		servletContext.setAttribute("servletContextAttribute", "serlvetContextValue");

		List<String> lineRangers = new ArrayList<String>();
		lineRangers.add("brown");
		lineRangers.add("cony");
		lineRangers.add("sally");
		
		request.setAttribute("lineRangers", lineRangers);
		
		request.getRequestDispatcher("/main.vm").forward(request, response);
	}
}
