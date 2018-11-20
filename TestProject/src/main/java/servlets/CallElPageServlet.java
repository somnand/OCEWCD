package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Message;
import util.LogingHelper;

/**
 * Servlet implementation class GreetingServlet
 */
public class CallElPageServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CallElPageServlet()
	{
		super();
		LogingHelper.log("Inside CallELPageServlet !! ");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		message = getServletContext().getInitParameter("configParam");
		request.setAttribute("message", message);
		
		Message[] messages=new Message[4];
		messages[0]=new Message("First Message",0);
		messages[1]=new Message("Second Message",1);
		messages[2]=new Message("Third Message",2);
		messages[3]=new Message("Fourth Message",3);
		
		request.setAttribute("messages", messages);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/el/core_tags.jsp");
		dispatcher.forward(request, response);
	}
}
