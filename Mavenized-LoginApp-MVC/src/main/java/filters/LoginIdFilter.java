package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LoginIdFilter
 */
public class LoginIdFilter implements Filter {

    public LoginIdFilter() {
    
    }
	public void destroy() {

	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In the Filter doChain()");
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
