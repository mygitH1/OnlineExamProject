package com.pvr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pvr.bean.ExamBean;
import com.pvr.dao.ExamDAO;

public class ExamServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3910746747717494319L;



	/**
	 * Constructor of the object.
	 */
	public ExamServlet() {
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
		
		String exam=request.getParameter("exam");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		ExamBean bean=new ExamBean();
		bean.setExam(exam);
		bean.setPassword(pwd);
		bean.setUserName(uname);
		try {
			bean=ExamDAO.SelectExam(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(bean.isCorrect())
		{
			int id=bean.getPaperID();
			//System.out.println("=============>"+exam+"<==============");
			 if(exam.equalsIgnoreCase("java"))
			 {
				 String paper="javaPaper"+id+".jsp";
				 //System.out.println("=============>"+paper+"<==============");
				 RequestDispatcher rd=request.getRequestDispatcher(paper);
				 rd.forward(request, response);
			 }
			 else if(exam.equalsIgnoreCase("net"))
			 {
				 String paper="netPaper"+id+".jsp";
				 RequestDispatcher rd=request.getRequestDispatcher(paper);
				 rd.forward(request, response);
			 }
			 else if(exam=="html")
			 {
				 String paper="htmlPaper"+id+".jsp";
				 bean.setPaper(paper);
				 RequestDispatcher rd=request.getRequestDispatcher(paper);
				 rd.forward(request, response);
			 }
		}
		else
		{
			out.print("<body bgcolor=cyan><h2 style='font-color:red;font-family:verdana'>Sorry..! Login failed</h2>");
			out.print("<a href='Signin.jsp'>Re-login</a><br><br>");
			out.print("<a href='register.jsp'>New user..?</a> </body>");
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
