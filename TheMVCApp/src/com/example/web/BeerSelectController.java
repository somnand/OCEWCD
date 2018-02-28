package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpertModel;

public class BeerSelectController extends HttpServlet {

	public BeerSelectController() {
		super();	
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		System.out.println("Audit info Entry to Servlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection advise<br/>");
		String color=request.getParameter("color");
		out.println("Got color : "+color);
		BeerExpertModel model=new BeerExpertModel();
		List<String> result=model.getBrands(color);
		
		Iterator i =result.iterator();
		while(i.hasNext())
		{
			out.print("<br>try: "+i.next());
		}	
	}
}
