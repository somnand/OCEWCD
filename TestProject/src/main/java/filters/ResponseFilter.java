package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import util.LogingHelper;

public class ResponseFilter implements Filter
{
	FilterConfig config;
	public void init(FilterConfig config)
	{
		this.config=config;
	}
	
	public void destroy()
	{
		//No special code
	}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)throws ServletException,IOException
	{
		System.out.println("Before passing to Servlet - Incoming Request Filter");
		config.getServletContext().log("This is a call to ServletContext.log()");
		chain.doFilter(request, response);
		LogingHelper.log("After passing to Servlet - Outgoing Response Filtering");
	}
}
