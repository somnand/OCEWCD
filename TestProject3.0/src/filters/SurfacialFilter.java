package filters;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SurfacialFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }, urlPatterns = { "/*" })
public class SurfacialFilter implements Filter {

	FilterConfig config;
	
	public void init(FilterConfig config)
	{
		this.config=config;
	}
	
	public void destroy()
	{
		System.out.println("Destroying the filter");
	}
	
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
    	HttpServletRequest req=(HttpServletRequest)request;
    	System.out.println("Basic Filtering of request "+req.getMethod());    	    	
    	chain.doFilter(request, response);
	}
}
