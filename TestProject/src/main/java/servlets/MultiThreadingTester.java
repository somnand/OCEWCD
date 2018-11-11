package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiThreadingTester extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public MultiThreadingTester()
	{
		super();
	}

	protected void doGet(HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException
	{
		Thread t = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					response.sendRedirect("jsp/listener-tester.jsp");
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		for (int i = 0; i < 10; i++)
		{
			t.start();
			try
			{
				t.join();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
