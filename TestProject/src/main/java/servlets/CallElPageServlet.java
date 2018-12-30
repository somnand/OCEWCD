package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		message = getServletContext().getInitParameter("configParam");
		request.setAttribute("message", message);
		
		List<Message[]> listOfMessages = new ArrayList<Message[]>();
		
		Message[] messages=new Message[4];
		messages[0]=new Message("First Message",0);
		messages[1]=new Message("Second Message",1);
		messages[2]=new Message("Third Message",2);
		messages[3]=new Message("Fourth Message",3);
		
		listOfMessages.add(messages);
		
		messages=new Message[3];
		messages[0]=new Message("Fifth Message",3);
		messages[1]=new Message("Sixth Message",2);
		messages[2]=new Message("Seventh Message",3);
		
		listOfMessages.add(messages);
		
		request.setAttribute("messages", messages);
		request.setAttribute("listOfMessages", listOfMessages);
		
		HttpSession session= request.getSession();
		session.setAttribute("sessionString", "This is added in Session");
		
		LogingHelper.log("Session ID : "+session.getId());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/el/core_tags.jsp");
		dispatcher.forward(request, response);
	}
}
