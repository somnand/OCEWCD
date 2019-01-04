package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

    public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("Filter1 invoked on request level");
		chain.doFilter(request, response);
		System.out.println("Filter1 invoked on response level");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
