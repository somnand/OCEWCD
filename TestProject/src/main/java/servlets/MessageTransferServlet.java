package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Message;
import util.LogingHelper;

/**
 * Servlet implementation class LoginServlet
 */
public class MessageTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		LogingHelper.log("Entering servlet : MessageTransferServlet");
		
		String content = request.getParameter("content");
		int priority = Integer.parseInt(request.getParameter("priority"));
		
		Message incomingMessage = new Message(content,priority);
		HttpSession currentSession = request.getSession(false);
		
		if(currentSession!=null)
		{
			currentSession.setAttribute("message", incomingMessage);
			LogingHelper.log("Setting the message in user session");
		}	
		
		request.setAttribute("message", incomingMessage);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("standard_tags_page.jsp");
		LogingHelper.log("Forwarding the request and response"+dispatcher);
		dispatcher=getServletContext().getRequestDispatcher("/jsp/el/standard_tags_page.jsp");
		LogingHelper.log("Getting RequestDispathcer from context"+dispatcher);
		dispatcher.forward(request, response);
		
		
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		doPost(request,response);
	}
}
