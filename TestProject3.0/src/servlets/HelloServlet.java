package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(urlPatterns= {"/hello","/helloAnnotation"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		response.getWriter().println("Hello World - GET");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		response.getWriter().println("Hello World - POST");
	}
}
