package com.sid.validate;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


@WebFilter("/Register")
public class EmplFilter extends HttpFilter implements Filter {
   
    public EmplFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initantaition started");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		if(email.equals("siddharth@gmail.com") && pass.equals("sid"))
		{
		RequestDispatcher rd=request.getRequestDispatcher("/Register");
		rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/register.html");
			rd.forward(request, response);
		}
	}
	public void destroy() {
		System.out.println("Destory method called");
	}


}
