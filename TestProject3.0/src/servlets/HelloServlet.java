package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
urlPatterns= {"/hello","/helloAnnotation"},
initParams= {
		@WebInitParam(name="getMessage",value="Hello World - GET"),
		@WebInitParam(name="postMessage",value="Hello World - POST"),
		@WebInitParam(name="deleteMessage",value="DONOT delete any resource on the machine!!!")
			}
)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String getMsg,postMsg,deleteMsg;
	
	public void init(ServletConfig config)
	{
		 getMsg=config.getInitParameter("getMessage");
		 postMsg=config.getInitParameter("postMessage");
		 deleteMsg=config.getInitParameter("deleteMessage");
	}	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		response.getWriter().println(getMsg);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		response.getWriter().println(postMsg);
	}
	
	public void doDelete(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		response.getWriter().println(deleteMsg);
	}
}
