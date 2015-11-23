package com.pvr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pvr.bean.ExamBean;
import com.pvr.dao.ExamDAO;

public class Check extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Check() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer paperID=Integer.valueOf("paperId");
		System.out.println("================="+paperID+"=================");
		ExamBean bean=new ExamBean();
		String  uname=request.getParameter(bean.getUserName());
		String result="";
		bean.setPaperID(paperID);
		for(int i=1;i<=5;i++)
		{
			String m=""+i;
			String app=request.getParameter(m);
			if(m!=null)
				result=result+app;
			else
				result=result+" ";
		}
		bean.setResult(result);
		try {
			bean=ExamDAO.findResult(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bean.isCorrect())
		{
			int marks=bean.getMarks();
			out.print("<body bgcolor=cyan ><h2><b>Hello "+uname+" your marks :"+marks+"</b></h2></body>");
		}
		else
		{
			out.print("<body bgcolor=cyan ><h2><b>Sorry...! Submition of your Exam is failed...</b></h2></body>");
		}
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
