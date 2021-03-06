package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.AuthenticationService;
import util.LogingHelper;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		LogingHelper.log("Entering servlet");
		
		String userId=request.getParameter("userId");
		String password=request.getParameter("pwd");
		
		LogingHelper.log("User ID : "+userId+" Password "+password+" is captured");
		AuthenticationService service=new AuthenticationService();
		
		boolean isGenuine=service.authenticate(userId, password);
		HttpSession thisSession=request.getSession();
		thisSession.setAttribute("userId", userId);
		
		if(isGenuine)
		{
			String url = response.encodeURL("welcome.jsp");
			LogingHelper.log("Encoded URL(welcome.jsp)  : "+url);
			response.sendRedirect(url);
		}
			
		else
			response.sendRedirect("invalid.jsp");
		
	}
}
