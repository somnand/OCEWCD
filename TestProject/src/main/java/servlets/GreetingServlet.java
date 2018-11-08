package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.LogingHelper;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GreetingServlet() {
		super();
		LogingHelper.log("Inside greeting servlet !! ");
	}

	public void init()
	{
		message=getServletConfig().getInitParameter("configParam");
		LogingHelper.log("Initiliazing the servlet via the container Init-Params: "+message);		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		message=getServletContext().getInitParameter("configParam");
		response.getWriter().println("Hello World from Servlet "+message);		
	}
}
