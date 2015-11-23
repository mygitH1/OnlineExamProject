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

public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
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
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		ExamBean bean=new ExamBean();
		bean.setUserName(uname);
		bean.setPassword(pwd);
		try {
			bean=ExamDAO.insert(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bean.isCorrect())
		{
			out.print("<body bgcolor='cyan'>");
			out.print("<h2>success</h2><img src='success1.jpeg' border=3 height=200 width=200 alt='success'>");
			out.print("Click here to <a href='Signin.jsp' target='target'>Start</a> Exam");
			out.print("</body>");
		}
		else{
			out.print("<body bgcolor='cyan'");
			out.print("<h2>Failed </h2><img src='fail0.jpeg' alt='fail'>");
			out.print("Click here to <a href='register.jsp' target='target'>register</a> again");
			
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
