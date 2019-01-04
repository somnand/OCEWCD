package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.LogingHelper;

public class LifeCycleServlet extends HttpServlet
{
	static
	{
		LogingHelper.log("Static code block");
	}
	
	{
		LogingHelper.log("Object code block");
	}
	
	public LifeCycleServlet()
	{
		super();
		LogingHelper.log("Constructor");
	}
	
	public void init()throws ServletException
	{
		super.init();
		LogingHelper.log("init()");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		super.service(request, response);
		LogingHelper.log("service()");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		LogingHelper.log("doGet()");
		response.getWriter().println("Servlet served !! ");
	}
}
