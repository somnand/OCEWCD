package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/requestTracker"})
@WebListener
public class RequestTracker extends HttpServlet implements ServletRequestAttributeListener
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		request.setAttribute("Attrib", "b");
		request.setAttribute("Attrib", "c");
		request.removeAttribute("Attrib");
		response.getWriter().println("Request Tracking done !!");
		
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent ev)
	{
		System.out.println("Added: "+ev.getName() +" = "+ev.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent ev)
	{
		System.out.println("Removed: "+ev.getName() +" = "+ev.getValue());

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent ev)
	{
		System.out.println("Modified: "+ev.getName() +" = "+ev.getValue());
	}

}
