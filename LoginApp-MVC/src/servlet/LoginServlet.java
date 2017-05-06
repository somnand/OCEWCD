package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.LogginHelper;

/**
 * Servlet implementation class LoginServlet
 */
//Commment @WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		LogginHelper.log("Entering servlet");
		
		String userId=request.getParameter("userId");
		String password=request.getParameter("pwd");
		
		LogginHelper.log("User ID : "+userId+" Password "+password+" is captured");
		LogginHelper.log("Unimplemented!!");
	}

}
